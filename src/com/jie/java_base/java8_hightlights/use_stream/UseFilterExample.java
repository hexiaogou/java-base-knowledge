package com.jie.java_base.java8_hightlights.use_stream;

import java.time.DayOfWeek;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseFilterExample {
    public static void main(String[] args) {
        List<Integer> natualNums = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(natualNums);

        Stream.generate(new LocalDateSupplier()).limit(31).filter(ldt->ldt.getDayOfWeek()== DayOfWeek.SATURDAY||ldt.getDayOfWeek()==DayOfWeek.SUNDAY).forEach(System.out::println);
    }
}
