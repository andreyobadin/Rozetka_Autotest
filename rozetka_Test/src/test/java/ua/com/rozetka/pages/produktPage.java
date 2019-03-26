package ua.com.rozetka.pages;

import org.openqa.selenium.By;

public class produktPage extends ua.com.rozetka.driverSettings.driverConf {
    private By nameP = By.xpath("//*[@id=\"content-inner-block\"]/div[3]/div/header/div[2]/div/h1");
    private By priceP = By.xpath("//*[@id=\"price_label\"]");
    private By bayPButton = By.xpath("//*[@id=\"price_container\"]/div[2]/div/form/span/span/button");
    private By codeP = By.xpath("//*[@id=\"content-inner-block\"]/div[3]/div/header/div[1]/div/div/span");
    private By buttonStopBay = By.xpath("//*[@id=\"cart-popup\"]/div[2]/div[2]/div[3]/span/span/a");
    private By buttonNextBay = By.xpath(")//*[@id=\"popup-checkout\"]");

    public String getNameP() {
        return getActualText(nameP);
    }

    public String getpriceP() {
        return getActualText(priceP);
    }

    public String getCodeP() {
        return getActualText(codeP);
    }

    public produktPage putProd() {
        find(bayPButton).click();
        find(buttonStopBay).click();
        delay(1000);
        return this;
    }
    public orderPage bayProd() {
        find(bayPButton).click();
        delay(1000);
        find(buttonNextBay).click();
        return new orderPage();
    }
}
