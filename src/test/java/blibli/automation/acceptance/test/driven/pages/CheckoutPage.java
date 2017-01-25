package blibli.automation.acceptance.test.driven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class CheckoutPage {
    @FindBy(id = "gdn-profile-name")
    private WebElementFacade fullNameField;

    @FindBy(name = "address")
    private WebElementFacade addressField;

    @FindBy(xpath = ".//*[@id='profileForm']/div[2]/div[3]/div[1]/select")
    private WebElementFacade provinceSelect;

    @FindBy(xpath = ".//*[@id='profileForm']/div[2]/div[3]/div[2]/select")
    private WebElementFacade citySelect;

    @FindBy(xpath = ".//*[@id='profileForm']/div[2]/div[4]/div[1]/select")
    private WebElementFacade kecamatanSelect;

    @FindBy(xpath = ".//*[@id='profileForm']/div[2]/div[4]/div[2]/select")
    private WebElementFacade kelurahanSelect;

    @FindBy(id = "gdn-profile-day")
    private WebElementFacade daySelect;

    @FindBy(id = "gdn-profile-month")
    private WebElementFacade monthSelect;

    @FindBy(id = "gdn-profile-year")
    private WebElementFacade yearSelect;

    @FindBy(id = "gdn-profile-phone")
    private WebElementFacade phoneField;

    @FindBy(xpath = ".//*[@id='profileForm']/div[5]/div/div/span[1]/input")
    private WebElementFacade rbMan;

    @FindBy(id = "gdn-profile-submit")
    private WebElementFacade btnSubmit;

    @FindBy(id = "gdn-next-step")
    private WebElementFacade btnContinueCheckout;

    @FindBy(id = "gdn-payment-group-virtual-account")
    private WebElementFacade rbTransfer;

    @FindBy(id = "gdn-payment-option-virtual-account-1")
    private WebElementFacade bankSelect;

    @FindBy(id = "gdn-submit-checkout")
    private WebElementFacade btnPayNow;





}
