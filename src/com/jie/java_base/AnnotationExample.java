package com.jie.java_base;


import com.jie.java_base.annotation.*;
import com.sun.istack.internal.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
//        annotationInfo();
//        methodParameterAnnotation();
        annotationUse();
    }

    private static void annotationInfo() {
        Student student = new Student();
        Class clz = student.getClass();
        System.out.println(Arrays.toString(clz.getAnnotations()));
        System.out.println(Arrays.toString(clz.getSuperclass().getAnnotations()));
        System.out.println(clz.isAnnotationPresent(MyInherit.class));

        MyInherit inherit = (MyInherit) clz.getAnnotation(MyInherit.class);
        int type = inherit.type();
        String level = inherit.level();
        System.out.println(level + type);
    }

    private static void methodParameterAnnotation() throws NoSuchMethodException {
        Hello hello = new Hello();
        Method m = hello.getClass().getMethod("helloWorld", String.class, String.class);
        Annotation[][] annotations = m.getParameterAnnotations();

        Annotation[] annotationName = annotations[0];
        for (Annotation anno : annotationName) {
            if (anno instanceof NotNull) {
                NotNull n = (NotNull) anno;
                System.out.println(n.annotationType());
            }
        }
    }

    private static void annotationUse() throws Exception{
        AnotherPerson anotherPerson = new AnotherPerson();
        anotherPerson.name="heXiGou";
        anotherPerson.city="Gou";
        check(anotherPerson);
    }

    private static void check(AnotherPerson anotherPerson) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : anotherPerson.getClass().getFields()) {
            MyRange myRange = field.getAnnotation(MyRange.class);
            if (Objects.nonNull(myRange)) {
                Object value = field.get(anotherPerson);
                if (value instanceof String) {
                    String s = (String) value;
                    if (s.length() < myRange.min() || s.length() > myRange.max()) {
                        throw new IllegalArgumentException("Invalid field:"+field.getName());
                    }
                }
            }
        }
    }
}
