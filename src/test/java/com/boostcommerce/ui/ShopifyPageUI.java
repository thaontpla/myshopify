package com.boostcommerce.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://boost-pfs-vertical.myshopify.com/collections/dresses")
public class ShopifyPageUI extends PageObject {
    public static Target SEARCH_BOX = Target.the("search box")
            .locatedBy("//div[@class='boost-search-wrapper']//input");
    public static Target LIST_PRODUCTS_NAME = Target.the("the products name")
            .locatedBy("//p[@class='boost-pfs-search-suggestion-product-title']");
}
