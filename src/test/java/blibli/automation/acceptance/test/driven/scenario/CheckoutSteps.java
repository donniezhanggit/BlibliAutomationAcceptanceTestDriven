package blibli.automation.acceptance.test.driven.scenario;

import blibli.automation.acceptance.test.driven.behaviour.CheckoutBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class CheckoutSteps {
    @Steps
    CheckoutBehaviour checkoutBehaviour;

    @Given("complete form to checkout")
    public void fillForm(){
        checkoutBehaviour.completeForm();
    }

    @When("submitting checkout form")
    public void submitForm(){
        checkoutBehaviour.submitForm();
    }

    @Then("continue checkout")
    public void continueCheckout(){
        checkoutBehaviour.continueCheckout();
    }

    @Given("choose payment method")
    public void choosePayment(){
        checkoutBehaviour.choosePayment();
    }

    @When("finish checkout submit")
    public void finishCheckout(){
        checkoutBehaviour.finishCheckout();
    }
}
