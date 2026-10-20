
package com.co.credibanco.steps;

import com.co.credibanco.pagesobjects.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep {

    LoginPage objLoginPage = new LoginPage();

    @Step
    public void open() {
        objLoginPage.open();
        objLoginPage.getDriver().get(
                "https://www.saucedemo.com/"
        );
    }

    @Step
    public void ingresarUsername() {
        objLoginPage.getDriver()
                .findElement(objLoginPage.getTXT_USERNAME())
                .sendKeys("standard_user");
    }

    @Step
    public void ingresarPassword() {
        objLoginPage.getDriver()
                .findElement(objLoginPage.getTXT_PASSWORD())
                .sendKeys("secret_sauce");
    }

    @Step
    public void hacerClickLogin() {
        objLoginPage.getDriver()
                .findElement(objLoginPage.getBTN_LOGIN())
                .click();
    }
    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    @Step
    public boolean estaEnPaginaProductos() {
        return objLoginPage.getDriver()
                .getCurrentUrl()
                .contains("inventory.html");
    }
}
