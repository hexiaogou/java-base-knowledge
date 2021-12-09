package com.jie.java_base.exception;

public class AssertUseExample {
    public static void main(String[] args) {
        double x = -0.5;
        assert x > 0 : "x must be > 0";
        System.out.println(x);
    }
}
