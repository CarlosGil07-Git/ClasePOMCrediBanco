package com.co.credibanco.stepsdefinitions;

import com.co.credibanco.steps.CheckoutStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStepDefinition {

    private final CheckoutStep checkoutStep = new CheckoutStep();

    @When("el usuario hace clic en Checkout")
    public void clicCheckout() {
        checkoutStep.hacerCheckout();
    }

    @And("el usuario completa los datos de compra")
    public void completarDatosCompra() {
        checkoutStep.completarDatos(
                "Carlos",
                "Gomez",
                "110111"
        );
    }

    @And("el usuario hace clic en Continue")
    public void clicContinue() {
        checkoutStep.continuarCompra();
    }

    @Then("el usuario ve el resumen de compra")
    public void verificarResumen() {
        Assert.assertTrue(
                "No se muestra el resumen de la compra",
                checkoutStep.resumenVisible()
        );
    }

    @And("el usuario hace clic en Finish")
    public void clicFinish() {
        checkoutStep.finalizarCompra();
    }

    @Then("el usuario confirma que la compra finalizo")
    public void verificarCompraFinalizada() {
        Assert.assertTrue(
                "No se encontró la confirmación de compra",
                checkoutStep.compraCompletada()
        );
    }
}