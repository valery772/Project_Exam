package LogIn;

import baseTest.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LogInWithExistingUser extends BaseTest{
    WebDriver webDriver;
    @Test
    public void  ExistingUser(){
        loginPage.loginWithValidCred();
        homePage.signOutButton();
    }
}
