package blibli.automation.acceptance.test.driven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class ShopPage extends PageObject{
    @FindBy(ngModel = "searchParam")
    private WebElementFacade searchField;

    @FindBy(ngModel = "gdn-search-button")
    private WebElementFacade btnSearch;

    @FindBy(xpath = ".//*[@id='catalogProductListContentDiv']/div[1]")
    private WebElementFacade itemToBeBought;

    @FindBy(id = "MyBtn")
    private WebElementFacade btnBuy;

    @FindBy(id = "gdn-cart-button")
    private WebElementFacade btnCart;

    @FindBy(id = "gdn-sb-page-continue-checkout")
    private WebElementFacade btnCheckout;


}
