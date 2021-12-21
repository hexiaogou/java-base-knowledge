package com.jie.java_container.design_patttern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hexiaogou
 * @description 提供一种方法顺序访问一个聚合对象中的各个元素，而又不需要暴露该对象的内部表示。
 */
public class IteratorPatternExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (Iterator<String> iterator = list.listIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        customizeIteratorObject();
    }

    private static void customizeIteratorObject() {
        ReverseArrayCollection<Integer> reverseArrayCollection = new ReverseArrayCollection<>(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = reverseArrayCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
