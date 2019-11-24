package com.example.pages.opensourcecms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class Dashboard {

    private SelenideElement avatar = $("#wp-admin-bar-my-account > a > img");

    public SelenideElement getAvatar() {
        return avatar;
    }

    public boolean checkUserLogIn() {
        return avatar.shouldBe(Condition.visible).isDisplayed();
    }

}
