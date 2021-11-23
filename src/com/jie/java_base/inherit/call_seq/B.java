package com.jie.java_base.inherit.call_seq;

import com.jie.java_base.inherit.call_seq.A;

public class B extends A {
    @Override
    public void show(A obj){
        System.out.println("B.show(A)");
    }
}
