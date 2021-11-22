package com.jie.java_base;

import com.jie.java_base.object_general_func.*;

import java.util.HashSet;

public class ObjectGeneralFuncExample {
    public static void main(String[] args) {
//        equals();
//        hashCodeUse();
//        toStringUse();
//        cloneUse();
//        shallowCloneUse();
//        deepCloneUse();
        cloneConstructorUse();
    }

    private static void equals() {
        Object object = new Object();
        System.out.println(object.equals(null));
    }


    private static void hashCodeUse() {
        EqualsExample e1 = new EqualsExample(1, 1, 1);
        EqualsExample e2 = new EqualsExample(1, 1, 1);
        System.out.println(e1.equals(e2));
        HashSet<EqualsExample> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set.size());
        System.out.println("e1 hashcode:" + e1.hashCode());
        System.out.println("e1 hashcode:" + e2.hashCode());
    }

    private static void toStringUse() {
        Object object = new Object();
        System.out.println(object.toString());
    }

    private static void cloneUse() {
        CloneExample c1 = new CloneExample();
        try {
            CloneExample c2 = c1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    private static void shallowCloneUse(){
        ShallowCloneExample s1 = new ShallowCloneExample();
        ShallowCloneExample s2 = null;
        try {
            s2 = s1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        s1.set(2,222);
        System.out.println(s2.get(2));
    }

    private static void deepCloneUse(){
        DeepCloneExample d1 = new DeepCloneExample();
        DeepCloneExample d2 = null;
        try {
            d2 = d1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        d1.set(2,222);
        System.out.println(d2.get(2));
    }

    private static void cloneConstructorUse(){
        CloneConstructorExample c1 = new CloneConstructorExample();
        CloneConstructorExample c2 = new CloneConstructorExample(c1);
        c1.set(2,222);
        System.out.println(c2.get(2));
    }
}
