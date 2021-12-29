package com.jie.java_concurrent;

import com.jie.java_concurrent.reentrant.LockExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class ReentrantLockExample {
    public static void main(String[] args){
        LockExample e1 = new LockExample();
        LockExample e2 = new LockExample();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->e1.func());
        executorService.execute(()->e1.func());
    }
}
