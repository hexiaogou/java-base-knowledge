package com.jie.java_base.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeErasureExample {
    public static void main(String[] args) {
//        genericsLimits();
        genericsInherit();
    }

    public class PairOfCompilerCanSee<T> {
        private T first;
        private T last;

        public PairOfCompilerCanSee(T first, T last) {
            this.first = first;
            this.last = last;
        }

        public T getFirst() {
            return first;
        }

        public T getLast() {
            return last;
        }

    }

    public class PairOfJavaVirtualMachineCanSee {
        private Object first;
        private Object last;

        public PairOfJavaVirtualMachineCanSee(Object first, Object last) {
            this.first = first;
            this.last = last;
        }

        public Object getFirst() {
            return first;
        }

        public Object getLast() {
            return last;
        }
    }

    private static void genericsLimits() {
        Pair<Integer> pairWrapperType = new Pair<>(1, 2);
//        Pair<int> pairUnWrapperType = new Pair<int>(1,2);

        Pair<String> p1 = new Pair<>("hello", "world");
        Pair<Integer> p2 = new Pair<>(123, 456);

        Class c1 = p1.getClass();
        Class c2 = p2.getClass();

        System.out.println(c1 == c2);
        System.out.println(c1 == Pair.class);

//        System.out.println(p1 instanceof Pair<Integer>);
    }

    private static void instanceT() {
        TInstanceByReflect<String> instanceByReflect = new TInstanceByReflect<>(String.class);
    }


    private static void genericsInherit() {
        Class<IntPair> clz = IntPair.class;
        Type t = clz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments();
            Type firstType = types[0];
            Class<?> typeClass = (Class<?>) firstType;
            System.out.println(typeClass);
        }
    }
}
