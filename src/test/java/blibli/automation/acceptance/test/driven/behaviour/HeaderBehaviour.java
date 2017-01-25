package blibli.automation.acceptance.test.driven.behaviour;

import blibli.automation.acceptance.test.driven.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by isdzulqor on 1/25/17.
 */
public class HeaderBehaviour extends ScenarioSteps{

    private HomePage homePage;

    public void waitForLoadingAjax(){
        waitABit(500);
    }

    public void waitForLoadingAngular(){
        waitABit(500);
    }

    @Step
    public void clickRegister(){

    }
}
