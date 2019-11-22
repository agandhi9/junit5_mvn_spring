package com.example.ext;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.time.Instant;
import java.util.Optional;

public class WatcherExtension implements TestWatcher {

    protected static final Logger LOG = LoggerFactory.getLogger(WatcherExtension.class);

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        LOG.error("!!! TEST DISABLED !!! " + testMethod.getName());
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        LOG.info("!!! TEST SUCCESS !!! " + testMethod.getName());
    }

    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        LOG.info("!!! TEST ABORTED !!! " + testMethod.getName(), throwable);
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        Method testMethod = extensionContext.getRequiredTestMethod();
        Boolean testFailed = extensionContext.getExecutionException().isPresent();
        if(testFailed) {
            LOG.error("!!! TEST FAILED !!! " + testMethod.getName(), throwable);
        }
    }

}
