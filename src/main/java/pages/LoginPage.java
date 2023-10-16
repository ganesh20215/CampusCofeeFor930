package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

import java.util.List;

public class LoginPage extends WebTestBase {

    @FindBy(id="username")
    WebElement userNameTextBox;

    @FindBy(id="password")
    WebElement passwordTextBox;

    @FindBy(name="login")
    WebElement loginBtn;

    @FindBy(xpath = "")
    List<WebElement> allElements;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        DriverUtility.waitUntilElementToBeClickable(loginBtn);
    }
}
