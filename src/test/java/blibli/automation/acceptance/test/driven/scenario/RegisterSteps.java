package blibli.automation.acceptance.test.driven.scenario;

import blibli.automation.acceptance.test.driven.behaviour.RegisterBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class RegisterSteps {
    @Steps
    RegisterBehaviour registerBehaviour;

    @Given("open and access home page")
    public void givenOpenHomePage(){
        registerBehaviour.accessBlibliUrl();
    }

    @Given("register new user")
    public void givenRegisterProses(){
        registerBehaviour.clickRegister();
    }

    @Given("search product")
    public void searchProduct(){
        registerBehaviour.searchProduct();
    }

    @When("add to cart")
    public void addToCart(){
        registerBehaviour.addToCart();
    }

    @Then("cart will be added")
    public void isCartAdded(){
        registerBehaviour.isCartAdded();
    }

    @Given("complete form to checkout")
    public void fillForm(){
        registerBehaviour.completeForm();
    }

    @When("submitting checkout form")
    public void submitForm(){
        registerBehaviour.submitForm();
    }

    @Then("continue checkout")
    public void continueCheckout(){
        registerBehaviour.continueCheckout();
    }

    @Given("choose payment method")
    public void choosePayment(){
        registerBehaviour.choosePayment();
    }

    @When("finish checkout submit")
    public void finishCheckout(){
        registerBehaviour.finishCheckout();
    }
}
