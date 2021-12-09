package com.jie.java_base.exception;

import java.util.Optional;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        if (!readLinesFromFile("file").isPresent()) {
            System.out.println("Option replace null where someone must want to judge by null");
        }
    }

    private static Optional<String> readLinesFromFile(String file) {
        return Optional.empty();
    }
}
