package com.co.credibanco.stepsdefinitions;

import com.co.credibanco.steps.LoginStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("que el usuario esta en la pagina web")
    public void queElUsuarioEstaEnLaPaginaWeb() {
        loginStep.open();
    }
    @When("el usuario ingresar sus credenciales")
    public void elUsuarioIngresarSusCredenciales() {
        loginStep.ingresarUsername();
        loginStep.ingresarPassword();
        loginStep.hacerClickLogin();
    }
    @Then("el usuario podra ver los productos")
    public void elUsuarioPodraVerLosProductos() {
        Assert.assertTrue(
                "No se muestra la pagina de productos",
                loginStep.estaEnPaginaProductos()
        );
    }
}
