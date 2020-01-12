package com.terr.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价与在xml中注册bean
@Component
public class User {

    @Value("iTerry")
    public  String name;
}
