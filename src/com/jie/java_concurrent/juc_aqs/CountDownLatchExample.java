package com.jie.java_concurrent.juc_aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class CountDownLatchExample {
    public static void main(String[] args)throws IllegalArgumentException,InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch= new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("run..");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("end..");
        executorService.shutdown();
    }
}
