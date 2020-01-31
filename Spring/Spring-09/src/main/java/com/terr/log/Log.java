package com.terr.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {

    }
}
