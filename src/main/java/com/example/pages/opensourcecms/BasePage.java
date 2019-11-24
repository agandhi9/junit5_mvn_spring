package com.example.pages.opensourcecms;

import com.example.config.OpensourcecmsParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.open;

@Component
public class BasePage {

    @Autowired
    OpensourcecmsParams opensourcecmsParams;

    public BasePage openUrl() {
        open(opensourcecmsParams.getUrl());
        return this;
    }

}
