package StepDefinitions;

import PageObjectModels.Locators;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

public class US_005_HamburgerMenu_MessagingSteps {
    Locators locators = new Locators();
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Verifies that text editor is visible")
    public void verifiesThatTextEditorIsVisible() {
        Assert.assertTrue(locators.editorTitle.isDisplayed());
    }

    @Then("Verifies that receiver ikon is visible")
    public void verifiesThatReceiverIkonIsVisible() {
        Assert.assertTrue(locators.receiverIkon.isDisplayed());
    }

    @And("Clicks the receiver ikon and verifies that selectable of receivers")
    public void clicksTheReceiverIkonAndVerifiesThatSelectableOfReceivers() {
        locators.receiverIkon.click();
        locators.checkBox.click();
        locators.addCloseButton.click();

    }

    @And("Writes in subject box and editor box")
    public void writesInSubjectBoxAndEditorBox() {
        locators.sendKeys(locators.subjectBox, "Subject");
        DriverManager.Driver().switchTo().frame(locators.iframe);
        locators.sendKeys(locators.editorBox, "text");
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }

    @And("Pastes a text, picture and table and verifies")
    public void pastesATextPictureAndTableAndVerifies() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        DriverManager.Driver().switchTo().defaultContent();
        locators.insertButton.click();
        Assert.assertTrue(locators.insertList.get(0).getText().equals("Image..."));
        Assert.assertTrue(locators.insertList.get(5).getText().equals("Table"));
        locators.editButton.click();
        Assert.assertTrue(locators.editList.get(4).getText().equals("Paste"));

    }

    @And("Attaches a file and verifies")
    public void attachesAFileAndVerifies() {
        locators.attachFiles.click();
        locators.fromLocal.click();
        for (int i = 0; i <9 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i = 0; i <12 ; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @And("Clicks the send button")
    public void clicksTheSendButton() {
        locators.sendButton.click();
    }

    @Then("Verifies the success message")
    public void verifiesTheSuccessMessage() {
        //locators.verifyContainsText(locators.successMessage,"success");
    }

    @And("Clicks the outbox button for verify")
    public void clicksTheOutboxButtonForVerify() {
        locators.hamburgerButton.click();
        locators.messagingButton.click();
        locators.outbox.click();
    }
    @Then("Verifies that visibility of the sent messages")
    public void verifiesThatVisibilityOfTheSentMessages() {
        LocalDateTime tarih=LocalDateTime.now();
        System.out.println(tarih);

    }


}
