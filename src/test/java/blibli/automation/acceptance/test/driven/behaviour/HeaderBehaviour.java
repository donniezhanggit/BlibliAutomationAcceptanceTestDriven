package blibli.automation.acceptance.test.driven.behaviour;

import blibli.automation.acceptance.test.driven.Config;
import blibli.automation.acceptance.test.driven.pages.Header;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class HeaderBehaviour extends ScenarioSteps{
    private static final Logger LOG = LoggerFactory.getLogger(HeaderBehaviour.class);

    private Header header;

    public void waitForLoadingAjax(){
        waitABit(500);
    }

    public void waitForLoadingAngular(){
        waitABit(500);
    }

    @Step
    public void accessBlibliUrl(){
        header.getDriver().get(Config.URL_BLIBLI);
        maximize();
    }

    @Step
    public void clickRegister(){
        header.getBtnDaftar().click();
        header.waitPopUpFadeIn();
        header.getEmail().type(Config.SIGNUP_EMAIL);
        header.getPassword().type(Config.SIGNUP_PASSWORD);
        header.getBtnDaftarSubmit().click();

        //belum tau pake nunggu atau tidak masih perco
        if(header.getDriver().getTitle().equals("Halaman Verifikasi | Blibli.com")){
            header.getBtnVerifPhoneLater().click();
            header.waitPopUpVerifyLater();
            header.getBtnVerifContinue().click();
        }
    }

    @Step
    public void verifyPhone(){

    }

    public void maximize(){
        getDriver().manage().window().maximize();
    }

    public boolean isInHomePage(){
        if(header.getDriver().getTitle().equals("Toko Online Blibli.com, Sensasi Belanja Online Shop ala Mall"))
            return true;
        else
            return false;

    }

}
