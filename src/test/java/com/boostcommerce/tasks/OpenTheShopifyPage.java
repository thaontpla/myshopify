package com.boostcommerce.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.boostcommerce.ui.ShopifyPageUI;

public class OpenTheShopifyPage implements Task {

    ShopifyPageUI shopifyPage;

    @Step("Open the shopify page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(shopifyPage)
        );
    }
}
