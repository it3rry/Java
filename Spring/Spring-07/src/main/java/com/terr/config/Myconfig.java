package com.terr.config;


import com.terr.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //component
public class Myconfig {

    //这个注解代表注册了Bean,相当与 xml中的 <bean .../>
    //方法的名字相当与id, 返回值相当于class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
