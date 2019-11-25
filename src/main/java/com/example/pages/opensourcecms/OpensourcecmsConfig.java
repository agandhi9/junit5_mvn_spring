package com.example.pages.opensourcecms;

import com.example.config.SelenideConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-opensourcecms.properties")
public class OpensourcecmsConfig {

    public OpensourcecmsConfig() {
        SelenideConfig.configCommon();
    }

    //@Value("${cms.url:https://s1.demo.opensourcecms.com/wordpress/wp-login.php}")
    @Value("${cms.url}")
    private String url;

    @Value("${cms.user.name}")
    private String userName;

    @Value("${cms.pass.user}")
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
