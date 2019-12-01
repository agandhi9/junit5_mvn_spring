package com.example.config;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;

public final class SelenideConfig {

    public static void init() {
        Configuration.reportsFolder = "target/reports/tests";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.timeout = 8000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
