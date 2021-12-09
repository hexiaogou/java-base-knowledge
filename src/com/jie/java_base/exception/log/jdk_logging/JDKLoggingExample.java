package com.jie.java_base.exception.log.jdk_logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JDKLoggingExample {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.setLevel(Level.FINER);
        logger.info("start process...");
        logger.warning("memory in running out...");
        logger.fine("ignored...");
        logger.severe("process will be terminated...");
    }
}
