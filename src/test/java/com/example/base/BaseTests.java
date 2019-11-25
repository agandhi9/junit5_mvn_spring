package com.example.base;

import com.example.ext.WatcherExtension;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@ExtendWith(WatcherExtension.class)
public class BaseTests {

    private static final Logger LOGGER = LogManager.getLogger(BaseTests.class);

    @BeforeAll
    static void beforeAll() {
        LOGGER.info("before all methods - once in a class ................ ");
    }

    @BeforeEach
    void beforeEach() {
        LOGGER.info("before each test method - in a class ................ ");
    }

    @AfterEach
    void afterEach() {
        LOGGER.info("after each test method - in a class ................ ");
    }

    @AfterAll
    static void afterAll() {
        LOGGER.info("................ after all methods - once in a class ...");
    }

}
