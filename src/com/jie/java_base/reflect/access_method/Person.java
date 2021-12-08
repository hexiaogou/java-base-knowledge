package com.jie.java_base.reflect.access_method;

public class Person {
    String name;

    public String getName() {
        return "Person";
    }

    private void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("Person.hello");
    }
}
