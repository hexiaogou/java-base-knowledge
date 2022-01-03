package com.jie.java_concurrent.java_memory_model;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 * @classname AtomicClassExample
 * @description TODO
 * @date 2022/1/4 07:39
 */
public class AtomicCharacteristicExample {
    private static final int threadSize = 1000;

    private static final CountDownLatch countDownLatch = new CountDownLatch(threadSize);

    private static final ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception {
        atomicClassUse();
        mutexLockUse();
    }

    private static void atomicClassUse() throws Exception {
        AtomicClass example = new AtomicClass();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                example.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(example.get());
    }


    private static void mutexLockUse() throws Exception{
        final int threadSize = 1000;
        MutexLock example = new MutexLock();
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService1.execute(() -> {
                example.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService1.shutdown();
        System.out.println(example.get());
    }
}
