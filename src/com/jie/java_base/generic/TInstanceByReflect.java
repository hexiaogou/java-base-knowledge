package com.jie.java_base.generic;

public class TInstanceByReflect<T> {
    private T first;
    private T last;

    public TInstanceByReflect(Class<T> tClass) {
        try {
            this.first = tClass.newInstance();
            this.last = tClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

//    public boolean equals(T t) {
//        return this == t;
//    }

    public boolean same(T t) {
        return this == t;
    }
}
