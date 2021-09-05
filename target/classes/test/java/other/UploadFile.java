package other;

import baseTest.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class UploadFile extends BaseTest {
    WebDriver webDriver;

    @Test
    public void UploadTest() {

        loginPage.openLoginPage();
        contacsUs.clickOnContactWithUs();
        contacsUs.selectValueinDDSelectValue("1");
        contacsUs.enterEmail("lera@gmail.com");
        contacsUs.enterOrder("test");
        contacsUs.clickOnFileUpload();
        contacsUs.enterMessageText("test");
        contacsUs.clickOnSendInformation();
    }
}
