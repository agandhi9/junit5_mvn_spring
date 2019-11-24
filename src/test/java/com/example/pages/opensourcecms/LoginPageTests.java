package com.example.pages.opensourcecms;

import com.example.base.BaseTests;
import com.example.utils.HttpClientReponseUtil;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Epic: Opensourcecms")
public class LoginPageTests extends BaseTests {

    static final Logger LOGGER = LoggerFactory.getLogger(LoginPageTests.class);

    @Autowired
    LoginForm loginForm;

    @Autowired
    BasePage basePage;

    @Autowired
    HttpClientReponseUtil reponseUtil;

    @Test
    @DisplayName("Check Https Status")
    @Story("Story: Check Https Status")
    @Tag("opensourcecms")
    @Order(1)
    void checkIfUrlIsActive() {
        String url = basePage.opensourcecmsParams.getUrl();
        assertEquals(HttpStatus.OK, reponseUtil.getStatusCode(url), HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase());
    }

    @Test
    @DisplayName("Login tests")
    @Story("Story: Login story")
    @Tag("opensourcecms")
    @Order(2)
    void loginAsCorrectUser() {
        basePage.openUrl();
        loginForm.logIn();
        assertTrue(loginForm.isDashboardPageLoaded(), "OpenSorceCms Dashboard is not loaded....");
    }

}
