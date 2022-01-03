package com.jie.java_concurrent.java_memory_model;

/**
 * @author hexiaogou
 * @classname MutexLock
 * @description TODO
 * @date 2022/1/4 07:47
 */
public class MutexLock {
    private int cnt = 0;

    public synchronized void add() {
        cnt++;
    }

    public synchronized int get() {
        return cnt;
    }
}
