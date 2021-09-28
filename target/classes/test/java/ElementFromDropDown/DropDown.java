package ElementFromDropDown;
import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DropDown extends BaseTest {
    WebDriver webDriver;
    @Test
    public void SelectElementFromDropDown(){
        loginPage.openLoginPage();
        dropDownMenu.selectMenu();
        Assert.assertTrue("Selected clothes from drop-down menu is not display",dropDownMenu.isSelectedClotheVisible());

    }
}
