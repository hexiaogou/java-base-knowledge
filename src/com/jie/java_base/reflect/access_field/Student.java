package com.jie.java_base.reflect.access_field;

public class Student extends Person{
    public int score;
    private int grade;

    public Student(String name,int score,int grade){
        super(name);
        this.score = score;
        this.grade = grade;
    }
}
