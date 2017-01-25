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


    public WebElementFacade getSearchField() {
        return searchField;
    }

    public void setSearchField(WebElementFacade searchField) {
        this.searchField = searchField;
    }

    public WebElementFacade getBtnSearch() {
        return btnSearch;
    }

    public void setBtnSearch(WebElementFacade btnSearch) {
        this.btnSearch = btnSearch;
    }

    public WebElementFacade getItemToBeBought() {
        return itemToBeBought;
    }

    public void setItemToBeBought(WebElementFacade itemToBeBought) {
        this.itemToBeBought = itemToBeBought;
    }

    public WebElementFacade getBtnBuy() {
        return btnBuy;
    }

    public void setBtnBuy(WebElementFacade btnBuy) {
        this.btnBuy = btnBuy;
    }

    public WebElementFacade getBtnCart() {
        return btnCart;
    }

    public void setBtnCart(WebElementFacade btnCart) {
        this.btnCart = btnCart;
    }

    public WebElementFacade getBtnCheckout() {
        return btnCheckout;
    }

    public void setBtnCheckout(WebElementFacade btnCheckout) {
        this.btnCheckout = btnCheckout;
    }
}
