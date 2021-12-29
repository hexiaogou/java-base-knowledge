package com.jie.java_concurrent;

import com.jie.java_concurrent.thread_cooperate.AwaitSignalExample;
import com.jie.java_concurrent.thread_cooperate.JoinExample;
import com.jie.java_concurrent.thread_cooperate.WaitNotifyExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 */
public class ThreadCooperateExample {
    public static void main(String[] args) {
//        joinUse();
//        waitNotifyUse();
        awaitSignalUse();
    }

    private static void joinUse(){
        JoinExample example = new JoinExample();
        example.test();
    }

    private static void waitNotifyUse(){
        WaitNotifyExample example = new WaitNotifyExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->example.after());
        executorService.execute(()->example.before());
    }

    private static void awaitSignalUse(){
        AwaitSignalExample example = new AwaitSignalExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->example.after());
        executorService.execute(()->example.before());
    }
}
