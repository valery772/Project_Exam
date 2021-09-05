package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class ContatUs extends ParentPage{
    @FindBy(xpath ="//*[@id='contact-link']/a")
    private WebElement contactToUs;
    @FindBy(xpath = "//*[@id='id_contact']")
    private  WebElement State;
    @FindBy(xpath = "//*[@id='email']")
    private  WebElement emailForContact;
    @FindBy(xpath = "//*[@id='id_order']")
    private  WebElement orderReference;
    @FindBy(xpath ="//*[@id='uniform-fileUpload']")
    private WebElement fileupload;
    @FindBy(xpath ="//*[@id='message']")
    private WebElement message;
    @FindBy(xpath ="//*[@id='submitMessage']")
    private WebElement submit;
    public ContatUs(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnContactWithUs(){
        clickOnElement(contactToUs);
    }
    public void selectValueinDDSelectValue(String value) {
        selectValueInDD(State, value);
    }

   public void enterEmail(String email){
        enterTextToElement(emailForContact,email);

   }
   public void enterOrder(String text){
        enterTextToElement(orderReference,text);
   }
    public  void clickOnFileUpload(){
        clickOnElement(fileupload);
    }
    private static final File FILE = new File("C:\\Users\\Админ\\Downloads\\wallpaperflare.com_wallpaper (2).jpg");
    public void uploadFile()
    {WebElement uploadFile = webDriver.findElement(By.id("fileUpload")
        );
        uploadFile.sendKeys(FILE.getAbsolutePath());
        webDriver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\Админ\\Downloads\\wallpaperflare.com_wallpaper (2).jpg");
    }
    public  void enterMessageText(String text){
        enterTextToElement(message,text);
    }
    public  void clickOnSendInformation(){
        clickOnElement(submit);
    }
}
