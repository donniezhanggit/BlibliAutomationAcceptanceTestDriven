package blibli.automation.acceptance.test.driven.behaviour;

import blibli.automation.acceptance.test.driven.Config;
import blibli.automation.acceptance.test.driven.pages.RegisterPage;
import junit.framework.TestCase;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class RegisterBehaviour extends ScenarioSteps{
    private static final Logger LOG = LoggerFactory.getLogger(RegisterBehaviour.class);

    RegisterPage registerPage;

    public void waitForLoadingAjax(){
        waitABit(500);
    }

    public void waitForLoadingAngular(){
        waitABit(500);
    }

    @Step
    public void accessBlibliUrl(){
        registerPage.getDriver().get(Config.URL_BLIBLI);
        maximize();
    }

    @Step
    public void clickRegister(){
        registerPage.getBtnDaftar().click();
        registerPage.waitPopUpFadeIn();
        registerPage.getEmail().type(Config.SIGNUP_EMAIL);
        registerPage.getPassword().type(Config.SIGNUP_PASSWORD);
        registerPage.getBtnDaftarSubmit().click();


    }

    @Step
    public void checkVerificationPage(){
        //belum tau pake nunggu atau tidak masih perco
        if(registerPage.getDriver().getTitle().equals("Halaman Verifikasi | Blibli.com")){
            registerPage.getBtnVerifPhoneLater().click();
            registerPage.waitPopUpVerifyLater();
            registerPage.getBtnVerifContinue().click();
        }
    }

    @Step
    public void searchProduct(){
        if(!isInHomePage()){
            //register lagi mungkin. atau login.
        }

        //registerPage.getSearchField().type(Config.SEARCH_PRODUCT);
        registerPage.getSearchField().type(Config.SEARCH_PRODUCT).sendKeys(Keys.ENTER);
        //registerPage.getBtnSearch().click();
        //tunggu hasil pencarian
         waitABit(500);

    }

    @Step
    public void addToCart(){
        //add to cart
        Config.ITEM_BOUGHT = registerPage.getItemToBeBought().getText();
        registerPage.getItemToBeBought().click();
    }

    @Step
    public void buyProduct(){
        //tunggu halaman detail product
        waitABit(500);
        registerPage.getBtnBuy().click();
        registerPage.getBtnCart().click();
        registerPage.getBtnCheckout().click();
    }

    @Step
    public void isCartAdded(){
//        TestCase.assertTrue(registerPage.getProductInfo().getText().equals(Config.ITEM_BOUGHT));
    }

    @Step
    public void completeForm(){
        registerPage.getFullNameField().type(Config.FULLNAME);
        registerPage.getAddressField().type(Config.ADDRESS);
        registerPage.getProvinceSelect().selectByVisibleText(Config.PROVINCE);
        registerPage.getCitySelect().selectByVisibleText(Config.CITY);
        registerPage.getKecamatanSelect().selectByVisibleText(Config.KECAMATAN);
        registerPage.getKelurahanSelect().selectByVisibleText(Config.KELURAHAN);

        //set tanggal lahir
        registerPage.getDaySelect().selectByVisibleText(Config.DATE_BIRTH);
        registerPage.getMonthSelect().selectByVisibleText(Config.MONTH_BIRTH);
        registerPage.getYearSelect().selectByVisibleText(Config.YEAR_BIRTH);
        registerPage.getRbMan().click();
        registerPage.getPhoneField().type(Config.PHONE);
    }

    @Step
    public void submitForm(){
        registerPage.getBtnSubmit().click();
    }

    @Step
    public void continueCheckout(){
        TestCase.assertTrue(registerPage.getDriver().getTitle().equals("Formulir Pengiriman & Pembayaran Blibli.com"));
        registerPage.getBtnContinueCheckout().click();
        //tunggu ke halaman checkout
        waitABit(500);
    }

    @Step
    public void choosePayment(){
        registerPage.getRbTransfer().click();
        registerPage.getBankSelect().selectByVisibleText(Config.BANK);
    }

    @Step
    public void finishCheckout(){
        registerPage.getBtnPayNow().click();
        //tunggu ke halaman terima kasih,transaksi diproses
        waitABit(500);
    }

    public boolean isInHomePage(){
        if(registerPage.getDriver().getTitle().equals("Toko Online Blibli.com, Sensasi Belanja Online Shop ala Mall"))
            return true;
        else
            return false;
    }


    public void maximize(){
        getDriver().manage().window().maximize();
    }



}
