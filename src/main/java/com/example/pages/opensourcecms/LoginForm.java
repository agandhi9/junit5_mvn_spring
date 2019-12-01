package com.example.pages.opensourcecms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
@Scope("prototype")
public class LoginForm {

    private SelenideElement loginForm = $("#loginform");
    private SelenideElement userName = $("#user_login");
    private SelenideElement userPass = $("#user_pass");
    private SelenideElement logInButton = $("#wp-submit");
    private SelenideElement avatar = $("#wp-admin-bar-my-account > a > img");

    public void openUrl(String url) {
        Selenide.open(url);
    }

    public void logIn(String username, String password) {

        loginForm.shouldBe(Condition.visible);

        userName.val(username).pressTab();
        userName.shouldHave(Condition.exactValue(username));

        userPass.val(password);
        userPass.shouldBe(Condition.not(Condition.empty));

        logInButton.click();

        avatar.shouldBe(Condition.visible);
    }

    public boolean isUserLoggedIn() {
        return avatar.shouldBe(Condition.visible).isDisplayed();
    }

}
