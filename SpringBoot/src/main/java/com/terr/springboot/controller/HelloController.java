package com.terr.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//类上的标签(注解)是标志
@RestController
public class HelloController {

    //接口: localhost:8081/hello
    @RequestMapping("/hello")
    public String hello(){
        //调用业务,接受前端的参数
        return "hello,world";
    }
}
