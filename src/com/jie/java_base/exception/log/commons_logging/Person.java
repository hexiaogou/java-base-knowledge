package com.jie.java_base.exception.log.commons_logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Person {
    protected final Log log = LogFactory.getLog(getClass());

    void foo() {
        log.info("foo");
    }
}
