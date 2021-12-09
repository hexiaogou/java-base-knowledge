package com.jie.java_base.exception;

import com.jie.java_base.exception.located.Person;

import java.util.Locale;
import java.util.Optional;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        if (!readLinesFromFile("file").isPresent()) {
            System.out.println("Option replace null where someone must want to judge by null");
        }

        // in java14 null Object detail info will be showed
        // but this function is closed default
        // you can add param '-XX:+ShowCodeDetailsInExceptionMessages' in JVM when you start your project
        locatedNullPointerException();
    }

    private static Optional<String> readLinesFromFile(String file) {
        return Optional.empty();
    }

    private static void locatedNullPointerException() {
        Person p = new Person();
        System.out.println(p.address.zipCode.toLowerCase(Locale.ROOT));
    }

}
