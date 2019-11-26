package com.example.integration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties()
@PropertySource("classpath:application-integration.properties")
public class IntegrationConfig {

    private String paramone;

    private String paramtwo;

    private String paramthree;

    public String getParamone() {
        return paramone;
    }

    public void setParamone(String paramone) {
        this.paramone = paramone;
    }

    public String getParamtwo() {
        return paramtwo;
    }

    public void setParamtwo(String paramtwo) {
        this.paramtwo = paramtwo;
    }

    public String getParamthree() {
        return paramthree;
    }

    public void setParamthree(String paramthree) {
        this.paramthree = paramthree;
    }
}
