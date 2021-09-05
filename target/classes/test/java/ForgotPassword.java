import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class ForgotPassword extends BaseTest {
    @Test
    public void forgotyourpassword(){
        loginPage.openLoginPage();
        loginPage.clickonSignIn();
        loginPage.clickonForgotPasswordButton();
        loginPage.enterEmailForAccess("valerinskaya9972@gmail.com");
        loginPage.clickOnRetrivePassword();
        Assert.assertTrue("Error!Try Again",loginPage.isPopForSuccessPresent());


    }
}
