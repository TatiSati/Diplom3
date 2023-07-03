package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProfilePage {

    private final WebDriver driver; // Добавили поле driver


    private final By nameField = By.xpath(".//input[@value='Татьяна']");


    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }


    @Step("Вернуть заголовок Имя")
    public By getNameField() {
        return nameField;
    }

}
