package com.jie.java_base.reflect.access_construct;

import java.lang.reflect.Constructor;

public class ConstructorExample {
    public static void main(String[] args) throws Exception{
        Constructor cons1 = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer) cons1.newInstance(134);
        System.out.println(n1);

        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("134");
        System.out.println(n2);

    }
}
