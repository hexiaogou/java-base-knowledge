package com.jie.java_concurrent.java_memory_model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @classname AtomicClass
 * @description TODO
 * @date 2022/1/4 07:40
 * @author hexiaogou
 */
public class AtomicClass {
    private AtomicInteger cnt = new AtomicInteger();

    void add(){
        cnt.incrementAndGet();
    }

    int get(){
        return cnt.get();
    }
}
