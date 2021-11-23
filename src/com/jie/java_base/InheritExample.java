package com.jie.java_base;

import com.jie.java_base.inherit.*;
import com.jie.java_base.inherit.call_seq.A;
import com.jie.java_base.inherit.call_seq.B;
import com.jie.java_base.inherit.call_seq.C;
import com.jie.java_base.inherit.call_seq.D;

public class InheritExample {
    public static void main(String[] args) {
//        abstractUse();
//        interfaceUse();
//        superUser();
        callSequence();
    }

    private static void abstractUse(){
        AbstractClassExample ac = new AbstractExtendClassExample();
        ac.func1();
    }

    private static void interfaceUse(){
        InterfaceExample ie = new InterfaceImplementExample();
        ie.func1();
        System.out.println(InterfaceExample.x);
    }

    private static void superUser(){
        SuperExample se = new SuperExtendExample(1,2,3);
        se.func();
    }

    private static void callSequence(){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.show(a);
        a.show(b);

        b.show(c);
        b.show(d);

        A ba = new B();
        ba.show(c);
        ba.show(d);
    }
}
