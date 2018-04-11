package vn.ducquoc.execute;

import org.apache.log4j.Logger;
import vn.ducquoc.util.Log4jWrapper;

/**
 * Created by ducquoc on 4/10/2018.
 * <p></p>
 * KISS YAGNI DRY - see: https://ducquoc.wordpress.com/2010/11/27/software-development-principles/
 */
@lombok.extern.log4j.Log4j
public class LogExecutor {

    private static final Logger logFaster = Logger.getLogger(java.lang.invoke.MethodHandles.lookup().lookupClass());
    private static final Logger logFast = Logger.getLogger(new Object(){}.getClass().getEnclosingClass());
    private static final Logger logOkay = Log4jWrapper.factorySecManLog();
    private static final Logger logSlow = Log4jWrapper.factoryNewThrowLog();
    private static final Logger logSlower = Log4jWrapper.factoryCurrThreadLog();

    public static void main(String[] args) {
        Log4jWrapper.initLogger();
        new LogExecutor().execute();
    }

    private void execute() {
        logFaster.info("MethodHandles_lookup_lookupClass");
        logFast.info("AnonymousObject_getClass_enclosingClass");
        logOkay.info("SecurityManager_classContext_1");
        logSlow.info("Throwable_stackTrace_1_className");
        logSlower.info("Thread_currentThread_stackTrace_2_className");
        log.info("java -jar lombok.jar delombok -p LogExecutor.java");
        //Log4jWrapper.factorySunReflectionLog().info("Java 7-");
    }

}
