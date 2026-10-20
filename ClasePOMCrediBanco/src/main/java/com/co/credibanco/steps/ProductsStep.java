package com.co.credibanco.steps;

import com.co.credibanco.pagesobjects.ProductsPage;
import net.serenitybdd.core.pages.PageObject;

public class ProductsStep extends PageObject {

    private final ProductsPage productsPage = new ProductsPage();

    private void pausa() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("La pausa fue interrumpida", e);
        }
    }

    public void agregarMochilaAlCarrito() {
        $(productsPage.getBTN_ADD_BACKPACK()).waitUntilVisible();
        pausa();
        $(productsPage.getBTN_ADD_BACKPACK()).click();
        pausa();
    }

    public void abrirCarrito() {
        $(productsPage.getBTN_CART()).waitUntilVisible();
        $(productsPage.getBTN_CART()).click();

        waitForCondition().until(
                driver -> driver.getCurrentUrl().contains("cart.html")
        );
    }
    public boolean mochilaVisibleEnCarrito() {
        return $(productsPage.getTXT_PRODUCT_CART()).isVisible()
                && $(productsPage.getTXT_PRODUCT_CART())
                .getText().contains("Sauce Labs Backpack");
    }
}