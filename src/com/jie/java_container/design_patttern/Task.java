package com.jie.java_container.design_patttern;

import java.util.concurrent.Callable;

/**
 * @author hexiaogou
 */
public class Task implements Callable<Long> {
    private long num;

    public Task(long num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long r = 0;
        for (long n = 1; n <= num; n++) {
            r += n;
        }
        return r;
    }
}
