package com.jie.java_base.inherit;

public interface InterfaceExample {
    void func1();

    default void func2() {
        System.out.println("func2");
    }

    int x = 200;
    //    int y;
    public int z = 0; //'public' is redundant for interface fields
//    private int k =0;
//    protected int l = 0;
//    private void func();
}
