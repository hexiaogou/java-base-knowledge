package com.jie.java_container.design_patttern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * @author hexiaogou
 * @description 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
public class AdapterPatternExample {
    public static void main(String[] args) {
//        Callable<Long> task = new Task(123450000L);
//        Thread thread = new Thread(task);

        Callable<Long> task = new Task(123450000L);
        Thread thread = new Thread(new RunnableAdapter(task));
        thread.start();

        javaStandardLibraryUse();
    }

    private static void javaStandardLibraryUse() {
        String[] arr = new String[]{"Good", "Morning", "Bob", "And", "Alice"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
    }
}
