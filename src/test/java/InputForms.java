import genericlib.BaseClass;
import genericlib.ExcelLib;
import genericlib.ListnerLib;
import objectrepository.CheckboxDemo;
import objectrepository.Home;
import objectrepository.SimpleFormDemo;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(ListnerLib.class)
public class InputForms extends BaseClass {
    private ExcelLib excel = new ExcelLib();

    @Test(retryAnalyzer = ListnerLib.class,priority = 1)
    public void simpleFormTest() throws IOException, InvalidFormatException {
        Reporter.log("Goto The Simple Form Demo Page");
        Home home = PageFactory.initElements(driver, Home.class);
        home.gotoSimpleFormDemo();
        Reporter.log("Retrive the message from the Excel sheet");
        String message = excel.getExcelData("InputForm", 0, 1);
        SimpleFormDemo simpleFormDemo = PageFactory.initElements(driver, SimpleFormDemo.class);
        Reporter.log("Write the message to the Text Box Field");
        simpleFormDemo.writeUserMessage(message);
        Reporter.log("Click the show message Button");
        simpleFormDemo.clickShowMessage();
        Reporter.log("Retrive The displayed Message from the UI");
        String actMessage = simpleFormDemo.displayMessage();
        Reporter.log("Assert the Expected message with the actual message");
        Assert.assertEquals(actMessage, message, "Wrong message Displayed");

        Reporter.log("Retrive A value from The Excel Sheet");
        String a = excel.getExcelData("InputForm", 1, 1);
        Reporter.log("Retrive A value from The Excel Sheet");
        String b = excel.getExcelData("InputForm", 2, 1);
        Reporter.log("Put the value of A into text Field");
        simpleFormDemo.putValueA(a);
        Reporter.log("Put the value of B into text Field");
        simpleFormDemo.putValueB(b);
        Reporter.log("Click The get total Button to get the Summation");
        simpleFormDemo.getTotal();
        Reporter.log("Retrive the total value from the UI");
        String actTotal = simpleFormDemo.displayValue();
        Reporter.log("Assert The Actual sum with the expected sum");
        Assert.assertEquals(Integer.parseInt(actTotal), Integer.parseInt(a) + Integer.parseInt(b), "Wrong Addition Displayed");
    }

    @Test(priority = 2)
    public void checkBoxTest() throws IOException, InvalidFormatException {
        Reporter.log("Goto Vheckbox demo page");
        Home home = PageFactory.initElements(driver, Home.class);
        home.gotoCheckboxDemo();
        Reporter.log("Select the first CheckBox ");
        CheckboxDemo checkBoxDemo = PageFactory.initElements(driver, CheckboxDemo.class);
        checkBoxDemo.selectCheckBox();
        Reporter.log("Retrive the Actual message after selecting chekbox");
        String actMessage = checkBoxDemo.getMessage();
        Reporter.log("Retrive the Expected message from excel Sheet");
        String expMessage = excel.getExcelData("CheckBox", 8, 1);
        Reporter.log("Assert the actual message with Expected message");
        Assert.assertEquals(actMessage, expMessage, "Wrong Message Displayed");
        Reporter.log("Click the check all button");
        checkBoxDemo.button();
        Reporter.log("Retrive the status of all check box");
        Boolean[] actStatus = checkBoxDemo.checkBoxStatus();
        Boolean[] expStatus = {true, true, true, true};
        Reporter.log("Assert the status with expected status");
        Assert.assertEquals(actStatus, expStatus, "All textbox are not Checked");
        Reporter.log("Retrive the status of the Button");
        String actButtonMessage = checkBoxDemo.getStatusButton();
        Reporter.log("Retrive the expected status frm excel sheet");
        String expButtonMessage = excel.getExcelData("CheckBox", 6, 1);
        Reporter.log("Assert the expected button status with actual button status");
        Assert.assertEquals(actButtonMessage, expButtonMessage, "Wrong message Displayed");

    }
}
