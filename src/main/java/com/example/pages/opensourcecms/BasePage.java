package com.example.pages.opensourcecms;

import com.example.pages.opensourcecms.OpensourcecmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.open;

@Component
public class BasePage {

    @Autowired
    OpensourcecmsConfig opensourcecmsConfig;

    public BasePage openUrl() {
        open(opensourcecmsConfig.getUrl());
        return this;
    }

    public String getUrl() {
        return opensourcecmsConfig.getUrl();
    }

    public String getUsername() {
        return opensourcecmsConfig.getUsername();
    }

    public String getPassword() {
        return opensourcecmsConfig.getPassword();
    }

}
