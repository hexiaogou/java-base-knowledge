package com.jie.java_base;

public class ReflectExample {
    public static void main(String[] args) {
        getClassInstance();
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


}
