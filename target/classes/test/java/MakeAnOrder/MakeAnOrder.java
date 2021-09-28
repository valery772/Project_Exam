package MakeAnOrder;

import baseTest.BaseTest;
import libs.TestData;
import org.junit.Assert;
import org.junit.Test;

public class MakeAnOrder extends BaseTest {
    @Test
    public void purchases(){
        loginPage.fillinLoginFormandSubmit(TestData.VALID_EMAIL,TestData.VALID_PASSWORD);
        homePage.clickonReturnToHomePage();
        homePage.clickonClothesImage();
        homePage.addToCart();
        homePage.proceedToCheckout_1();
        homePage.proceedToCheckout_2();
        loginPage.credentialsForOrder(TestData.VALID_EMAIL,TestData.VALID_PASSWORD);
        loginPage.usersPressesKeyEnterTime(1);
        homePage.clickOnCheckBox();
        homePage.clickShipping();
        homePage.confirmOrder();
        Assert.assertTrue("Order placement failed!",homePage.checkSucessfullyAddedOrder());

    }
}
