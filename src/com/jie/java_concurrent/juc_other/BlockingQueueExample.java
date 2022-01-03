package com.jie.java_concurrent.juc_other;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author hexiaogou
 */
public class BlockingQueueExample {

    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    private static class Producer extends Thread {
        @Override
        public void run() {
            try {
                queue.put("product");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("produce..");
        }
    }

    private static class Consumer extends Thread {
        @Override
        public void run() {
            try {
                String product = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("consume..");
        }
    }

    public static void main(String[] args) {
        int producerOneNums = 2;
        for (int i = 0; i < producerOneNums; i++) {
            Producer producer = new Producer();
            producer.start();
        }
        int consumerOneNums = 6;
        for (int i = 0; i < consumerOneNums; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
        }
        int producerTwoNums = 3;
        for (int i = 0; i < producerTwoNums; i++) {
            Producer producer = new Producer();
            producer.start();
        }
    }
}
