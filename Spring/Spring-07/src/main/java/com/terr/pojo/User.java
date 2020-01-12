package com.terr.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.swing.*;

@Controller
public class User {
    public String name;

    public String getName() {
        return name;
    }
    @Value("iTerry")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
