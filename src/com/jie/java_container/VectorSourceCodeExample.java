package com.jie.java_container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author hexiaogou
 */
public class VectorSourceCodeExample {
    public static void main(String[] args) {
        Vector vector = null;
    }

    private static void replaceSynchronizedVectorInArrayList() {
        List<String> list = new ArrayList<>();
        //method one
        List<String> syncList = Collections.synchronizedList(list);
        //method two
        List<String> syncs = new CopyOnWriteArrayList<>();
    }
}
