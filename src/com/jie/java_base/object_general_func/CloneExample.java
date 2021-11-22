package com.jie.java_base.object_general_func;

public class CloneExample implements Cloneable{
    private int a;
    private int b;

    @Override
    public CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }
}
