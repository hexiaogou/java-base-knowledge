package com.jie.java_container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hexiaogou
 */
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Object> map = new ConcurrentHashMap<>(16);
    }
}
