import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class ForgotPassword extends BaseTest {
    @Test
    public void forgotYourPassword(){
        loginPage.openLoginPage();
        loginPage.clickonSignIn();
        loginPage.clickonForgotPasswordButton();
        loginPage.enterEmailForAccess("valerinskaya9972@gmail.com");
        loginPage.clickOnRetrivePassword();
        Assert.assertTrue("There is no account registered for this email address.\n",loginPage.isPopForSuccessPresent());


    }
}
