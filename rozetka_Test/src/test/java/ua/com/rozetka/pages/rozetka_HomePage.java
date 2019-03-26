package ua.com.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class rozetka_HomePage extends ua.com.rozetka.driverSettings.driverConf{
    private String urlHome = "https://rozetka.com.ua/";
    private By myRozetkaLink = By.xpath("/html/body/app-root/div/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/a");
    private By loginMail = By.xpath("//*[@id=\"auth_email\"]");
    private By loginPas = By.xpath("//*[@id=\"auth_pass\"]");
    private By loginButton = By.xpath("/html/body/app-root/div/div[1]/div[2]/auth-modal/modal-window/div/div/div/auth-content/div/form/div/button");
    private By userMenu = By.xpath("/html/body/app-root/div/div[1]/div[1]/header/div/div[1]/div[3]/div[1]/p/a");
    private By searchField = By.xpath("/html/body/app-root/div/div[1]/div[1]/header/div/div[2]/div[2]/form/div/div/input");



    public rozetka_HomePage openPage() {
        open(urlHome);
        return this;
    }

    public rozetka_HomePage login (String userMail,String userPas) {
        find(myRozetkaLink).click();
        find(loginMail).sendKeys(userMail);
        find(loginPas).sendKeys(userPas);
        find(loginButton).click();
        delay(2000);
        return this;
    }

    public produktPage search (String key) {
         find(searchField).sendKeys(key, Keys.ENTER);
         delay(1000);
         return new produktPage();
    }
    public myRozetkaPage goMyPage() {

         find(userMenu).click();
         find(userMenu).click();
        delay(1000);
        return new myRozetkaPage();
    }

}
