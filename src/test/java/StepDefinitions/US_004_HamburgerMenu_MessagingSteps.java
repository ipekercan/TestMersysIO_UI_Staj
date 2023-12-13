package StepDefinitions;

import PageObjectModels.Locators;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.LocalDate;

public class US_004_HamburgerMenu_MessagingSteps {
    Locators locators = new Locators();
    Actions actions = new Actions(DriverManager.Driver());

    @Given("The user navigates to website")
    public void theUserNavigatesToWebsite() {
        DriverManager.Driver().get("https://test.mersys.io/");
        locators.usernameBox.sendKeys("Student_3");
        locators.passwordBox.sendKeys("S12345");
        locators.loginButton.click();
    }

    @When("Clicks the hamburger button")
    public void clicksTheHamburgerButton() {
        locators.hamburgerButton.click();
    }

    @And("Hover over messaging feature")
    public void hoverOverMessagingFeature() {
        actions.moveToElement(locators.messagingButton).build().perform();
    }

    @And("Verifies that new message,inbox,outbox and trash are visible")
    public void verifiesThatNewMessageInboxOutboxAndTrashAreVisible() {
        for (int i = 5; i < locators.messagingList.size(); i++) {
            if (locators.messagingList.get(i).getText().equals("New Message")) {
                System.out.println(locators.messagingList.get(i).getText());
            } else if (locators.messagingList.get(i).getText().equals("Inbox")) {
                System.out.println(locators.messagingList.get(i).getText());
            } else if (locators.messagingList.get(i).getText().equals("Outbox")) {
                System.out.println(locators.messagingList.get(i).getText());
            } else if (locators.messagingList.get(i).getText().equals("Trash")) {
                System.out.println(locators.messagingList.get(i).getText());
            } else {
                System.out.println("Not found element! ");
            }
        }
    }

    @And("Clicks the new message feature")
    public void clicksTheNewMessageFeature() {
        locators.newMessage.click();

    }

    @Then("Verifies that current url contains word of new")
    public void verifiesThatCurrentUrlContainsWordOfNew() {
        DriverManager.getWait().until(ExpectedConditions.urlContains("new"));
    }

    @And("Clicks the inbox feature")
    public void clicksTheInboxFeature() {
        locators.inbox.click();
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.hamburgerButton));

    }

    @Then("Verifies that current url contains word of inbox")
    public void verifiesThatCurrentUrlContainsWordOfInbox() {
        DriverManager.getWait().until(ExpectedConditions.urlContains("inbox"));
    }

    @And("Clicks the outbox feature")
    public void clicksTheOutboxFeature() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.outbox));
        locators.jsClick(locators.inbox);
    }

    @Then("Verifies that current url contains word of outbox")
    public void verifiesThatCurrentUrlContainsWordOfOutbox() {
        DriverManager.getWait().until(ExpectedConditions.urlContains("outbox"));
    }

    @And("Clicks the trash feature")
    public void clicksTheTrashFeature() {
        locators.trash.click();
    }

    @Then("Verifies that current url contains word of trash")
    public void verifiesThatCurrentUrlContainsWordOfTrash() {
        DriverManager.getWait().until(ExpectedConditions.urlContains("trash"));
    }

}
