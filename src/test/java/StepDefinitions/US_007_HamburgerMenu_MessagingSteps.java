package StepDefinitions;

import PageObjectModels.Locators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_007_HamburgerMenu_MessagingSteps {
    Locators locators = new Locators();
    @Then("Verifies that visibility of deleted messages")
    public void verifiesThatVisibilityOfDeletedMessages() {
        Assert.assertTrue(locators.deletedMessages.isDisplayed());
    }

    @And("Clicks the restore ikon")
    public void clicksTheRestoreIkon() {locators.restoreIkon.click();
    }

    @And("Clicks the delete ikon in trashbox")
    public void clicksTheDeleteIkonInTrashbox() {
        locators.deleteTrash.click();
    }

    @Then("Verifies that visibility of confirm message and button in trashbox")
    public void verifiesThatVisibilityOfConfirmMessageAndButtonInTrashbox() {
        Assert.assertTrue(locators.yesDeleteTrashButton.isDisplayed());
        Assert.assertTrue(locators.deleteTrashConfirmMessage.isDisplayed());
    }

    @And("Clicks the delete button")
    public void clicksTheDeleteButton() {
        locators.yesDeleteTrashButton.click();
    }

    @Then("Verifies that success message in trash")
    public void verifiesThatSuccessMessageInTrash() {
        Assert.assertTrue(locators.deleteSuccessTrashMessage.getText().contains("success"));

    }
}
