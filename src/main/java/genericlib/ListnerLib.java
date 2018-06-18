package genericlib;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

import java.io.File;
import java.io.IOException;

public class ListnerLib extends RetryAnalyzerCount implements ITestListener {
    int count=0;
    int maxTry=4;


    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {
        String methodName=result.getMethod().getMethodName();
        EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.driver);
        File scrFile=eDriver.getScreenshotAs(OutputType.FILE);
        File desFile=new File("Screenshot/"+methodName+".png");
        try {
            FileUtils.copyFile(scrFile,desFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }

    public boolean retryMethod(ITestResult result) {
        while (count<maxTry)
        {
            count++;
            return true;
        }
        return false;
    }
}
