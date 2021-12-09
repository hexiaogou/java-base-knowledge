package com.jie.java_base.exception;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class JavaExceptionExample {
    public static void main(String[] args) {
        captureException();
    }

    private static void captureException() {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes(StandardCharsets.UTF_8);
        }
    }
}
