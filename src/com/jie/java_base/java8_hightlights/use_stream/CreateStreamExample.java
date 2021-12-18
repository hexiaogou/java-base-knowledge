package com.jie.java_base.java8_hightlights.use_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
//        createMethodOne();
//        baseOnArrCreateMethod();
//        baseOnSupplierCreateMethod();
//        otherCreateMethod();
//        primitiveDataType();
        fibSupplier();
    }

    private static void createMethodOne() {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        stream.forEach(System.out::println);
    }

    private static void baseOnArrCreateMethod() {
        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
        Stream<String> stream2 = Arrays.asList("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }

    private static void baseOnSupplierCreateMethod() {
        Stream<Integer> natual = Stream.generate(new NatualSupplier());
        natual.limit(20).forEach(System.out::println);
    }

    private static void otherCreateMethod() {
        //read file usefully
        try (Stream<String> lines = Files.lines(Paths.get("README.md"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern p = Pattern.compile("\\s+");
        Stream<String> ss = p.splitAsStream("The quick brown fox jumps over  the lazy dog");
        ss.forEach(System.out::println);
    }

    private static void primitiveDataType() {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3});
        intStream.forEach(System.out::println);
        LongStream longStream = Arrays.asList("1", "2", "3").stream().mapToLong(Long::parseLong);
        longStream.forEach(System.out::println);
    }


    private static void fibSupplier() {
        LongStream longStream = LongStream.generate(new FibSupplier());
        longStream.limit(40).forEach(System.out::println);
    }

    public static class FibSupplier implements LongSupplier {
        long a = 0;
        long b = 1;

        @Override
        public long getAsLong() {
            long c = a;
            a = b;
            b += c;
            return a;
        }
    }
}
