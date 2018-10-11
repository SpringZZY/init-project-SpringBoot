package com.data.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.data.main.service.queysso;

@Controller
@RequestMapping(value = "/sbdata")
@PropertySource("classpath:/config/application.properties")
public class controller {

    @Autowired
    queysso queysso;

    /***
     * 测试查询 返回固定值 展示页面
     * 
     * @return
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "测试一,字符串show页面。";
    }

    /***
     * SHOW 页面跳转,视图解析去
     * 
     * @return
     */
    @RequestMapping(value = "/queypage")
    public ModelAndView showpage() {
        System.out.println("******2018、09、28******");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("queysso");
        mv.addObject("name", "queysso");
        return mv;
    }

    /***
     * 查询数据库 把值返回到页面
     * 
     * @return
     */
    @RequestMapping(value = "/queyData")
    public ModelAndView queysso() {

        String name = queysso.querySSoservice();

        ModelAndView mv = new ModelAndView();
        mv.setViewName(name);
        mv.addObject("name", name);

        return mv;
    }

}
