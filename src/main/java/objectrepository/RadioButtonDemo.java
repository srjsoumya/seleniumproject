package objectrepository;

import genericlib.CommonSeleniumMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonDemo extends CommonSeleniumMethod {
    @FindBy(xpath = "//input[@value='Male' and @name='optradio']")
    private WebElement radioMale;

    public void selectMale() {
        waitForElement(radioMale);
        radioMale.click();

    }

    @FindBy(xpath = "//input[@value='Female' and @name='optradio']")
    private WebElement radioFemale;

    public void selectFemale() {
        waitForElement(radioFemale);
        radioFemale.click();
    }

    @FindBy(id = "buttoncheck")
    private WebElement getCheckedValue;

    public void checkButtonClick() {
        waitForElement(getCheckedValue);
        getCheckedValue.click();
    }

    @FindBy(className = "radiobutton")
    private WebElement statusRadioButton;

    public String statusRadio() {
        waitForElement(statusRadioButton);
        return statusRadioButton.getText();
    }

    @FindBy(xpath = "//input[@value='Female' and @name='gender']")
    private WebElement radioFemaleGender;

    public void selectFemaleGender() {
        waitForElement(radioFemaleGender);
        radioFemaleGender.click();
    }

    @FindBy(xpath = "//input[@value='Male' and @name='gender']")
    private WebElement radioMaleGender;

    public void selectMaleGender() {
        waitForElement(radioMaleGender);
        radioMaleGender.click();
    }

    @FindBy(xpath = "//input[@value='0 - 5']")
    private WebElement age05;

    public void selectage05() {
        waitForElement(age05);
        age05.click();
    }

    @FindBy(xpath = "//input[@value='5 - 15']")
    private WebElement age515;

    public void selectage515() {
        waitForElement(age515);
        age515.click();
    }

    @FindBy(xpath = "//input[@value='15 - 50']")
    private WebElement age1550;

    public void selectage1550() {
        waitForElement(age1550);
        age1550.click();
    }

    @FindBy(xpath = "//button[text()='Get values']")
    private WebElement getValueButton;

    public void clickValueButton() {
        waitForElement(getValueButton);
        getValueButton.click();
    }

    @FindBy(className = "groupradiobutton")
    private WebElement statusGroupButton;

    public String getStatusGroup() {
        waitForElement(statusGroupButton);
        return statusGroupButton.getText();
    }


}
