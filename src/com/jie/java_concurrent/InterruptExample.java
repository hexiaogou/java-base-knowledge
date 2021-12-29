package com.jie.java_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class InterruptExample {
    public static void main(String[] args) throws Exception {
//        threadOne();
//        threadTwo();
        executorInterruptOpt();
    }

    private static void threadOne() {
        Thread threadOne = new MyThreadOne();
        threadOne.start();
        threadOne.interrupt();
        System.out.println("Main run...");
    }

    private static void threadTwo() {
        Thread threadTwo = new MyThreadTwo();
        threadTwo.start();
        threadTwo.interrupt();
        System.out.println("Main run...");
    }

    private static void executorInterruptOpt() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        executorService.shutdown();
        System.out.println("Main run...");
    }

    private static class MyThreadOne extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
                System.out.println("Thread run...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class MyThreadTwo extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                //
            }
            System.out.println("Thread end...");
        }
    }

}
