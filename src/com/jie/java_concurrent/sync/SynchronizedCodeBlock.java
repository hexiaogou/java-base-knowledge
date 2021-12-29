package com.jie.java_concurrent.sync;

/**
 * @author hexiaogou
 */
public class SynchronizedCodeBlock {
    private static final int CIRCLE_NUMS = 10;

    public void func() {
        synchronized (this) {
            for (int i = 0; i < CIRCLE_NUMS; i++) {
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.print(i + " ");
            }
        }
    }
}
