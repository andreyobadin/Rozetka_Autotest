package ua.com.rozetka.pages;

import org.openqa.selenium.By;

public class myRozetkaPage extends ua.com.rozetka.driverSettings.driverConf{
    private String urlMyRozetkaHome = "https://my.rozetka.com.ua/";
    private By bayPButton = By.xpath("//*[@id=\"cart-popup\"]/div[2]/div[2]/div[3]/span/span/a");
    private By nickUser = By.xpath("//*[@id=\"personal_information\"]/div/div/div[2]/div/div/div[1]/div[2]/div");
    private By bayPlace = By.xpath("//*[@id=\"sidebar-menu\"]/li[4]/a/span");


public myRozetkaPage openPage() {
        open(urlMyRozetkaHome);
        return this;
    }
public String nickUser(){
    return find(nickUser).getText();
}

public myRozetkaPage contBay() {
    find(bayPlace).click();
    return this;
}

    public orderPage bayProd() {
        find(bayPButton).click();
        return new orderPage();
    }


}