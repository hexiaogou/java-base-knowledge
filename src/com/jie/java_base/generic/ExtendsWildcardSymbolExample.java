package com.jie.java_base.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtendsWildcardSymbolExample {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(1, 2);
        int n = add(p);
        System.out.println(n);

        List<String> strList = new ArrayList<>();
        List<Number> lists = Arrays.asList(1, 12.4, -8, 34.88888, 0.345);
        extendsWildcardUsage(lists);
    }

    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
//        p.setFirst(null);
//        p.setFirst(new Integer(first.intValue() + 100));
//        p.setFirst(first);
//        p.setLast(new Integer(last.intValue() + 100));
        return first.intValue() + last.intValue();
    }

    private static void extendsWildcardUsage(List<? extends Number> lists) {
        int sum = 0;
        for (Number child : lists) {
            sum += child.intValue();
        }
        System.out.println(sum);
    }

    private static void extendsWildcardLimitT() {

    }
}
