package com.jie.java_base.annotation;

import com.sun.istack.internal.NotNull;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Report(type = 1, level = "debug")
@Report(type = 2, level = "info")
@Resource(name = "hello")
public class Hello {

    @PostConstruct
    public void hello(String name) {
        System.out.println("hello:" + name);
    }

    @Override
    public String toString() {
        return "Hello";
    }


    public void helloWorld(@NotNull String name, @NotNull String prefix) {
        System.out.println("hello world:" + prefix + name);
    }

    public static void main(String[] arxgs) {
        System.out.println("hello");
        ;
    }
}
