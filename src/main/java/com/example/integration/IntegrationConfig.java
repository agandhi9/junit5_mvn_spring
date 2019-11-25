package com.example.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:application-integration.properties")
public class IntegrationConfig {

    @Value("${param1}")
    private String paramOne;

    @Value("${param2}")
    private String paramTwo;

    @Value("${param3}")
    private String paramThree;

    public String getParamOne() {
        return paramOne;
    }

    public String getParamTwo() {
        return paramTwo;
    }

    public String getParamThree() {
        return paramThree;
    }
}
