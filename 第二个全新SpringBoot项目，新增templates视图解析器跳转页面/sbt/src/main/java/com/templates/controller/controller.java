package com.templates.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.templates.pojo.Entry;

//这个注解不能使用RestController，不然会返回模板类型的页面
//@RestController
@Controller
@RequestMapping(value = "/springB")
//@EnableAutoConfiguration
@EnableConfigurationProperties({Entry.class})
@PropertySource("classpath:com/config/springbootapplication/application.properties")
public class controller {
    
    @Autowired
    Entry entry;
//
//    @Value("com/config/springbootappliaction/${name}")
//    private String name;
// 
//    @Value("${age}")
//    private String age;
//
//    @Value("${six}")
//    private String six;
    
    /*************/
    @Value("${sb}")
    private String loginjspcontroller;
    /*************/
    
    /***
     * SpringBoot默认读取配置文件<appliction.properties>文件是在src/main/resources位置
     * 那么我们可以通过@PropertySource注解来指定读取配置文件，并且通过@Value来获取相应的值
     * 然后再赋值给申明变量，传递给方法体。这样就实现了我们方法体"动态"获取值
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = "/{loginjspcontroller}")
    public String loginjsp() throws UnsupportedEncodingException {
         String flag = "姓名:"+ entry.getName() + "年龄:" + entry.getAge() + "性别:" + entry.getSix();
        return "SpringBoot";
    }
    
    /***
     * 通过创建pojo，并且对相应的pojo整体赋值具体参考 Entry.class。
     * 这里有提别需要注明的是 在启动方法类中需要加注@EnableConfigurationProperties 来指定你的实体。这样才能获取到实体值
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/Students")
    public String getStudents() throws UnsupportedEncodingException {
        return "姓名:"+ entry.getName() + "年龄:" + entry.getAge() + "性别:" + entry.getSix();
    }
    
    /****
     *  springboot + templates解析器
     *   templates解析器默认的html解析位置静态文件解析位置
     *      <html>  src/main/resources/templates
     *      css等    src/main/resources/static 
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/st")
    public String getStudentsJsp() throws UnsupportedEncodingException {
        return "students";
    }
    

    /*****
     * 通过new ModelAndView来通知templates获取html
     * 同样，也可以不new ModelAndView,templates也可以解析html参考下面一个方法
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/view")
    public ModelAndView showview() throws UnsupportedEncodingException {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("name", "index");
        Entry entry = new Entry();
        mv.addObject("user", entry);
        return mv;
    }
    
    /***
     * 直接跳login.html。
     * 通过application.properties来重新指定templates读取html路径或者静态资源
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/login")
    public String getlogin() throws UnsupportedEncodingException {
        return "login";
    }
    
    
}
