package objectrepository;

import genericlib.CommonSeleniumMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxDemo extends CommonSeleniumMethod {
    @FindBy(id = "isAgeSelected")
    private WebElement checkBox;
    @FindBy(id = "txtAge")
    private WebElement message;
    @FindBy(xpath = "//label[text()='Option 1']/input")
    private WebElement checkBox1;
    @FindBy(xpath = "//label[text()='Option 2']/input")
    private WebElement checkBox2;
    @FindBy(xpath = "//label[text()='Option 3']/input")
    private WebElement checkBox3;
    @FindBy(xpath = "//label[text()='Option 4']/input")
    private WebElement checkBox4;

    @FindBy(id = "check1")
    private WebElement checkAll;

    /**
     * This method is used to click the check Box
     */
    public void selectCheckBox() {
        waitForElement(checkBox);
        checkBox.click();
    }

    /**
     * This method is used to click the check Box 1
     */
    public void selectCheckBox1() {
        waitForElement(checkBox1);
        checkBox1.click();
    }

    /**
     * This method is used to click the check Box 2
     */
    public void selectCheckBox2() {
        waitForElement(checkBox2);
        checkBox2.click();
    }

    /**
     * This method is used to click the check Box 3
     */
    public void selectCheckBox3() {
        waitForElement(checkBox3);
        checkBox3.click();
    }

    /**
     * This method is used to click the check Box 4
     */
    public void selectCheckBox4() {
        waitForElement(checkBox4);
        checkBox4.click();
    }


    /**
     * This method is used to get the message displayed on the button
     *
     * @return gives the value of the Button
     */
    public String getStatusButton() {
        return checkAll.getAttribute("value");
    }

    /**
     * This method give confirm massage
     *
     * @return this give confirm massage
     */
    public String getMessage() {
        waitForElement(message);
        return message.getText();
    }

    /**
     * This method used to click check all button
     */
    public void button(){
        waitForElement(checkAll);
        checkAll.click();
    }
    public Boolean[] checkBoxStatus(){
        Boolean []status=new Boolean[4];
        status[0]=checkBox1.isSelected();
        status[1]=checkBox2.isSelected();
        status[2]=checkBox3.isSelected();
        status[3]=checkBox4.isSelected();
        return status;
    }


}
