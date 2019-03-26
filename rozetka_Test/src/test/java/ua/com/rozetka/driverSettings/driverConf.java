package ua.com.rozetka.driverSettings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class driverConf extends ua.com.rozetka.base.baseClass{

    static WebDriver driver;

    public WebDriver getDriver () {
        return driver;
    }

    @Before
    public void setUp() {
        initializeDriver();
        setPropertyWindow();
        setPropertyTimeOut();
    }

    @After
    public void closeDown() {
        driver.close();
    }

    public WebDriver initializeDriver() {
        System.getProperty("webdriver.chrome.driver","C://Users//Imobilko//IdeaProjects//rozetka_Test");
        driver = new ChromeDriver();
        return driver;
    }

    public WebDriver setPropertyWindow() {
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver setPropertyTimeOut() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;
    }
}
