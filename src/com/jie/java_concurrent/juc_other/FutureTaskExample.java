package com.jie.java_concurrent.juc_other;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author hexiaogou
 */
public class FutureTaskExample {
    private static final int CIRCLE_NUMS = 100;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int res = 0;
                for (int i = 0; i < CIRCLE_NUMS; i++) {
                    Thread.sleep(10);
                    res += i;
                }
                return res;
            }
        });

        Thread computeThread = new Thread(futureTask);
        computeThread.start();

        Thread otherThread = new Thread(() -> {
            System.out.println("Other task is running...");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        otherThread.start();

        System.out.println(futureTask.get());
    }
}
