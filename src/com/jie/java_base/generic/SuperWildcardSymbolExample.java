package com.jie.java_base.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuperWildcardSymbolExample {
    public static void main(String[] args) {
        Pair<Number> p1 = new Pair<>(12.3, 4.56);
        Pair<Integer> p2 = new Pair<>(123, 456);

        setSame(p1, 100);
        setSame(p2, 100);
        System.out.println(p1.getFirst() + "," + p1.getLast());
        System.out.println(p2.getFirst() + "," + p2.getLast());

        collectionsCopyUse();

        unBoundedWildcardType();
    }

    static void set(Pair<? super Integer> p, Integer first, Integer last) {
        p.setFirst(first);
        p.setLast(last);
    }

    static void setSame(Pair<? super Integer> p, Integer n) {
        p.setFirst(n);
        p.setLast(n);

//        Integer x = p.getFirst();
    }

    private static void collectionsCopyUse() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Number> numList = Arrays.asList(1, 1, 1, 1, 1, 1);

        // PECS principle-Producer Extends Consumer Super
        Collections.copy(numList, intList);
        System.out.println(numList);
    }

    private static void unBoundedWildcardType() {
        Pair<Integer> pair = new Pair<>(null, 13);
        System.out.println(pairIsNull(pair));

        Pair<?> p = pair;
        System.out.println(pair.getLast() + "," + p.getLast());
    }

    static boolean pairIsNull(Pair<?> p) {
        return p.getFirst() == null || p.getLast() == null;
    }
}
