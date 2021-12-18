package com.jie.java_base.java8_hightlights.use_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOtherOperateExample {
    public static void main(String[] args) {
//        sort();
//        duplicateRemoval();
//        clip();
//        merge();
//        flatMap();
        parallelDeal();
    }

    private static void sort() {
        List<String> list = Arrays.asList("Orange", "apple", "Banana")
                .stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void duplicateRemoval() {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B", "D")
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void clip() {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G")
                .stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void merge() {
        Stream<String> s1 = Stream.of("A", "B", "C");
        Stream<String> s2 = Stream.of("D", "E");

        Stream<String> s = Stream.concat(s1, s2);
        System.out.println(s.collect(Collectors.toList()));
    }

    private static void flatMap() {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));
        Stream<Integer> flatRes = stream.flatMap(list -> list.stream());
        System.out.println(flatRes.collect(Collectors.toList()));
    }

    private static void parallelDeal() {
        try (Stream<String> lines = Files.lines(Paths.get("test_stream_parallel.txt"))) {
            long start = System.currentTimeMillis();
            String[] logs = lines.parallel().sorted(String::compareToIgnoreCase).toArray(String[]::new);
            long end = System.currentTimeMillis();
            String consoleLog = "use stream parallel sort time is " + (end - start) / 1000 + "s";
            System.out.println(consoleLog);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get("test_stream_parallel.txt"))) {
            long start = System.currentTimeMillis();
            String[] logs = lines.sorted(String::compareToIgnoreCase).toArray(String[]::new);
            long end = System.currentTimeMillis();
            String consoleLog = "no use stream parallel sort time is " + (end - start) / 1000 + "s";
            System.out.println(consoleLog);
        } catch (IOException e) {

        }
    }

}
