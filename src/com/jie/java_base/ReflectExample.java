package com.jie.java_base;

import java.time.Month;
import java.util.Objects;

public class ReflectExample {
    public static void main(String[] args) {
//        getClassInstance();
//        diffBetweenClassInstanceAndInstanceOf();
        testClassBaseInfo();
    }

    private static void getClassInstance() {
        Class cls1 = ReflectExample.class;
        System.out.println(cls1);

        ReflectExample r = new ReflectExample();
        Class cls2 = r.getClass();
        System.out.println(cls2);

        Class cls3 = null;
        try {
            cls3 = Class.forName("com.jie.java_base.ReflectExample");
            System.out.println(cls3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
    }


    private static void diffBetweenClassInstanceAndInstanceOf() {
        Integer n = new Integer(1234);
        System.out.println(n instanceof Integer);
        System.out.println(n instanceof Number);

        System.out.println(n.getClass() == Integer.class);
//        System.out.println(n.getClass() == Number.class);
    }


    private static void printClassBaseInfo(Class cls) {
        System.out.println("*************************************");
        System.out.println("Class Name:" + cls.getName());
        System.out.println("Simple Name:" + cls.getSimpleName());
        if (Objects.nonNull(cls.getPackage())) {
            System.out.println("Package Name:" + cls.getPackage().getName());
        }
        System.out.println("Is Interface:"+cls.isInterface());
        System.out.println("Is enum:"+cls.isEnum());
        System.out.println("Is Array:"+cls.isArray());
        System.out.println("Is primitive:"+cls.isPrimitive());
        System.out.println("*************************************");
    }

    private static void testClassBaseInfo(){
        printClassBaseInfo("".getClass());
        printClassBaseInfo(Runnable.class);
        printClassBaseInfo(Month.class);
        printClassBaseInfo(String[].class);
        printClassBaseInfo(Integer[].class);
        printClassBaseInfo(int.class);
    }
}
