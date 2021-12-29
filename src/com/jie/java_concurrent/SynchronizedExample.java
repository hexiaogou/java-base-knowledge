package com.jie.java_concurrent;

import com.jie.java_concurrent.sync.SynchronizedClass;
import com.jie.java_concurrent.sync.SynchronizedCodeBlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class SynchronizedExample {
    public static void main(String[] args) {
//        actOnSameObject();
//        actOnDiffObject();
        syncClass();
    }

    private static void actOnSameObject(){
        SynchronizedCodeBlock e1 = new SynchronizedCodeBlock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->e1.func());
        executorService.execute(()->e1.func());
    }

    private static void actOnDiffObject(){
        SynchronizedCodeBlock e1 = new SynchronizedCodeBlock();
        SynchronizedCodeBlock e2 = new SynchronizedCodeBlock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->e1.func());
        executorService.execute(()->e2.func());
    }

    private static void syncClass(){
        SynchronizedClass e1 = new SynchronizedClass();
        SynchronizedClass e2= new SynchronizedClass();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->e1.func());
        executorService.execute(()->e2.func());
    }
}
