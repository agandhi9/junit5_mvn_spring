package com.example.config;


import com.codeborne.selenide.Configuration;

public final class SelenideConfig {

    public static void configCommon() {
        Configuration.reportsFolder = "target/reports/tests";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.timeout = 8000;
    }
}
