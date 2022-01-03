package com.jie.java_concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class ThreadUnsafeExample {
    private int cnt = 0;

    void add() {
        cnt++;
    }

    int get() {
        return cnt;
    }

    public static void main(String[] args) throws Exception{
        final int threadSize = 1000;
        final CountDownLatch countDownLatch= new CountDownLatch(threadSize);
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(()->{
                example.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(example.get());
    }
}
