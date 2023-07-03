package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ForgotPasswordPage {

    private final WebDriver driver;

    private final By enterLinkOnForgotPasswordPage = By.xpath(".//p[text()='Вспомнили пароль?']/a[text()='Войти']");


    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("кликнуть на ссылку Вспомнили пароль?")
    public void clickOnEnterLinkOnForgotPasswordPage(){
        driver.findElement(enterLinkOnForgotPasswordPage).click();
    }

}
