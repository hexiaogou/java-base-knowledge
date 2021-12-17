package com.jie.java_base.annotation;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyInherit {
    int type() default 0;

    String level() default "info";

    String value() default "";
}
