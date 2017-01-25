package blibli.automation.acceptance.test.driven.behaviour;

import blibli.automation.acceptance.test.driven.Config;
import blibli.automation.acceptance.test.driven.pages.ShopPage;
import junit.framework.TestCase;
import net.thucydides.core.annotations.Step;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class ShopBehaviour extends RegisterBehaviour {
    private ShopPage shopPage;

    @Step
    public void searchProduct(){
        if(!isInHomePage()){
            //register lagi mungkin. atau login.
        }
        shopPage.getSearchField().type(Config.SEARCH_PRODUCT);
        shopPage.getBtnSearch().click();
        //tunggu hasil pencarian
        waitABit(500);

    }

    @Step
    public void addToCart(){
        //add to cart
        Config.ITEM_BOUGHT = shopPage.getItemToBeBought().getText();
        shopPage.getItemToBeBought().click();
    }

    @Step
    public void buyProduct(){
        //tunggu halaman detail product
        waitABit(500);
        shopPage.getBtnBuy().click();
        shopPage.getBtnCart().click();
        shopPage.getBtnCheckout().click();
    }

    @Step
    public void isCartAdded(){
        TestCase.assertTrue(shopPage.getProductInfo().getText().equals(Config.ITEM_BOUGHT));
    }

    public boolean isInHomePage(){
        if(shopPage.getDriver().getTitle().equals("Toko Online Blibli.com, Sensasi Belanja Online Shop ala Mall"))
            return true;
        else
            return false;
    }




}
