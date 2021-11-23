package com.jie.java_base.inherit;

public class AccessWithInnerClassExample {
    class InnerClass {
        int x;
    }

    private InnerClass innerClass;

    public AccessWithInnerClassExample() {
        innerClass = new InnerClass();
    }

    public int getValue() {
        return innerClass.x;
    }
}
