package com.jie.java_container;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hexiaogou
 * @description use java 1.7 to explain source code for understanding well
 */
public class HashMapExample {
    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<>(16);
//        hashMapMaxCapacity();
//        bucketIndex();
        tableSizeFor();
    }

    private static void zipFuncPrinciple() {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("K1", "V1");
        map.put("k2", "V2");
        map.put("K3", "V3");
    }

    private static void hashMapMaxCapacity() {
        System.out.println(1 << 30);
    }


    private static void bucketIndex() {
        // x = 2^n
        int y = 10;
        int x = 8;
        int index = 10 % 8;
        int indexQuickGet = y & (x - 1);
        System.out.println(index);
        System.out.println(indexQuickGet);
    }

    private static void tableSizeFor() {
        int cap = 1;
        System.out.println(1 >>> 1);

        int mask = Integer.parseInt("10010000", 2);
        System.out.println(Integer.toBinaryString(mask));
        mask |= mask >>> 1;
        System.out.println(Integer.toBinaryString(mask));
        mask |= mask >>> 2;
        System.out.println(Integer.toBinaryString(mask));
        mask |= mask >>> 4;
        System.out.println(Integer.toBinaryString(mask));
    }


}
