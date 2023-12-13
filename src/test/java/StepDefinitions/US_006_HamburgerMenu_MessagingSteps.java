package StepDefinitions;

import PageObjectModels.Locators;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_006_HamburgerMenu_MessagingSteps {
    Locators locators = new Locators();

    @When("Clicks on hamburger button,messaging button and outbox in order")
    public void clicksOnHamburgerButtonMessagingButtonAndOutboxInOrder() {
        locators.hamburgerButton.click();
        locators.messagingButton.click();
        locators.outbox.click();
   /*     if(locators.alert.isEnabled()) {
        locators.alert.click();
        }*/
    }
    @Then("Verifies that visibility of delete ikon")
    public void verifiesThatVisibilityOfDeleteIkon() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.deleteIkon));
        Assert.assertTrue(locators.deleteIkon.isDisplayed());
    }

    @And("Clicks the delete ikon")
    public void clicksTheDeleteIkon() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.deleteIkon));
        locators.deleteIkon.click();
    }

    @Then("Verifies that visibility of confirm message and button")
    public void verifiesThatVisibilityOfConfirmMessageAndButton() {
        Assert.assertTrue(locators.yesDeleteText.getText().contains("Do you want"));
    }

    @And("Clicks the confirm button")
    public void clicksTheConfirmButton() {
        locators.yesDeleteButton.click();
    }

    @Then("Verifies that success message")
    public void verifiesThatSuccessMessage() {
        Assert.assertTrue(locators.deleteSuccessMessage.getText().contains("success"));

    }


}
