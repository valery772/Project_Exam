package pages;

import libs.TestData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement SignInButton;
    @FindBy(xpath = "//*[@id='email_create']")
    private WebElement EmailField;
    @FindBy(xpath = "//*[@id='SubmitCreate']")
    private WebElement CreateAccount;
    @FindBy(xpath = "//*[@id='customer_firstname']")
    private WebElement FirstName;
    @FindBy(xpath = "//*[@id='customer_lastname']")
    private WebElement LastName;
    @FindBy(xpath = "//*[@id='passwd']")
    private WebElement Password;
    @FindBy(xpath = "//*[@id='firstname']")
    private WebElement FirstNameInOurAddress;
    @FindBy(xpath = "//*[@id='lastname']")
    private WebElement LastNameInOurAddress;
    @FindBy(xpath = "//*[@id='address1']")
    private WebElement Address;
    @FindBy(xpath = "//*[@id='city']")
    private WebElement City;
    @FindBy(xpath = "//*[@id='id_state']")
    private  WebElement State;
    @FindBy(xpath ="//span[text()='Colorado']" )
    private WebElement selectValueFromState;
    @FindBy(xpath = "//*[@id='postcode']")
    private WebElement PostCode;
    @FindBy(xpath = ".//[@id='id_country']")
    private WebElement Country;
    @FindBy(xpath = "//*[@id='phone_mobile']")
    private WebElement Phone;
    @FindBy(xpath = "//*[@id='alias']")
    private WebElement AdditionalAdress;
    @FindBy(xpath = "//*[@id='submitAccount']")
    private WebElement CreateUser;
    @FindBy(xpath = "//*[@id='email']")
    private WebElement EmailForLogin;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement PasswordForLogIn;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement SignIn;
    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    private WebElement forgotPassword;
    @FindBy(xpath = "//*[@id='email']")
    private WebElement enterEmailToRestoreAccess;
    @FindBy(xpath ="//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
    private WebElement retrivePassword;
    @FindBy(xpath ="//p[@class='alert alert-success']")
    private WebElement popupCheck;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openLoginPage() {
        try {
            webDriver.get("http://automationpractice.com/index.php");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Сannot work with LoginPage" + e);
            Assert.fail("Сannot work with LoginPage");
        }
    }

    public LoginPage clickonSignIn() {
        clickOnElement(SignInButton);
        return new LoginPage(webDriver);
    }

    public LoginPage clickOnCreateAccount(){
        clickOnElement(CreateAccount);
        return new LoginPage(webDriver);
    }

    public void enterEmail(String email) {
        enterTextToElement(EmailField, email);

    }
    public void fillInPersonalInformation(String name, String last_name, String password) {
        enterTextToElement(FirstName, name);
        enterTextToElement(LastName, last_name);
        enterTextToElement(Password, password);

    }

    public void fillinOurAdress(String firstname, String last_name, String address, String city, String postal_code, String phone_number, String alias) {
        enterTextToElement(FirstNameInOurAddress, firstname);
        enterTextToElement(LastNameInOurAddress, last_name);
        enterTextToElement(Address, address);
        enterTextToElement(PostCode, postal_code);
        enterTextToElement(City, city);
        enterTextToElement(Phone, phone_number);
        enterTextToElement(AdditionalAdress, alias);

    }

    public void usersPressesKeyEnterTime(int numberOfTimes) {
        Actions actions = new Actions(webDriver);
        for (int i = 0; i < numberOfTimes; i++) {
            actions.sendKeys(Keys.ENTER).build().perform();

        }
    }

    public void clickOnRegisterButton(){
        clickOnElement(CreateUser);
    }

    public void enterLogEmail(String email) {
        enterTextToElement(EmailForLogin, email);

    }

    public void enterPasswwordInSign(String password) {
        enterTextToElement(PasswordForLogIn, password);


    }

    public void clickOnButtonSignIn() {
        clickOnElement(SignIn);
    }

    public void fillinLoginFormandSubmit(String login, String password) {
        openLoginPage();
        clickonSignIn();
        enterLogEmail(login);
        enterPasswwordInSign(password);
        clickOnButtonSignIn();
    }
    public void credentialsForOrder(String login, String password) {
        enterLogEmail(login);
        enterPasswwordInSign(password);
        clickOnElement(SignIn);
        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
    }

    public LoginPage loginWithValidCred() {
        fillinLoginFormandSubmit(TestData.VALID_EMAIL, TestData.VALID_PASSWORD);
        return new LoginPage(webDriver);
    }
    public LoginPage selectValueinDDSelectValue(String value) {
        selectValueInDD(State, value);
        return this;
    }

public LoginPage clickonForgotPasswordButton(){
    clickOnElement(forgotPassword);
    return new LoginPage(webDriver);
}
    public void enterEmailForAccess(String email){
        enterTextToElement(enterEmailToRestoreAccess,email);
    }
    public void clickOnRetrivePassword(){
        clickOnElement(retrivePassword);
    }
    public boolean isPopForSuccessPresent(){
         return isElementPresent(popupCheck);
    }

}
