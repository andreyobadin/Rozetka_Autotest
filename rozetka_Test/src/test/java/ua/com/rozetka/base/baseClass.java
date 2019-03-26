package ua.com.rozetka.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class baseClass {
    public abstract WebDriver getDriver();

    public void open(String url) {
        getDriver().get(url);
    }

    public WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    public String getActualText(By locator) {
        return find(locator).getText();
    }

    public void delay (long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
