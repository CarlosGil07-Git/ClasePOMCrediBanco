package com.co.credibanco.steps;

import com.co.credibanco.pagesobjects.CheckoutPage;
import net.serenitybdd.core.pages.PageObject;

public class CheckoutStep extends PageObject {

    private final CheckoutPage checkoutPage = new CheckoutPage();

    private void pausa() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("La pausa fue interrumpida", e);
        }
    }

    public void hacerCheckout() {
        pausa();
        $(checkoutPage.getBtnCheckout()).click();
        pausa();
    }

    public void completarDatos(String nombre, String apellido, String codigoPostal) {
        $(checkoutPage.getTxtFirstName()).sendKeys(nombre);
        pausa();

        $(checkoutPage.getTxtLastName()).sendKeys(apellido);
        pausa();

        $(checkoutPage.getTxtPostalCode()).sendKeys(codigoPostal);
        pausa();
    }

    public void continuarCompra() {
        $(checkoutPage.getBtnContinue()).click();
        pausa();
    }

    public boolean resumenVisible() {
        return $(checkoutPage.getTxtCheckoutSummary()).isVisible();
    }

    public void finalizarCompra() {
        pausa();
        $(checkoutPage.getBtnFinish()).click();
        pausa();
    }

    public boolean compraCompletada() {
        return $(checkoutPage.getTxtOrderComplete()).isVisible()
                && $(checkoutPage.getTxtOrderComplete())
                .getText().contains("Thank you for your order");
    }
}