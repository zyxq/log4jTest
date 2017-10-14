package com.onego.chenqiang;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger root = Logger.getRootLogger();
        NDC.push("mainNDCTest");
        logger.info("xx");
    }
}
