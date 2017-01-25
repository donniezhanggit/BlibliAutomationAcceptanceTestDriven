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

    public void waitPopUpFadeIn(){
        waitForPresenceOf("//div[contains(@class, 'modal-content') and @modal-transclude]");
    }

    public void waitPopUpFadeOut(){
        waitForAbsenceOf("//div[contains(@class, 'modal-content') and @modal-transclude]");
    }

}
