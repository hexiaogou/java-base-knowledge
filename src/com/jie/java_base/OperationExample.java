package com.jie.java_base;

public class OperationExample {
    public static void main(String[] args) {
        implicitTypeTransfer();
        switchUse();
    }

    private static void floatAndDouble() {
        //float f = 1.1;
        float f = 1.1f;
    }

    private static void implicitTypeTransfer() {
        short s = 1;
        //s = s + 1;
        s += 1;
        s++;
        System.out.println(s);
    }

    private static void switchUse() {
        String a = "a";
        switch (a) {
            case "a":
                System.out.println("aaa");
                break;
            case "b":
                System.out.println("bbb");
                break;
            default:
        }

//        long x = 111;
//        switch (x){
//
//        }
    }
}
