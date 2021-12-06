package com.jie.java_base.reflect.access_field;

public class FieldAccessExample {
    public static void main(String[] args) throws NoSuchFieldException{
        Class cls = Student.class;
        System.out.println(cls.getField("score").getModifiers());
        System.out.println(cls.getField("name"));
        System.out.println(cls.getDeclaredField("grade"));

    }


}
