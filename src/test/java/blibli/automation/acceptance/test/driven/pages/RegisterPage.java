package blibli.automation.acceptance.test.driven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class RegisterPage extends PageObject {
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

    @FindBy(ngModel = "searchParam")
    private WebElementFacade searchField;

    @FindBy(ngModel = "gdn-search-button")
    private WebElementFacade btnSearch;

    @FindBy(xpath = ".//*[@id='catalogProductListContentDiv']/div[1]/div/a/div/div/div/div[2]")
    private WebElementFacade itemToBeBought;

    @FindBy(id = "MyBtn")
    private WebElementFacade btnBuy;

    @FindBy(id = "gdn-cart-button")
    private WebElementFacade btnCart;

    @FindBy(id = "gdn-sb-page-continue-checkout")
    private WebElementFacade btnCheckout;

    @FindBy(className = "bag-product-title ng-binding")
    private WebElementFacade productInfo;

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

    public WebElementFacade getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(WebElementFacade productInfo) {
        this.productInfo = productInfo;
    }

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
