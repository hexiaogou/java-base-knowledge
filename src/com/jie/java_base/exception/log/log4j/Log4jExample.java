package com.jie.java_base.exception.log.log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4jExample {
    static final Log log = LogFactory.getLog(Log4jExample.class);

    public static void main(String[] args) {
        // log4j3.xml config not success
        log.info("start...");
        log.warn("end....");
    }
}
