package com.jie.java_base.exception.log.commons_logging;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {
    static final Log log = LogFactory.getLog(CommonsLoggingExample.class);

    public static void main(String[] args) {
        log.info("start...");
        log.warn("end....");
//        throwExceptionInLog();
        inheritUseLog();
    }

    private void testStaticLog(){
        log.info("test static log...");
    }

    private static void throwExceptionInLog(){
        try {
            Integer.parseInt("abc");
        }catch (Exception e){
            log.error("Integer parse error:",e);
        }
    }

    private static void inheritUseLog(){
        Person student= new Student();
        student.foo();
    }
}
