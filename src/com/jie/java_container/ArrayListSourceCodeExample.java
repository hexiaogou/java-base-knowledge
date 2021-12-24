package com.jie.java_container;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hexiaogou
 */
public class ArrayListSourceCodeExample {
    public static void main(String[] args) {
//        ArrayList arrayList = null;
//        growNums();
        systemCopy();
    }

    private static void growNums() {
        int oldCapacityOne = 2;
        int oldCapacityTwo = 3;
        System.out.println(oldCapacityOne + (oldCapacityOne >> 1));
        System.out.println(oldCapacityTwo + (oldCapacityTwo >> 1));
    }

    private static void systemCopy() {
        Object[] objects = new Object[3];
        System.out.println("origin length:" + objects.length);
        objects = Arrays.copyOf(objects, 4);
        System.out.println("grow length:" + objects.length);


        objects[0] = 1;
        objects[1] = 2;
        objects[2] = 3;
        objects[3] = 4;
        System.out.println(Arrays.toString(objects));
        System.arraycopy(objects, 2, objects, 1, 2);
        objects[objects.length - 1] = null;
        System.out.println(Arrays.toString(objects));
    }
}
