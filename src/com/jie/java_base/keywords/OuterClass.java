package com.jie.java_base.keywords;

public class OuterClass {
    class InnerClass{

    }

    static class StaticInnerClass{

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
