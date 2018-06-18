package objectrepository;

import genericlib.CommonSeleniumMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemo extends CommonSeleniumMethod {
    @FindBy(id = "user-message")
    private WebElement userMessage;

    /**
     * This method write Data to the text Box
     *
     * @param input This is the input which will write into the text Box
     */
    public void writeUserMessage(String input) {
        waitForElement(userMessage);
        userMessage.click();
        userMessage.sendKeys(input);
    }

    @FindBy(xpath = "//button[text()='Show Message']")
    private WebElement submitButton;

    /**
     * This methos used to show message in text box by clicking the  show message button
     */
    public void clickShowMessage() {
        waitForElement(submitButton);
        submitButton.click();
    }

    @FindBy(id = "display")
    private WebElement message;

    /**
     * This method used to get displayed message which is appear after clicking show message button
     *
     * @return this give the displayed message
     */
    public String displayMessage() {
        waitForElement(message);
        return message.getText();
    }

    @FindBy(id = "sum1")
    private WebElement valueA;

    /**
     * This method used to put value of A to text box
     *
     * @param a this is the value of A
     */
    public void putValueA(String a) {
        waitForElement(valueA);
        valueA.sendKeys(a);
    }

    @FindBy(id = "sum2")
    private WebElement valueB;

    /**
     * This method used to put value of A to text box
     *
     * @param b this is the value of A
     */
    public void putValueB(String b) {
        waitForElement(valueB);
        valueB.sendKeys(b);
    }

    @FindBy(xpath = "//button[text()='Get Total']")
    private WebElement getTotalButton;

    /**
     * this method used to get the sum of A and B
     */
    public void getTotal() {
        waitForElement(getTotalButton);
        getTotalButton.click();
    }

    @FindBy(id = "displayvalue")
    private WebElement value;

    /**
     * This method is used to get Sum of A And B which is displayed after getting the sum
     *
     * @return this is the summation of A And B
     */
    public String displayValue() {
        waitForElement(value);
        return value.getText();
    }


}
