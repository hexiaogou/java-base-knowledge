package com.jie.test;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author hexiaogou
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        String dateTimeFormat = LocalDateTimeUtil.format(dateTime, DatePattern.NORM_DATETIME_PATTERN);
        System.out.println(dateTimeFormat);
        Date date = DateUtil.parseDateTime(dateTimeFormat);
        System.out.println(date);
    }
}
