package com.jie.java_base.inherit;

public class SuperExample {
    protected int x;
    protected int y;

    public SuperExample(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void func(){
        System.out.println("SuperExample.func");
    }
}
