package com.co.credibanco.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    private final By BTN_CHECKOUT = By.id("checkout");
    private final By TXT_FIRST_NAME = By.id("first-name");
    private final By TXT_LAST_NAME = By.id("last-name");
    private final By TXT_POSTAL_CODE = By.id("postal-code");
    private final By BTN_CONTINUE = By.id("continue");
    private final By BTN_FINISH = By.id("finish");
    private final By TXT_CHECKOUT_SUMMARY = By.className("summary_info");
    private final By TXT_ORDER_COMPLETE = By.className("complete-header");

    public By getBtnCheckout() {
        return BTN_CHECKOUT;
    }

    public By getTxtFirstName() {
        return TXT_FIRST_NAME;
    }

    public By getTxtLastName() {
        return TXT_LAST_NAME;
    }

    public By getTxtPostalCode() {
        return TXT_POSTAL_CODE;
    }

    public By getBtnContinue() {
        return BTN_CONTINUE;
    }

    public By getBtnFinish() {
        return BTN_FINISH;
    }

    public By getTxtCheckoutSummary() {
        return TXT_CHECKOUT_SUMMARY;
    }

    public By getTxtOrderComplete() {
        return TXT_ORDER_COMPLETE;
    }
}