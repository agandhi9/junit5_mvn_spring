package com.example.pages.opensourcecms;

import com.example.base.BaseTests;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Epic: Opensourcecms")
@Story("Story: Login story")
public class LoginPageTests extends BaseTests {

    static final Logger LOGGER = LoggerFactory.getLogger(LoginPageTests.class);

    @Autowired
    LoginForm loginForm;

    @Autowired
    BaseOpnSrcCms baseOpnSrcCms;

    @BeforeAll
    void beforeAll() {
        baseOpnSrcCms.openUrl();
    }

    @Test
    @DisplayName("Log in as correct user")
    @Step("Step: Log in as correct user")
    @Tag("opensourcecms")
    void loginAsCorrectUser() {
        loginForm.logIn();
        assertTrue(loginForm.isDashboardPageLoaded(), "OpenSorceCms Dashboard is not loaded....");
    }

}
