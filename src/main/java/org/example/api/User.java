package org.example.api;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class User extends PathAPI { // класс User - наследник класса PathAPI

    @Step("Метод  Создание пользователя")
    @Description("POST на ручку api/auth/register")
    public Response registrationUser(UserRegistration userRegistration){
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(userRegistration)
                .when()
                .post(USER_REGISTRATION);
    }

    @Step("Метод  Авторизация пользователя")
    @Description("POST на ручку api/auth/login")
    public Response loginUser(UserLogin userLogin){
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(userLogin)
                .when()
                .post(USER_LOGIN);
    }

    @Step("Метод  Удаление пользователя")
    @Description("DELETE на ручку api/auth/user")
    public void deleteUser(String accessToken){
        given()
                .header("Authorization", accessToken)
                .header("Content-type", "application/json")
                .delete(USER_BASE_URL);
    }

    @Step("Метод  Выход из системы")
    @Description("POST на ручку /api/auth/logout")
    public Response logoutUser(String accessToken){
        return given()
                .header("Authorization", accessToken)
                .header("Content-type", "application/json")
                .post(USER_LOGOUT);
    }

}
