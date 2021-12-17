package com.jie.java_base.annotation;

public class AnotherPerson {
    @MyRange(min = 10,max = 25)
    public String name;

    @MyRange(min = 15)
    public String city;
}
