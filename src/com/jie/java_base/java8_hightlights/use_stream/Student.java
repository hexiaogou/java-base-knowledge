package com.jie.java_base.java8_hightlights.use_stream;

public class Student {
    int gradeId; // 年级
    int classId; // 班级
    String name; // 名字
    int score; // 分数

    public Student(int gradeId, int classId, String name, int score) {
        this.gradeId =gradeId;
        this.classId = classId;
        this.name= name;
        this.score=score;
    }

    public int getGradeId() {
        return gradeId;
    }

    public int getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gradeId=" + gradeId +
                ", classId=" + classId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
