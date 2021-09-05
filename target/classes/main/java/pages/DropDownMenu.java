package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DropDownMenu extends  ParentPage {
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement women;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    private WebElement thirt;

    private WebDriver driver;

    public DropDownMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectMenu(){
        WebElement titleC = webDriver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(titleC);
        actions.clickAndHold().perform();
//        WebElement titleC1 = webDriver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        clickOnElement(webDriver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")));


    }
}
