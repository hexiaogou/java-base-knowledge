package com.jie.java_base.generic;

import java.util.Arrays;

public class UseGenericsExample {
    public static void main(String[] args) {
        genericsInterface();
    }

    private static void genericsInterface() {
        String[] ss = {"Orange", "Apple", "Pear"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Person[] persons = {new Person("xiaoGou", 24),
                new Person("xiaoMao", 21),
                new Person("xiaoJie", 20)};
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
