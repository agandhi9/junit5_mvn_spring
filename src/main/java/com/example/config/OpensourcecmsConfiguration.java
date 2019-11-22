package com.example.config;

import com.codeborne.selenide.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:opensourcecms.properties")
public class OpensourcecmsConfiguration {

    public OpensourcecmsConfiguration() {
        Configuration.reportsFolder = "target/reports/tests";
        Configuration.startMaximized = true;
        Configuration.headless = true;
        Configuration.timeout = 8000;
    }

    @Value("${url.web:https://s1.demo.opensourcecms.com/wordpress/wp-login.php}")
    private String url;

    @Value("${user.name.web:opensourcecms}")
    private String userName;

    @Value("${pass.user.web:opensourcecms}")
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
