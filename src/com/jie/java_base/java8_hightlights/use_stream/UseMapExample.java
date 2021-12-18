package com.jie.java_base.java8_hightlights.use_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMapExample {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> ss = s.map(n -> {
            return n * n;
        });
        ss.forEach(System.out::println);

        Arrays.asList("Apple", "Banana", " Orange", "Pear ").stream().map(String::trim).map(String::toLowerCase).forEach(System.out::println);
    }

    private static void steamToList() {
        List<String> fruits =  Arrays.asList("Apple", "Banana", " Orange", "Pear ").stream().map(String::trim).map(String::toLowerCase).collect(Collectors.toList());
    }
}
