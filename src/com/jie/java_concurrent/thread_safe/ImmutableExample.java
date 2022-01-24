package com.jie.java_concurrent.thread_safe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hexiaogou
 * @classname ImmutableExample
 * @description TODO
 * @date 2022/1/5 10:48
 */
public class ImmutableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unModifyMap = Collections.unmodifiableMap(map);
        unModifyMap.put("1", 1);
        System.out.println(unModifyMap);
    }
}
