package blibli.automation.acceptance.test.driven.behaviour;

import blibli.automation.acceptance.test.driven.Config;
import blibli.automation.acceptance.test.driven.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class CheckoutBehaviour extends RegisterBehaviour {
    private CheckoutPage checkoutPage;

    @Step
    public void completeForm(){
        checkoutPage.getFullNameField().type(Config.FULLNAME);
        checkoutPage.getAddressField().type(Config.ADDRESS);
        checkoutPage.getProvinceSelect().selectByVisibleText(Config.PROVINCE);
        checkoutPage.getCitySelect().selectByVisibleText(Config.CITY);
        checkoutPage.getKecamatanSelect().selectByVisibleText(Config.KECAMATAN);
        checkoutPage.getKelurahanSelect().selectByVisibleText(Config.KELURAHAN);

        //set tanggal lahir
        checkoutPage.getDaySelect().selectByVisibleText(Config.DATE_BIRTH);
        checkoutPage.getMonthSelect().selectByVisibleText(Config.MONTH_BIRTH);
        checkoutPage.getYearSelect().selectByVisibleText(Config.YEAR_BIRTH);
        checkoutPage.getPhoneField().type(Config.PHONE);

        checkoutPage.getBtnSubmit().click();
    }

    @Step
    public void continueCheckout(){
        if(checkoutPage.getDriver().getTitle().equals("Formulir Pengiriman & Pembayaran Blibli.com")){
            checkoutPage.getBtnContinueCheckout().click();
            //tunggu ke halaman checkout
            waitABit(500);
        }
    }

    @Step
    public void finishCheckout(){

    }
}
