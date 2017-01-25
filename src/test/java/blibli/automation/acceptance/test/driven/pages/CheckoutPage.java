package blibli.automation.acceptance.test.driven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class CheckoutPage extends PageObject {
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


    public WebElementFacade getFullNameField() {
        return fullNameField;
    }

    public void setFullNameField(WebElementFacade fullNameField) {
        this.fullNameField = fullNameField;
    }

    public WebElementFacade getAddressField() {
        return addressField;
    }

    public void setAddressField(WebElementFacade addressField) {
        this.addressField = addressField;
    }

    public WebElementFacade getProvinceSelect() {
        return provinceSelect;
    }

    public void setProvinceSelect(WebElementFacade provinceSelect) {
        this.provinceSelect = provinceSelect;
    }

    public WebElementFacade getCitySelect() {
        return citySelect;
    }

    public void setCitySelect(WebElementFacade citySelect) {
        this.citySelect = citySelect;
    }

    public WebElementFacade getKecamatanSelect() {
        return kecamatanSelect;
    }

    public void setKecamatanSelect(WebElementFacade kecamatanSelect) {
        this.kecamatanSelect = kecamatanSelect;
    }

    public WebElementFacade getKelurahanSelect() {
        return kelurahanSelect;
    }

    public void setKelurahanSelect(WebElementFacade kelurahanSelect) {
        this.kelurahanSelect = kelurahanSelect;
    }

    public WebElementFacade getDaySelect() {
        return daySelect;
    }

    public void setDaySelect(WebElementFacade daySelect) {
        this.daySelect = daySelect;
    }

    public WebElementFacade getMonthSelect() {
        return monthSelect;
    }

    public void setMonthSelect(WebElementFacade monthSelect) {
        this.monthSelect = monthSelect;
    }

    public WebElementFacade getYearSelect() {
        return yearSelect;
    }

    public void setYearSelect(WebElementFacade yearSelect) {
        this.yearSelect = yearSelect;
    }

    public WebElementFacade getPhoneField() {
        return phoneField;
    }

    public void setPhoneField(WebElementFacade phoneField) {
        this.phoneField = phoneField;
    }

    public WebElementFacade getRbMan() {
        return rbMan;
    }

    public void setRbMan(WebElementFacade rbMan) {
        this.rbMan = rbMan;
    }

    public WebElementFacade getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(WebElementFacade btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public WebElementFacade getBtnContinueCheckout() {
        return btnContinueCheckout;
    }

    public void setBtnContinueCheckout(WebElementFacade btnContinueCheckout) {
        this.btnContinueCheckout = btnContinueCheckout;
    }

    public WebElementFacade getRbTransfer() {
        return rbTransfer;
    }

    public void setRbTransfer(WebElementFacade rbTransfer) {
        this.rbTransfer = rbTransfer;
    }

    public WebElementFacade getBankSelect() {
        return bankSelect;
    }

    public void setBankSelect(WebElementFacade bankSelect) {
        this.bankSelect = bankSelect;
    }

    public WebElementFacade getBtnPayNow() {
        return btnPayNow;
    }

    public void setBtnPayNow(WebElementFacade btnPayNow) {
        this.btnPayNow = btnPayNow;
    }
}
