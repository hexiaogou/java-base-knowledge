package com.jie.java_concurrent.thread_safe.no_sync_method;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hexiaogou
 * @classname StackClosedExample
 * @description TODO
 * @date 2022/1/24 14:50
 */
public class StackClosedExample {
    private final static int CIRCLE_NUMS = 100;

    public void add100() {
        int cnt = 0;
        for (int i = 0; i < CIRCLE_NUMS; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception{
        StackClosedExample example = new StackClosedExample();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->{example.add100();});
        service.execute(()->{example.add100();});
        service.shutdown();
    }
}
