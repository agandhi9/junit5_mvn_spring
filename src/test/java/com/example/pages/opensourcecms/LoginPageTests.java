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

    @Autowired
    LoginForm loginForm;

    @Autowired
    BasePage basePage;

    @Autowired
    HttpClientReponseUtil reponseUtil;

    @Test
    @DisplayName("Check Https Status")
    @Story("Story: Check Https Status")
    @Order(1)
    void checkIfUrlIsActive() {
        String url = basePage.opensourcecmsConfig.getUrl();
        assertEquals(HttpStatus.OK, reponseUtil.getStatusCode(url), HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase());
    }

    @Test
    @DisplayName("Login tests")
    @Story("Story: Login story")
    @Order(2)
    void loginAsCorrectUser() {
        basePage.openUrl();
        loginForm.logIn();
        assertTrue(loginForm.isDashboardPageLoaded(), "OpenSorceCms Dashboard is not loaded....");
    }

}
