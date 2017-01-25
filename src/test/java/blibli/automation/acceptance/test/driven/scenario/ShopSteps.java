package blibli.automation.acceptance.test.driven.scenario;

import blibli.automation.acceptance.test.driven.behaviour.ShopBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class ShopSteps {
    @Steps
    ShopBehaviour shopBehaviour;

    @Given("search product")
    public void searchProduct(){
        shopBehaviour.searchProduct();
    }

    @When("add to cart")
    public void addToCart(){
        shopBehaviour.addToCart();
    }

    @Then("cart will be added")
    public void isCartAdded(){
        shopBehaviour.isCartAdded();
    }
}
