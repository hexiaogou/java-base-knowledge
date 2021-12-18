package com.jie.java_base.java8_hightlights.use_stream;

import java.util.*;
import java.util.stream.Stream;

public class UseReduceExample {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4).reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);

        Optional<Integer> opt = Stream.of(1, 1, 3).reduce((acc, n) -> acc + n);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

        int product = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1, (acc, n) -> acc * n);
        System.out.println(product);

        List<String> props = Arrays.asList("profile=native", "debug=true", "logging=warn", "interval=3000");
        Map<String, String> map = props.stream()
                .map(kv -> {
                    String[] ss = kv.split("\\=", 2);
                    return Collections.singletonMap(ss[0], ss[1]);
                })
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    m.putAll(kv);
                    return m;
                });
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

    }

}
