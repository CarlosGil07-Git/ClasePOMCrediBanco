package com.co.credibanco.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

    private final By BTN_ADD_BACKPACK =
            By.id("add-to-cart-sauce-labs-backpack");

    private final By BTN_CART =
            By.className("shopping_cart_link");

    private final By TXT_PRODUCT_CART =
            By.className("inventory_item_name");

    public By getBTN_ADD_BACKPACK() {
        return BTN_ADD_BACKPACK;
    }

    public By getBTN_CART() {
        return BTN_CART;
    }

    public By getTXT_PRODUCT_CART() {
        return TXT_PRODUCT_CART;
    }
}