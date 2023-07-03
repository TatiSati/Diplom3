package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private final WebDriver driver;


    // Добавляем локаторы:
    private final By registrationLink = By.xpath(".//a[text()='Зарегистрироваться']");
    private final By enterHeader = By.xpath(".//h2[text()='Вход']");
    private final By enterButton = By.xpath(".//button[text()='Войти']");
    private final By emailField = By.xpath(".//form/fieldset[1]/div/div/input");
    private final By passwordField = By.xpath(".//form/fieldset[2]/div/div/input");
    private final By restorePasswordLink = By.xpath(".//a[text()='Восстановить пароль']");


    // Добавили конструктор класса page object
    public LoginPage(WebDriver driver) { // Инициализировали в нём поле driver
        this.driver = driver;
    }


    // Методы:
    // метод кликает на ссылку "Зарегестрироваться"
    @Step("Клик на ссылку Зарегестрироваться")
    public void clickOnRegistrationLink() {
        driver.findElement(registrationLink).click();
    }

    @Step("Клик на поле Email и вводит новое значения из параметра")
    public void enterEmail(String email) {
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
    }

    @Step("Клик на поле Пароль и вводит новое значения из параметра")
    public void enterPassword(String password) {
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("Клик на кнопку Войти")
    public void clickOnEnterButton() {
        driver.findElement(enterButton).click();
    }

    @Step("Клик на ссылку Восстановить пароль")
    public void clickOnRestorePasswordLink() {
        driver.findElement(restorePasswordLink).click();
    }


    @Step("Логин пользователя и клик на кнопку Войти")
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOnEnterButton();
    }

    @Step("Получить заголовок Вход")
    public By getEnterHeader() {
        return enterHeader;
    }

}
