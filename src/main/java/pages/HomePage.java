package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginElement;

    @FindBy(xpath = "//button[@title='Close']")
    WebElement closedFirstAd;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closedSecondAd;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void closedFirstAd(){
        DriverUtility.waitUntilElementToBeClickable(closedFirstAd);
    }

    public void closedSecondAd(){
        DriverUtility.waitUntilElementToBeClickable(closedSecondAd);
    }

    public void clickOnLoginBtn(){
        DriverUtility.waitUntilElementToBeClickable(loginElement);
    }
}
