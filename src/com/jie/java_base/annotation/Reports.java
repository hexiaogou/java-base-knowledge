package com.jie.java_base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Reports {
    Report [] value();
}
