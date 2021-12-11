package com.jie.java_base.generic;

public class OrganizeGenericsExample {
    public static void main(String[] args) {
        genericsStaticFunc();
        multiGenerics();
    }

    private static void genericsStaticFunc() {
        Pair<String> pair = Pair.create("xiaoGou", "laoGou");
        System.out.println(pair);
    }

    private static void multiGenerics(){
        MultiGenericsPair<String,String> pair= MultiGenericsPair.create("xiaoGou","laoGou");
        System.out.println(pair);
    }
}
