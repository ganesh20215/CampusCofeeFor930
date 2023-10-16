package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

    public String textOfMyAccount(){
        return DriverUtility.getTextOfElement(myAccountText);
    }
}
