package СontactUS;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CustomeService extends BaseTest {
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
        Assert.assertTrue("Message wasn't sent to support team",contacsUs.wasMessageSent());
    }
}
