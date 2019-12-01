package com.example.pages.opensourcecms;

import com.example.base.BaseTests;
import com.example.utils.HttpClientReponseUtil;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Epic: Opensourcecms")
@Tag("opensourcecms")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginPageTests extends BaseTests {

    private static final Logger LOGGER = LogManager.getLogger(LoginPageTests.class);

    @BeforeEach
    void beforeEach(TestInfo info, TestReporter reporter) {
        LOGGER.info("before each test method - in a class ................ ");
        reporter.publishEntry(" [ " + info.getTags() + " ] " + info.getDisplayName());
    }

    @AfterEach
    void afterEach() {
        LOGGER.info("after each test method - in a class ................ ");
    }

    @Autowired
    LoginForm loginForm;

    @Autowired
    HttpClientReponseUtil reponseUtil;

    @Test
    @DisplayName("Check Https Status")
    @Story("Story: Check Https Status")
    @Order(1)
    void checkIfUrlIsActive() {
        String url = opensourcecmsConfig.getUrl();
        assertEquals(HttpStatus.OK, reponseUtil.getStatusCode(url), HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase());
    }

    @Test
    @DisplayName("Login tests")
    @Story("Story: Login story")
    @Order(2)
    void loginAsCorrectUser() {
        loginForm.openUrl(opensourcecmsConfig.getUrl());
        loginForm.logIn(opensourcecmsConfig.getUsername(), opensourcecmsConfig.getUserpass());
        assertTrue(loginForm.isUserLoggedIn(), "OpenSorceCms Dashboard is not loaded....");
    }

}
