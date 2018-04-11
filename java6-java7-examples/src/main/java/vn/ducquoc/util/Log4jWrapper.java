package vn.ducquoc.util;

/**
 * Created by ducquoc on 4/10/2018.
 */
public class Log4jWrapper extends SecurityManager {

    public String getCallerClassName() { // System.getSecurityManager().getClassContext()[1].getName();
        return getClassContext()[2].getName(); // direct call == 1, wrapper == 2
    }

    public static org.apache.log4j.Logger factorySecManLog() {
        return org.apache.log4j.Logger.getLogger(new Log4jWrapper().getCallerClassName());
    }

    public static org.apache.log4j.Logger factoryCurrThreadLog() { // direct call == 1, wrapper == 2
        return org.apache.log4j.Logger.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }

    public static org.apache.log4j.Logger factoryNewThrowLog() { // direct call == 0, wrapper == 1
        return org.apache.log4j.Logger.getLogger(new Throwable().getStackTrace()[1].getClassName());
    }

    // below method may not work with Java 8, only Java 7 or prior versions
    /*
    public static org.apache.log4j.Logger factorySunReflectionLog() {
        return org.apache.log4j.Logger.getLogger(sun.reflect.Reflection.getCallerClass(2));
    }
    */

    public static void initLogger() { // alternative log4j.properties
        org.apache.log4j.PatternLayout layout = new org.apache.log4j.PatternLayout("%d{MM-dd HH:mm:ss} %p %l - %m%n");
        org.apache.log4j.ConsoleAppender appender = new org.apache.log4j.ConsoleAppender(layout);
        appender.setName("default console log");
        appender.activateOptions();
        org.apache.log4j.Logger.getRootLogger().addAppender(appender);
    }

}
