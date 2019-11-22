package com.example.pages.opensourcecms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.example.config.OpensourcecmsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class LoginForm {

    private SelenideElement loginForm = $("#loginform");
    private SelenideElement userName = $("#user_login");
    private SelenideElement userPass = $("#user_pass");
    private SelenideElement logInButton = $("#wp-submit");

    @Autowired
    OpensourcecmsConfiguration opensourcecmsConfiguration;

    @Autowired
    Dashboard dashboard;

    public LoginForm logIn() {

        loginForm.shouldBe(Condition.visible);

        userName.val(opensourcecmsConfiguration.getUsername()).pressTab();
        userName.shouldHave(Condition.exactValue(opensourcecmsConfiguration.getUsername()));

        userPass.val(opensourcecmsConfiguration.getPassword());
        userPass.shouldBe(Condition.not(Condition.empty));

        logInButton.click();

        dashboard.getAvatar().shouldBe(Condition.visible);

        return this;
    }

    public boolean isDashboardPageLoaded() {
        return dashboard.isDashboardPageLoaded();
    }

}
