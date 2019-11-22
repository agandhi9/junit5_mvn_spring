package com.example.base;

import com.codeborne.selenide.Configuration;
import com.example.ext.WatcherExtension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@ExtendWith(WatcherExtension.class)
public class BaseTests {

    static final Logger LOGGER = LoggerFactory.getLogger(BaseTests.class);

    @BeforeAll
    void beforeAll() {
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
    void afterAll() {
        LOGGER.info("................ after all methods - once in a class ...");
    }

}
