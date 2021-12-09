package com.jie.java_base.exception;

public class throwExceptionExample {
    public static void main(String[] args) throws Exception{
//        exceptionSpread();
//        throwException();
//        tryCatchFinally();
        exceptionSuppressed();
    }

    private static void exceptionSpread() {
        try {
            process2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void process2() {
        process1();
    }

    static void process1() {
        Integer.parseInt(null);
    }

    private static void throwException() {
        try {
            process3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void process3() {
        try {
            process4();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process4() {
        throw new NullPointerException();
    }

    private static void tryCatchFinally() {
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            System.out.println("catch");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }
    }

    private static void exceptionSuppressed() throws Exception {
        Exception origin = null;
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            e.addSuppressed(origin);
            throw e;
        }
    }
}
