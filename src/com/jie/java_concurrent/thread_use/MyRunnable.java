package com.jie.java_concurrent.thread_use;

/**
 * @author hexiaogou
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        //...
        System.out.println(System.currentTimeMillis());
    }
}
