package com.jie.java_concurrent.thread_use;

import java.util.concurrent.Callable;

/**
 * @author hexiaogou
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 123;
    }
}
