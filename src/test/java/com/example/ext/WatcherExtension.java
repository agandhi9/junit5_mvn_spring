package com.example.ext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.lang.reflect.Method;
import java.util.Optional;

public class WatcherExtension implements TestWatcher {

    private static final Logger LOGGER = LogManager.getLogger(WatcherExtension.class);

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        LOGGER.info("!!! TEST DISABLED !!! " + testMethod.getName());
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        LOGGER.info("!!! TEST SUCCESS !!! " + testMethod.getName());
    }

    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        LOGGER.info("!!! TEST ABORTED !!! " + testMethod.getName(), throwable);
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        Boolean testFailed = extensionContext.getExecutionException().isPresent();
        if(testFailed) {
            LOGGER.error("!!! TEST FAILED !!! " + testMethod.getName(), throwable);
        }
    }

}
