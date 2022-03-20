package com.boostcommerce.features.search;

import com.boostcommerce.Hook;
import com.boostcommerce.module.KeywordSearch;
import com.boostcommerce.ui.ShopifyPageUI;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.boostcommerce.tasks.OpenTheShopifyPage;
import com.boostcommerce.tasks.SearchProduct;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class WhenSearchTheProductWithKeywordStory extends Hook {
    KeywordSearch keywordSearch = new KeywordSearch("top");
    @Test
    public void should_be_able_to_search_the_product_with_keyword() {
        when(thao).attemptsTo(
                SearchProduct.forTheTerm(keywordSearch)
        );
        List<String> theProducts = Text.of(ShopifyPageUI.LIST_PRODUCTS_NAME).asAList().answeredBy(thao);
        Ensure.that(theProducts.size()).isGreaterThanOrEqualTo(1);
        for (String theProduct: theProducts){
            Ensure.that(theProduct).contains(keywordSearch.getKeywordSearch());
        }
    }
}