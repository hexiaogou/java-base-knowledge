package com.jie.java_base.exception;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CaptureExceptionExample {
    public static void main(String[] args) {
//        NumberFormatException  ne = new NumberFormatException();
//        System.out.println(ne instanceof IOException);

//        UnsupportedEncodingException ue = new UnsupportedEncodingException();
//        System.out.println(ue instanceof IOException);

        multiCatchSentence();
        finallySentence();
        captureMultiKindException();
    }

    private static void multiCatchSentence() {
        try {
            process1();
            process2();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Bad Encoding");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }

    static void process1() throws IOException {

    }

    static void process2() throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException("UnsupportedEncodingException");
    }

    static void process3() throws NumberFormatException {

    }

    private static void finallySentence() {
        try {
            process1();
            process2();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Bad Encoding");
        } catch (IOException e) {
            System.out.println("IO Error");
        } finally {
            System.out.println("END");
        }
    }

    private static void captureMultiKindException() {
        try {
            process1();
            process2();
            process3();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Bad input");
        } catch (Exception e){
            System.out.println("Unknown error");
        }
    }
}
