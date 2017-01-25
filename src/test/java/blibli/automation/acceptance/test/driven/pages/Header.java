package blibli.automation.acceptance.test.driven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class Header extends PageObject {
    @FindBy(id = "registrationFormEmailAddress")
    private WebElementFacade email;

    @FindBy(id = "registrationFormPassword")
    private WebElementFacade password;

    @FindBy(id = "gdn-daftar")
    private WebElementFacade btnDaftar;

    @FindBy(id = "gdn-submit-registration")
    private WebElementFacade btnDaftarSubmit;

    @FindBy(id = "gdn-pnv-later")
    private WebElementFacade btnVerifPhoneLater;

    @FindBy(id = "gdn-pnv-later-continue")
    private WebElementFacade btnVerifContinue;

    public void waitPopUpFadeIn(){
        waitForPresenceOf("//div[contains(@class, 'modal-content') and @modal-transclude]");
    }


    public void waitPopUpFadeOut(){
        waitForAbsenceOf("//div[contains(@class, 'modal-content') and @modal-transclude]");
    }


    public void waitPopUpVerifyLater(){
        waitForPresenceOf(".//*[@id='gdn-pnv-later-popup']/div");
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public void setEmail(WebElementFacade email) {
        this.email = email;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public void setPassword(WebElementFacade password) {
        this.password = password;
    }

    public WebElementFacade getBtnDaftar() {
        return btnDaftar;
    }

    public void setBtnDaftar(WebElementFacade btnDaftar) {
        this.btnDaftar = btnDaftar;
    }

    public WebElementFacade getBtnDaftarSubmit() {
        return btnDaftarSubmit;
    }

    public void setBtnDaftarSubmit(WebElementFacade btnDaftarSubmit) {
        this.btnDaftarSubmit = btnDaftarSubmit;
    }

    public WebElementFacade getBtnVerifPhoneLater() {
        return btnVerifPhoneLater;
    }

    public void setBtnVerifPhoneLater(WebElementFacade btnVerifPhoneLater) {
        this.btnVerifPhoneLater = btnVerifPhoneLater;
    }

    public WebElementFacade getBtnVerifContinue() {
        return btnVerifContinue;
    }

    public void setBtnVerifContinue(WebElementFacade btnVerifContinue) {
        this.btnVerifContinue = btnVerifContinue;
    }
}
