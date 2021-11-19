package com.jie.java_base.keywords;

public class A {
    static {
        System.out.println("123");
    }
    private int x;
    private static int y;
    public int a;

    public static void main(String[] args) {
        A aa = new A();
        int x = aa.x;
        int y = A.y;
        A ab = new A();
    }

    public static void func1(){
        int y = A.y;
//        int x = x;
    }
}
