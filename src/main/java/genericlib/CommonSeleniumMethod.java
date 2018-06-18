package genericlib;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSeleniumMethod extends BaseClass {
    public void mouseHover(WebElement webElement){
        Actions action=new Actions(driver);
        action.moveToElement(webElement).perform();

    }
    public void pageDown(){
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();

    }
    public void waitForElement(WebElement webelement){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(webelement));
    }
}
