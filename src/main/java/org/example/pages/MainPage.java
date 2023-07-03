package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage  {

    private final WebDriver driver; // Добавили поле driver


    // Добавляем локаторы:
    private final By personalAreaButton = By.xpath(".//p[text()='Личный Кабинет']");
    private final By enterAccountButton = By.xpath(".//button[text()='Войти в аккаунт']");
    private final By constructorLink = By.xpath(".//p[text()='Конструктор']");
    private final By constructBurgerHeader = By.xpath(".//h1[text()='Соберите бургер']");
    private final By stellarBurgersLogo = By.xpath(".//div/header/nav/div/a");
    private final By bunsChapter = By.xpath(".//span[text()='Булки']");
    private final By saucesChapter = By.xpath(".//span[text()='Соусы']");
    private final By ingredientsChapter = By.xpath(".//span[text()='Начинки']");
    private final By theChosenElement  = By.className("tab_tab_type_current__2BEPc");


    // Добавили конструктор класса page object
    public MainPage(WebDriver driver) { // Инициализировали в нём поле driver
        this.driver = driver;
    }



    @Step("Клик на кнопку Личный Кабинет")
    public void clickOnPersonalArea() {
        driver.findElement(personalAreaButton).click();
    }

    @Step("Клик на кнопку Войти в аккаунт")
    public void clickOnEnterAccountButton(){
        driver.findElement(enterAccountButton).click();
    }


    @Step("Клик на ссылку Конструктор")
    public void clickOnConstructorLink(){
        driver.findElement(constructorLink).click();
    }

    @Step("Клик на лого")
    public void clickOnStellarBurgersLogo(){
        driver.findElement(stellarBurgersLogo).click();
    }

    @Step("Клик на раздел Булки")
    public void clickOnBunsChapter(){
        driver.findElement(bunsChapter).click();
    }

    @Step("Клик на раздел Соусы")
    public void clickOnSaucesChapter(){
        driver.findElement(saucesChapter).click();
    }

    @Step("Клик на раздел Начинки")
    public void clickOnIngredientsChapter(){
        driver.findElement(ingredientsChapter).click();
    }

    @Step("Получить текст элемента")
    public String getTextFromTheChosenElement(){
        return driver.findElement(theChosenElement).getText();
    }

    @Step("Пполучить заголовок Соберите бургер")
    public By getConstructBurgerHeader() {
        return constructBurgerHeader;
    }

}
