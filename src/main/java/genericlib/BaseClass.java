package genericlib;

import objectrepository.Home;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static WebDriver driver;
    private ExcelLib excel = new ExcelLib();

    @Parameters("Browser")
    @BeforeClass
    public void beforeConfigBrowser(String browserName) {
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/ServerFile/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } else if (browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/ServerFile/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }

    }

    @AfterClass
    public void afterConfigBrowser() {
        driver.quit();
    }

    @BeforeMethod
    public void openUrl() throws IOException, InvalidFormatException {
        String url = excel.getExcelData("Home", 0, 1);
        driver.get(url);
    }
    @AfterMethod
    public void returnHome(){
        Home home=PageFactory.initElements(driver,Home.class);
        home.backHome();
    }

}
