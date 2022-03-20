package com.boostcommerce.tasks;

import com.boostcommerce.module.KeywordSearch;
import com.boostcommerce.ui.ShopifyPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchProduct implements Task {
    KeywordSearch typeSearch;
    public SearchProduct(KeywordSearch typeSearch) {
        this.typeSearch = typeSearch;
    }

    public static Performable forTheTerm(KeywordSearch typeSearch) {
        return Tasks.instrumented(SearchProduct.class,typeSearch);
    }

    @Step("Input type top to the search box")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(typeSearch.getKeywordSearch())
                     .into(ShopifyPageUI.SEARCH_BOX)
        );
    }

}
