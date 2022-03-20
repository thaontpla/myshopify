package com.boostcommerce;

import com.boostcommerce.tasks.OpenTheShopifyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

public class Hook {
    protected Actor thao = Actor.named("Thao");

    @Managed(uniqueSession = true ,clearCookies = ClearCookiesPolicy.BeforeEachTest)
    public WebDriver herBrowser;

    @Steps
    public OpenTheShopifyPage openTheShopifyPage;

    @Before
    public void annaCanBrowseTheWeb() {
        thao.can(BrowseTheWeb.with(herBrowser));
        givenThat(thao).wasAbleTo(openTheShopifyPage);
    }
}
