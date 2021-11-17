package com.jie.java_base;

public class DataTypeExample {
    public static void main(String[] args) {
        baseDataType();
        dataTypeCachePool();
        charCachePool();
    }

    private static void baseDataType() {
        System.out.println(Byte.SIZE);
        System.out.println(Character.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Long.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Boolean.FALSE);
    }

    private static void dataTypeCachePool() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);

        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf("123");
        System.out.println(z == k);

        Integer m = 123;
        Integer n = 123;
        System.out.println(m == n);
    }

    private static void charCachePool() {
        for (int i = Integer.parseInt("0000", 16); i <= Integer.parseInt("007F", 16); i++) {
            char temp = (char) i;
            System.out.println(temp);
        }
    }
}
