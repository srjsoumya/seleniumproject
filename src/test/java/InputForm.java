import genericlib.BaseClass;
import genericlib.ExcelLib;
import genericlib.ListnerLib;
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
public class InputForm extends BaseClass {
    ExcelLib excel=new ExcelLib();

    @Test(retryAnalyzer=ListnerLib.class)
    public void inputFormsTest() throws IOException, InvalidFormatException, InterruptedException {
        Reporter.log("Goto The Simple Form Demo Page");
        Home home=PageFactory.initElements(driver,Home.class);
        home.gotoSimpleFormDemo();
        Reporter.log("Retrive the message from the Excel sheet");
        String message=excel.getExcelData("InputForm",0,1);
        SimpleFormDemo simpleFormDemo=PageFactory.initElements(driver,SimpleFormDemo.class);
        Reporter.log("Write the message to the Text Box Field");
        simpleFormDemo.writeUserMessage(message);
        Reporter.log("Click the show message Button");
        simpleFormDemo.clickShowMessage();
        Reporter.log("Retrive The displayed Message from the UI");
        String actMessage=simpleFormDemo.displayMessage();
        Reporter.log("Assert the Expected message with the actual message");
        Assert.assertEquals(actMessage,message,"Wrong message Displayed");

        Reporter.log("Retrive A value from The Excel Sheet");
        String a=excel.getExcelData("InputForm",1,1);
        Reporter.log("Retrive A value from The Excel Sheet");
        String b=excel.getExcelData("InputForm",2,1);
        Reporter.log("Put the value of A into text Field");
        simpleFormDemo.putValueA(a);
        Reporter.log("Put the value of B into text Field");
        simpleFormDemo.putValueB(b);
        Reporter.log("Click The get total Button to get the Summation");
        simpleFormDemo.getTotal();
        Reporter.log("Retrive the total value from the UI");
        String actTotal=simpleFormDemo.displayValue();
        Reporter.log("Assert The Actual sum with the expected sum");
        Assert.assertEquals(Integer.parseInt(actTotal),Integer.parseInt(a)+Integer.parseInt(b),"Wrong Addition Displayed");
    }
}
