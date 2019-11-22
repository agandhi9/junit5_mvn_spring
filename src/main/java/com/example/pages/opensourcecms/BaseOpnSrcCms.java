package com.example.pages.opensourcecms;

import com.example.config.OpensourcecmsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.open;

@Component
public class BaseOpnSrcCms {

    @Autowired
    OpensourcecmsConfiguration opensourcecmsConfiguration;


    public BaseOpnSrcCms openUrl() {
        open(opensourcecmsConfiguration.getUrl());
        return this;
    }
}
