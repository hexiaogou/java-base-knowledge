package com.jie.jvm.garbage_collect;

/**
 * @author hexiaogou
 * @classname ReferenceCountExample
 * @description TODO
 * @date 2022/1/25 15:08
 */
public class ReferenceCountExample {
    public Object instance = null;

    public static void main(String[] args) {
        ReferenceCountExample a = new ReferenceCountExample();
        ReferenceCountExample b = new ReferenceCountExample();

        a.instance = b;
        b.instance = a;

        a = null;
        b = null;
        System.out.println("recirculate reference...");
    }
}
