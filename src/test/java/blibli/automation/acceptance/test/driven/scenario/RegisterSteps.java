package blibli.automation.acceptance.test.driven.scenario;

import blibli.automation.acceptance.test.driven.behaviour.RegisterBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

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


}
