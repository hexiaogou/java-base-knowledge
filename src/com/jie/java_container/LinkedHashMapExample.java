package com.jie.java_container;

import cn.hutool.cache.impl.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author hexiaogou
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>(16);
        LRUCacheUse();
    }

    private static void LRUCacheUse() {
        LRUCache<Integer, Object> cache = new LRUCache<Integer, Object>(6);
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.get(1);
        cache.put(4, "d");
        System.out.println(cache.keySet());
    }
}
