package com.jie.java_container.design_patttern;

import com.jie.java_base.inherit.call_seq.A;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hexiaogou
 */
public class ArrayListSourceCodeAnalysis {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        someStrangeOptInArrayList();
    }

    private static void someStrangeOptInArrayList() {
        int oldCapacity = 10;
        System.out.println(oldCapacity >> 1);
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE - 8));
    }
}
