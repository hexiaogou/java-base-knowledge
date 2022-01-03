package com.jie.java_concurrent.juc_other;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author hexiaogou
 */
public class ForkJoinExample extends RecursiveTask<Integer> {
    private final int threshold = 5;
    private int first;
    private int last;

    public ForkJoinExample(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    protected Integer compute() {
        int res = 0;
        if (last - first <= threshold) {
            for (int i = first; i <= last; i++) {
                res += i;
            }
        } else {
            int middle = first + (last - first) / 2;
            ForkJoinExample left = new ForkJoinExample(first, middle);
            ForkJoinExample right = new ForkJoinExample(middle + 1, last);
            left.fork();
            right.fork();

            res = left.join() + right.join();
        }

        return res;
    }

    public static void main(String[] args) throws Exception{
        ForkJoinExample example = new ForkJoinExample(1,1000000);
        ForkJoinPool joinPool = new ForkJoinPool();
        Future res = joinPool.submit(example);
        System.out.println(res.get());

        System.out.println("cpu cores:"+Runtime.getRuntime().availableProcessors());
    }
}
