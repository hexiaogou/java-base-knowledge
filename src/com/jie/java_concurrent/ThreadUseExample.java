package com.jie.java_concurrent;

import com.jie.java_concurrent.thread_use.MyCallable;
import com.jie.java_concurrent.thread_use.MyRunnable;
import com.jie.java_concurrent.thread_use.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author hexiaogou
 */
public class ThreadUseExample {
    public static void main(String[] args) throws Exception {
        myRunnableInstance();
        myCallableInstance();
    }

    private static void myRunnableInstance() {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void myCallableInstance() throws InterruptedException, ExecutionException {
        MyCallable callable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(callable);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }

    private static void myThreadInstance() {
        MyThread thread = new MyThread();
        thread.start();
    }
}
