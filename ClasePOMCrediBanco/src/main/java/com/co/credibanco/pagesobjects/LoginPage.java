
package com.co.credibanco.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    // Campo donde se escribe el usuario
    private By TXT_USERNAME =
            By.id("user-name");

    // Campo donde se escribe la contraseña
    private By TXT_PASSWORD =
            By.id("password");

    // Botón para iniciar sesión
    private By BTN_LOGIN =
            By.id("login-button");

    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }
}
