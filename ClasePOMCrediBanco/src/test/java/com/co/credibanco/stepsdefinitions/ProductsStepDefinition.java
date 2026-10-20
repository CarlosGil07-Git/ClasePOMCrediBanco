
package com.co.credibanco.stepsdefinitions;

import com.co.credibanco.steps.ProductsStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductsStepDefinition {

    ProductsStep productsStep = new ProductsStep();

    @And("el usuario agrega una mochila al carrito")
    public void agregarMochila() {
        productsStep.agregarMochilaAlCarrito();
    }

    @And("el usuario abre el carrito")
    public void abrirCarrito() {
        productsStep.abrirCarrito();
    }

    @Then("el usuario podra ver la mochila en el carrito")
    public void verificarMochila() {
        Assert.assertTrue(
                "La mochila no aparece en el carrito",
                productsStep.mochilaVisibleEnCarrito()
        );
    }
}
