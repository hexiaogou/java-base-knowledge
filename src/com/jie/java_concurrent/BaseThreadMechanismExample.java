package com.jie.java_concurrent;

import com.jie.java_concurrent.thread_use.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class BaseThreadMechanismExample {
    private static final int CACHED_THREAD_POOL_NUMS = 5;

    public static void main(String[] args) {
        executorUse();
    }

    private static void executorUse() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < CACHED_THREAD_POOL_NUMS; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();

//        executorService = Executors.newFixedThreadPool(10);
//        executorService=Executors.newSingleThreadExecutor();
    }

    private static void daemonUse(){
        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);
    }

    private static void sleepUse(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void yieldUse(){
        Thread.yield();
    }
}
