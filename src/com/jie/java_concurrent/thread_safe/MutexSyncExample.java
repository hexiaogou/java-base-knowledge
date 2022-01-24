package com.jie.java_concurrent.thread_safe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @classname MutexSyncExample
 * @description TODO
 * @date 2022/1/5 10:53
 * @author hexiaogou
 */
public class MutexSyncExample {
    public static void main(String[] args) {
        AtomicInteger atomicInteger=new AtomicInteger();
        atomicInteger.incrementAndGet();
    }
}
