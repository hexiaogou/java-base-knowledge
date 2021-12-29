package com.jie.java_concurrent.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hexiaogou
 */
public class LockExample {
    private static final int CIRCLE_NUMS = 10;
    private Lock lock = new ReentrantLock();

    public void func() {
        lock.lock();
        try {
            for (int i = 0; i < CIRCLE_NUMS; i++) {
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock();
        }
    }
}
