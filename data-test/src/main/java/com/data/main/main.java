package com.data.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.data.main.controller", "com.data.main.service.impl", "com.data.main.dataSource"})
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages={"com.data.main.mapper"})
public class main {
    /***
     * springboot启动方法,如果需要发布需要打包jar包，直接发布到服务器tomcate中
     * 
     * @ComponentScan 这个注解是用于扫描这个包下的controller文件
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }

    /*** 返回jsp页面必须继承SpringBootServletInitializer类重写里面的方法 ***/
    protected SpringApplicationBuilder config(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(main.class);
    }
}
