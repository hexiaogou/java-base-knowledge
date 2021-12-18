package com.jie.java_base.java8_hightlights.use_stream;

import java.time.LocalDate;
import java.util.function.Supplier;

public class LocalDateSupplier implements Supplier<LocalDate> {
    LocalDate start = LocalDate.of(2021, 1, 1);
    int n = 0;

    @Override
    public LocalDate get() {
        n++;
        return start.plusDays(n);
    }
}
