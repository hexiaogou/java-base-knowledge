package com.jie.java_base.generic;

import java.lang.reflect.Constructor;

public class WildcardSymbolAndReflect {
    public static void main(String[] args) throws Exception {
//        javaPartApi();
//        wildcardArr();
        noSafeUseWildcardArr();
    }

    private static void javaPartApi() throws InstantiationException, IllegalAccessException, NoSuchMethodException, ReflectiveOperationException {
        Class clz = String.class;
        String str = (String) clz.newInstance();

        Class<String> clz1 = String.class;
        String str1 = (String) clz1.newInstance();


        Class<Integer> clzz = Integer.class;
        Constructor<Integer> cons = clzz.getConstructor(int.class);
        int i = cons.newInstance(13);
        System.out.println(i);
    }

    private static void wildcardArr() {
        //can declare
        Pair<String>[] ps = null;
        //can't create use new
        //Pair<String>[] errPs = new <String>Pair[2];
        //must use typecast
        @SuppressWarnings("uncheck")
        Pair<String>[] pss = (Pair<String>[]) new Pair[2];

        System.out.println(pss.getClass() == Pair[].class);
    }

    private static void noSafeUseWildcardArr() {
        Pair[] arr = new Pair[2];
        Pair<String>[] ps = (Pair<String>[]) arr;

        ps[0] = new Pair<String>("he", "gou");
        arr[1] = new Pair<Integer>(1, 2);

        Pair<String> p = ps[1];
        String s = p.getFirst();
        System.out.println(s);
    }
}
