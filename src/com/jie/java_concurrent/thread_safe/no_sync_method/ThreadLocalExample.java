package com.jie.java_concurrent.thread_safe.no_sync_method;

/**
 * @author hexiaogou
 * @classname ThreadLocalExample
 * @description TODO
 * @date 2022/1/24 15:03
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();

        Thread thread1 = new Thread(() -> {
            threadLocal.set(1);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
            threadLocal.remove();
        });

        Thread thread2 = new Thread(()->{
            threadLocal.set(2);
            threadLocal.remove();
        });

        thread1.start();
        thread2.start();
    }
}
