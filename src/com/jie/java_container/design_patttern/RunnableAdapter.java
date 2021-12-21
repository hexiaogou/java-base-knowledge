package com.jie.java_container.design_patttern;

import java.util.concurrent.Callable;

/**
 * @author hexiaogou
 */
public class RunnableAdapter implements Runnable {
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            Object o = callable.call();
            System.out.println(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
