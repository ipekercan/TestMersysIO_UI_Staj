package PageObjectModels;

import Utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Locators extends Methods {
    public Locators() {
        PageFactory.initElements(DriverManager.Driver(), this);
    }

    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/span[1]/span/button")
    public WebElement hamburgerButton;
    @FindBy(xpath = "//span[contains(text(),'Messaging')]")
    public WebElement messagingButton;
    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public List<WebElement> messagingList;
    @FindBy(xpath = "//span[contains(text(),'New Message')]")
    public WebElement newMessage;
    @FindBy(xpath = "//span[contains(text(),'Inbox')]")
    public WebElement inbox;
    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outbox;
    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trash;

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement usernameBox;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement passwordBox;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[@class='tox-editor-header']")
    public WebElement editorTitle;
    @FindBy(xpath = "//*[@id=\"container-3\"]/app-user-message-form/mat-card/div/div[1]/ms-button/button")
    public WebElement receiverIkon;
    @FindBy(xpath = "(//div[@class='mdc-checkbox'])[3]")
    public WebElement checkBox;
    @FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement addCloseButton;
    @FindBy(xpath = "//input[@id='ms-text-field-3']")
    public WebElement subjectBox;
    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement editorBox;
    @FindBy(id = "tiny-angular_10674149121702378026393_ifr")
    public WebElement iframe;
    @FindBy(xpath = "//span[text()='Insert']")
    public WebElement insertButton;
    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//div[text()='Table']")
    public WebElement tableButton;
    @FindBy(xpath = "//div[text()='Image...']")
    public WebElement imageButton;
    @FindBy(xpath = "//div[@class='tox-collection__item-label']")
    public List<WebElement> insertList;
    @FindBy(xpath = "//div[@class='tox-collection__item-label']")
    public List<WebElement> editList;
    @FindBy(xpath = "//span[text()='Attach Files...']")
    public WebElement attachFiles;
    @FindBy(xpath = "//span[text()='From Local']")
    public WebElement fromLocal;
    @FindBy(xpath = "//span[text()='Send']")
    public WebElement sendButton;
    @FindBy(xpath = "//*[@id=\"mat-expansion-panel-header-6\"]")
    public WebElement successMessage;
    @FindBy(xpath = "//tbody/tr/td[5]/div")
    public WebElement lastSendedMessageDate;

    @FindBy(xpath = "//*[@id=\"container-3\"]/app-user-message/ms-browse/div")
    public WebElement deletedMessages;//silinmiş mesajların gözüktüğü yer

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon ng-star-inserted'])[3]/..")
    public WebElement deleteIkon;
    @FindBy(xpath = "//div[contains(text(),'Do you want')]")
    public WebElement yesDeleteText;
    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesDeleteButton;
    @FindBy(xpath = "//div[contains(text(),'success')]")
    public WebElement deleteSuccessMessage;

    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-#6B8E23 mat-mdc-button-base mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']")
    public WebElement restoreIkon;
    @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[21]")
    public WebElement deleteTrash;
    @FindBy(xpath = "//div[contains(text(),'Do you want')]")
    public WebElement deleteTrashConfirmMessage;
    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement yesDeleteTrashButton;
    @FindBy(xpath = "//*[@id=\"mat-expansion-panel-header-7\"]/span/mat-panel-description/div")
    public WebElement deleteSuccessTrashMessage;
    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon'])[13]/..")
    public WebElement alert;

}
