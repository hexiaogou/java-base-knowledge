package com.jie.java_concurrent.sync;

/**
 * @author hexiaogou
 */
public class SynchronizedClass {
    private static final int CIRCLE_NUMS = 10;

    public void func() {
        synchronized (SynchronizedClass.class) {
            for (int i = 0; i < CIRCLE_NUMS; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(i + " ");
            }
        }
    }

    public synchronized static void func(Object o){

    }
}
