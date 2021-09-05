package SignInPhase;

import baseTest.BaseTest;
import org.junit.Test;

public class SignIn extends BaseTest {
    @Test
    public void SignInWithValidCredentials(){
        loginPage.openLoginPage();
        loginPage.clickonSignIn();
        loginPage.enterEmail("valerinskaya997190900@gmail.com");
        loginPage.clickOnCreateAccount();
        loginPage.fillInPersonalInformation("valery","morgan","123456");
        loginPage.fillinOurAdress("test","testovich","80 White St,123","New-York","04201"
                ,"1234556789","tyk tyk");
        loginPage.selectValueinDDSelectValue("2");
        loginPage.clickOnRegisterButton();
        homePage.signOutButton();



    }
}
