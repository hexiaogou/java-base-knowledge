package com.jie.java_base.reflect.access_method;

import java.lang.reflect.Method;

public class MethodAccessExample {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

        callMethod();
        callStaticMethod();
        callNotPublicMethod();
        callPolymorphismMethod();
    }

    private static void callMethod() throws Exception {
        System.out.println("-------------------");
        String s = "hello world";
        Method m = s.getClass().getMethod("substring", int.class, int.class);
        String r = (String) m.invoke(s, 3, 5);
        System.out.println(r);
        System.out.println("-------------------");
    }

    private static void callStaticMethod() throws Exception{
        System.out.println("--------------------");
        Method m = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m.invoke(null,"1234");
        System.out.println(n);
        System.out.println("--------------------");
    }

    private static void callNotPublicMethod() throws Exception{
        System.out.println("---------------------");
        Person p = new Person();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p,"heXiaoGou");
        System.out.println(p.name);
        System.out.println("---------------------");
    }

    private static void callPolymorphismMethod() throws Exception{
        System.out.println("---------------------");
        Person p = new Person();
        Method m = p.getClass().getMethod("hello");
        m.invoke(new Student());
        System.out.println("---------------------");
    }
}
