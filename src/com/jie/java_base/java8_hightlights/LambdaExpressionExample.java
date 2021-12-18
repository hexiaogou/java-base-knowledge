package com.jie.java_base.java8_hightlights;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class LambdaExpressionExample {
    public static void main(String[] args) {
//        arrSortLambdaUse();
//        functionReference();
//        stringTypeFunctionReference();
        constructFunctionReference();
    }

    private static void arrSortLambdaUse() {
        String[] arr = new String[]{"Apple", "Orange", "Banana", "Pear"};
        Arrays.sort(arr, (s1, s2) -> {
            return s1.toLowerCase(Locale.ROOT).compareTo(s2.toLowerCase(Locale.ROOT));
        });
        System.out.println(String.join(",", arr));

        Callable callable = null;
        Comparator comparator = null;
    }

    private static void functionReference() {
        String[] arr = new String[]{"Apple", "Orange", "Banana", "Pear"};
        Arrays.sort(arr, LambdaExpressionExample::cmp);
        System.out.println(String.join(",", arr));
    }

    static int cmp(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }

    private static void stringTypeFunctionReference() {
        String[] arr = new String[]{"Apple", "Orange", "Banana", "Pear"};
        Arrays.sort(arr, String::compareTo);
        System.out.println(String.join(",", arr));
    }

    private static void constructFunctionReference() {
        List<String> names = Arrays.asList("Bob","Alice","Tom");
        List<Person> people = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(people);
    }
}
