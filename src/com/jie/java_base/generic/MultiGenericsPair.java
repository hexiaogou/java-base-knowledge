package com.jie.java_base.generic;

public class MultiGenericsPair<K, V> {
    K first;
    V last;

    public MultiGenericsPair(K first, V last) {
        this.first = first;
        this.last = last;
    }

    public K getFirst() {
        return first;
    }

    public V getLast() {
        return last;
    }

    public static <M, N> MultiGenericsPair<M, N> create(M first, N last) {
        return new MultiGenericsPair<>(first, last);
    }

    @Override
    public String toString() {
        return "MultiGenericsPair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
