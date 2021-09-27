package searchClothes;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class Search extends BaseTest {
    @Test
    public void EnterandSeacrhClothes(){
        loginPage.openLoginPage();
        homePage.inputNameOfClothe("Blouse");
        homePage.clickOnSeacthButton();
        Assert.assertTrue("Clothes wasn't found", homePage.checkIsSearchingWasSuccessfull());

    }
}

