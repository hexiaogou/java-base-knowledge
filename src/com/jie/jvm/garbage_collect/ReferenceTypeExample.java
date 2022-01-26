package com.jie.jvm.garbage_collect;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author hexiaogou
 * @classname ReferenceTypeExample
 * @description TODO
 * @date 2022/1/25 15:11
 */
public class ReferenceTypeExample {
    public static void main(String[] args) {

    }

    private static void strongReference() {
        Object obj = new Object();
        obj = null;
    }

    private static void softReference() {
        Object obj = new Object();
        SoftReference<Object> sf = new SoftReference<>(obj);
        obj = null;
    }

    private static void weakReference() {
        Object obj = new Object();
        WeakReference<Object> wf = new WeakReference<>(obj);
        obj = null;
    }

    private static void phantomReference(){
        Object obj = new Object();
        PhantomReference<Object> pf = new PhantomReference<>(obj,null);
        obj =null;
    }
}
