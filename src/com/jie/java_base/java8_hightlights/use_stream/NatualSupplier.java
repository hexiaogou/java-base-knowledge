package com.jie.java_base.java8_hightlights.use_stream;

import java.util.function.Supplier;

public class NatualSupplier implements Supplier<Integer> {
    int n;

    @Override
    public Integer get() {
        n++;
        return n;
    }
}
