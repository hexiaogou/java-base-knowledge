package com.jie.java_base.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * can't create wildcard array directly
 **/
public class Abc<T> {
//    T [] createArray(){
//        return new T[5];
//    }

    T[] createArray(Class<T> clz) {
        return (T[]) Array.newInstance(clz, 5);
    }

    @SafeVarargs
    static <T> T[] asArray(T... objs) {
        return objs;
    }

    static <K> K[] pickTwo(K k1, K k2, K k3) {
        return asArray(k1, k2);
    }

    public static void main(String[] args) {
        String[] ss = Abc.asArray("1", "2", "3");
        Integer[] ii = Abc.asArray(1, 2, 3);
        System.out.println(Arrays.toString(ss));
        System.out.println(Arrays.toString(ii));

//        String [] pp = pickTwo("1", "2", "3");
//        System.out.println(Arrays.toString(pp));
    }
}
