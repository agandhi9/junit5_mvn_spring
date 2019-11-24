package com.example.config;

import com.codeborne.selenide.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OpensourcecmsParams {

    public OpensourcecmsParams() {
        Configuration.reportsFolder = "target/reports/tests";
        Configuration.startMaximized = true;
        Configuration.headless = true;
        Configuration.timeout = 8000;
    }

    @Value("${opensourcecms.url:https://s1.demo.opensourcecms.com/wordpress/wp-login.php}")
    private String url;

    @Value("${opensourcecms.user.name:opensourcecms}")
    private String userName;

    @Value("${opensourcecms.pass.user:opensourcecms}")
    private String password;


    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
