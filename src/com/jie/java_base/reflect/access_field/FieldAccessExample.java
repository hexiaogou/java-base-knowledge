package com.jie.java_base.reflect.access_field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldAccessExample {
    public static void main(String[] args) throws Exception{
        Class cls = Student.class;
        System.out.println(cls.getField("score").getModifiers());
        System.out.println(cls.getField("name"));
        System.out.println(cls.getDeclaredField("grade"));

        stringFieldInfo();

        fieldValue();
    }

    private static void stringFieldInfo() throws NoSuchFieldException {
        System.out.println("------------------------------------------");
        Field f = String.class.getDeclaredField("value");
        System.out.println(f.getName());
        System.out.println(f.getType());
        int m = f.getModifiers();
        System.out.println(Modifier.isFinal(m));
        System.out.println(Modifier.isPublic(m));
        System.out.println(Modifier.isPrivate(m));
        System.out.println(Modifier.isProtected(m));
        System.out.println(Modifier.isStatic(m));
        System.out.println(Modifier.isNative(m));
    }

    private static void fieldValue() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("------------------------------------------");
        Object p = new PersonCopy("xiao gou");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
    }
}
