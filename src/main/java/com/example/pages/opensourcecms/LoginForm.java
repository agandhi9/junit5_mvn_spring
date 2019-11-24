package com.example.pages.opensourcecms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.example.config.OpensourcecmsParams;
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
    OpensourcecmsParams opensourcecmsParams;

    @Autowired
    Dashboard dashboard;

    public LoginForm logIn() {

        loginForm.shouldBe(Condition.visible);

        userName.val(opensourcecmsParams.getUsername()).pressTab();
        userName.shouldHave(Condition.exactValue(opensourcecmsParams.getUsername()));

        userPass.val(opensourcecmsParams.getPassword());
        userPass.shouldBe(Condition.not(Condition.empty));

        logInButton.click();

        dashboard.getAvatar().shouldBe(Condition.visible);

        return this;
    }

    public boolean isDashboardPageLoaded() {
        return dashboard.checkUserLogIn();
    }

}
