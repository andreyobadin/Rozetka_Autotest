package ua.com.rozetka.tests;

import org.junit.Assert;
import org.junit.Test;
import ua.com.rozetka.pages.myRozetkaPage;
import ua.com.rozetka.pages.produktPage;
import ua.com.rozetka.pages.rozetka_HomePage;

public class tottal_Test extends  ua.com.rozetka.driverSettings.driverConf{
    private String userMail = "obadinandreii@outlook.com";
    private String userName = "Andrey";
    private String userPas = "Test1Test";
    private String prod = "Беспроводная зарядка FANTASY (black), универсальная (DH007)";
    private String prodCode = "49860542";


    @Test
    public void test_Login(){
        rozetka_HomePage homePage = new rozetka_HomePage().openPage();
        homePage.login(userMail,userPas);
        delay(2000);
        myRozetkaPage myRozetkaPage = homePage.goMyPage();
        delay(1000);
        Assert.assertTrue(userName.equals(myRozetkaPage.nickUser()));
    }

    @Test
    public void search_TestNameP(){
        rozetka_HomePage homePage = new rozetka_HomePage().openPage();
        produktPage produktPage = homePage.search(prod);
        Assert.assertTrue(prod.equals(produktPage.getNameP()));
    }

    @Test
    public void search_TestCodeP(){
        rozetka_HomePage homePage = new rozetka_HomePage().openPage();
        produktPage produktPage = homePage.search(prodCode);
        Assert.assertTrue(prodCode.equals(produktPage.getCodeP()));
    }

    @Test
    public void searchAndPut_TestP(){
        rozetka_HomePage homePage = new rozetka_HomePage().openPage();
        homePage.login(userMail,userPas);
        delay(2000);
        produktPage produktPage = homePage.search(prod);
        delay(1000);
        produktPage.putProd();
    }
    @Test
    public void searchAndBay_Test(){
        rozetka_HomePage homePage = new rozetka_HomePage().openPage();
        homePage.login(userMail,userPas);
        produktPage produktPage = homePage.search(prod);
        produktPage.bayProd();



    }






}


