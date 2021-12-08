package com.jie.java_base.reflect.access_inherit;

import sun.misc.BASE64Encoder;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.Serializable;


public class AccessInheritRelationExample {
    public static void main(String[] args) {
//        getParentClass();
//        getInterface();
        inheritRelation();

    }

    private static void getParentClass() {
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
    }

    private static void getInterface() {
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class i : is) {
            System.out.println(i);
        }
        System.out.println(DataInputStream.class.getSuperclass());
        System.out.println(Closeable.class.getSuperclass());
        System.out.println(Closeable.class.getInterfaces());// parent's interface of interface
    }

    private static void inheritRelation() {
//        Object n = Integer.valueOf(134);
//        System.out.println(n instanceof Double);
//        System.out.println(n instanceof Integer);
//        System.out.println(n instanceof Number);
//        System.out.println(n instanceof Serializable);

        System.out.println(Integer.class.isAssignableFrom(Integer.class));
        System.out.println(Number.class.isAssignableFrom(Integer.class));
        System.out.println(Integer.class.isAssignableFrom(Number.class));
    }
}
