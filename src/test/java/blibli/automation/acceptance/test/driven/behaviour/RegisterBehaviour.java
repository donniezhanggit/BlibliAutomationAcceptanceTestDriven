package blibli.automation.acceptance.test.driven.behaviour;

import blibli.automation.acceptance.test.driven.Config;
import blibli.automation.acceptance.test.driven.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
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


    public void maximize(){
        getDriver().manage().window().maximize();
    }



}
