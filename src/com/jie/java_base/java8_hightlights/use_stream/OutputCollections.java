package com.jie.java_base.java8_hightlights.use_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OutputCollections {
    public static void main(String[] args) {
//        distinctConvertAndAggregate();
//        outputList();
//        outputArr();
//        outputMap();
        groupOutputStudent();
    }

    private static void distinctConvertAndAggregate() {
        Stream<Long> s1 = Stream.generate(new NatualSupplier());
        Stream<Long> s2 = s1.map(n -> n * n);
        Stream<Long> s3 = s2.map(n -> n - 1);
        Stream<Long> s4 = s3.limit(10);
        s4.reduce(0L, (acc, n) -> acc + n);
        System.out.println(s3);
        System.out.println(s4);

    }

    static class NatualSupplier implements Supplier<Long> {
        long n = 0;

        @Override
        public Long get() {
            n++;
            return n;
        }
    }

    private static void outputList() {
        Stream<String> fruitStream = Stream.of("Apple ", "   ", "Banana", null, " Pear", "", "Orange");
        List<String> fruits = fruitStream.filter(s -> s != null && !s.isEmpty() && !s.chars().allMatch(Character::isWhitespace)).map(s -> s.trim()).collect(Collectors.toList());
        System.out.println(fruits);
    }


    private static void outputArr() {
        Stream<String> fruitStream = Stream.of("Apple", "Pear", "Orange", "Banana");
        String[] fruits = fruitStream.toArray(String[]::new);
        System.out.println(Arrays.toString(fruits));
    }

    private static void outputMap() {
        Stream<String> props = Stream.of("AP:apple", "MS:Microsoft", "Num:20", "Date:2021-12-28");
        Map<String, Object> map = props.collect(Collectors.toMap(s1 -> s1.substring(0, s1.indexOf(':')), s2 -> s2.substring(s2.indexOf(':') + 1)));
        System.out.println(map);

        Stream<String> fruits = Stream.of("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = fruits.collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toList()));
        System.out.println(groups);
    }

    private static void groupOutputStudent() {
        List<Student> students = Arrays.asList(new Student(2, 3, "小明", 80),
                new Student(3, 1, "小王", 90),
                new Student(1, 2, "小强", 100),
                new Student(3, 1, "小红", 90),
                new Student(1, 2, "小黄", 100),
                new Student(2, 3, "小黑", 80),
                new Student(1, 2, "小军", 100),
                new Student(2, 3, "小乔", 80),
                new Student(3, 1, "小林", 90));
        Map<Integer, Map<Integer, List<Student>>> groups = students.stream()
                .collect(Collectors.groupingBy(Student::getGradeId, Collectors.groupingBy(Student::getClassId)));

        groups.forEach((k, m) -> {
            System.out.print("Grade:" + k + " ");
            m.forEach((key, value) -> {
                System.out.println("Class:" + key + "=" + value);
            });
        });
    }
}
