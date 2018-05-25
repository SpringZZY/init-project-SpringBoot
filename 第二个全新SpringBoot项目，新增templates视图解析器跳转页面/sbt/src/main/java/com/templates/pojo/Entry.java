package com.templates.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bean.student")
@PropertySource("classpath:com/config/bean/bean.properties")
public class Entry {

    private String name;
 
    private String age;

    private char six;
    
    private String pojoctName;

    
    
    public String getPojoctName() {
        return pojoctName;
    }

    public void setPojoctName(String pojoctName) {
        this.pojoctName = pojoctName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public char getSix() {
        return six;
    }

    public void setSix(char six) {
        this.six = six;
    }
    
    
     

}
