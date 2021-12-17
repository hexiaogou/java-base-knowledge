package com.jie.java_base.annotation;

import java.lang.annotation.*;


@Repeatable(Reports.class)
@Target({ElementType.TYPE})
public @interface Report {
    int type() default 0;

    String level() default "info";

    String value() default "";
}

