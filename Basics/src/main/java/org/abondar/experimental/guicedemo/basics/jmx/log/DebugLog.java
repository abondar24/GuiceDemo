package org.abondar.experimental.guicedemo.basics.jmx.log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class DebugLog {
    private static  final Handler HANDLER = new ConsoleHandler(){{
        setLevel(Level.ALL);
        setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("[Debug] %s%n", record.getMessage());
            }
        });
    }};

    private DebugLog(){ }

    public static void enable(){
        Logger logger = Logger.getLogger("com.google.inject");
        logger.addHandler(DebugLog.HANDLER);
        logger.setLevel(Level.ALL);
    }
}
