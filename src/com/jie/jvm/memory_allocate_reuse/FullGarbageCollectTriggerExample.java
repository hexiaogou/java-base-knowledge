package com.jie.jvm.memory_allocate_reuse;

/**
 * @author hexiaogou
 * @classname FullGarbageCollectTriggerExample
 * @description TODO
 * @date 2022/1/26 13:32
 */
public class FullGarbageCollectTriggerExample {
    public static void main(String[] args) {
        callGc();

        ClassLoader classLoader = null;
    }

    private static void callGc() {
        System.gc();
    }
}
