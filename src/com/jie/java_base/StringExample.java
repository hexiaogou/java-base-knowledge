package com.jie.java_base;

public class StringExample {
    public static void main(String[] args) {
//        stringPool();
        newString();
    }

    private static void stringLiteral() {
        String str = "123";
    }

    private static void stringPool() {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);

        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3 == s4);

        String s5 = "bbb";
        String s6 = "bbb";
        System.out.println(s5 == s6);
    }

    private static void newString() {
        String str = new String("abc");
    }
}
