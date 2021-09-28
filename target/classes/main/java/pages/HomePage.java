package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class HomePage extends ParentPage {
    @FindBy(xpath = "//a[@title='Log me out']")
    private WebElement isSignOutButtonPresent;
    @FindBy(xpath = "//a[@title='Return to Home']")
    private WebElement ReturntoHome;
    @FindBy(xpath = "//div[@class='product-image-container']/a/img[@alt='Faded Short Sleeve T-shirts']")
    private WebElement clickOnImage;
    @FindBy(xpath = "//ul[@id='homefeatured']//div[@class='product-container']//*[contains(text(),'Faded Short Sleeve T-shirts')]//..//..//*[contains(text(),'Add to cart')]")
    private Button clickOnAddToCart;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement checkout;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
    private WebElement checkOutAdress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    private WebElement checkOutAddresss;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")
    private WebElement agreeCheckBox;
    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    private WebElement checkOutShipping;
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement payByBankWire;
    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    private WebElement confirmOrder;
    @FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
    private WebElement checkFinalResult;
    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    private TextInput seacrhField;
    @FindBy(xpath = ".//button[@type='submit' and span ='Search' ]")
    private Button clickOnSeacrchButton;
    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    private Button checkClothesExisting;
    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")
    private Button isUserNamePresent;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public boolean issignOutButtonVisible() {
        return isElementPresent(isSignOutButtonPresent);

    }

    public void clickonReturnToHomePage() {
        clickOnElement(ReturntoHome);
    }

    public void clickonClothesImage() {
        WebElement titleC = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(titleC);
        actions.clickAndHold().perform();
        clickOnElement(webDriver.findElement(By.xpath("//ul[@id='homefeatured']//div[@class='product-container']//*[contains(text(),'Faded Short Sleeve T-shirts')]//..//..//*[contains(text(),'Add to cart')]")));
    }

    public void addToCart() {
        clickOnElement(clickOnAddToCart);
    }

    public void proceedToCheckout_1() {
        clickOnElement(checkout);
    }

    public void proceedToCheckout_2() {
        clickOnElement(checkOutAdress);
    }

    public void proceedToCheckout_3() {
        clickOnElement(checkOutAddresss);
    }

    public void clickOnCheckBox() {
        WebElement radio1 = webDriver.findElement(By.xpath("//*[@id=\"cgv\"]"));
        radio1.click();
        clickOnElement(checkOutShipping);
        clickOnElement(payByBankWire);
        clickOnElement(confirmOrder);

    }

    public void clickShipping() {
        clickOnElement(checkOutShipping);
    }

    public void Bank() {
        clickOnElement(payByBankWire);
    }

    public void confirmOrder() {
        clickOnElement(confirmOrder);
    }

    public boolean checkSucessfullyAddedOrder() {
        return isElementPresent(checkFinalResult);
    }

    public void inputNameOfClothe(String name) {
        enterTextToElement(seacrhField, name);
    }

    public void clickOnSeacthButton() {
        clickOnElement(clickOnSeacrchButton);
    }

    public boolean checkIsSearchingWasSuccessfull() {
        return isElementPresent(checkClothesExisting);

    }
    public boolean isUserNameDisplay(){
       return isElementPresent(isUserNamePresent);
    }
}



