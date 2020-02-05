package com.terr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")//多级路径
public class HelloController {

    @RequestMapping("/hello")//这里面是浏览器中请求的,是在浏览器框中输入的
    public  String hello(Model model){
        //向模型中添加属性值,可以直接在jsp页面渲染,就是取出msg
        model.addAttribute("msg", "Hello,SpringMVCannotation");

        return  "hello";
        //会被视图解析器处理,这里的hello也不是普通的字符串,而是一个页面
        //视图解析器 通过拼接字符串(前缀,后缀,位置等),选择对应的jsp

    }
}
