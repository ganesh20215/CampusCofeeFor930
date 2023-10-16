package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class DriverUtility extends WebTestBase {

    public static final long PAGE_LODE_TIME = 30;
    public static final long IMPLICIT_WAIT = 30;
    public static final long EXPLICIT_WAIT = 30;
    public static WebDriverWait wait;
    public static Actions actions;
    public static Select select;
    public static JavascriptExecutor javascriptExecutor;

    public static void waitUntilElementToBeClickable(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getTextOfElement(WebElement element){
        return element.getText();
    }

    public static void actionMoveTOElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void actionDragAndDrop(WebElement srcElement, WebElement desElement){
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement, desElement).perform();
    }

    public static void dropDownByVisibleText(String visibleText, WebElement element){
        select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public static void dropDownByVisibleByIndex(int visibleIndex, WebElement element){
        select = new Select(element);
        select.selectByIndex(visibleIndex);
    }

    public static void dropDownByVisibleByValues(String visibleValue, WebElement element){
        select = new Select(element);
        select.selectByValue(visibleValue);
    }

    public static void scrollDownByVisibleText(){
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("");
    }

    public static void sendData(WebElement element, String textValue){
        element.sendKeys(textValue);
    }
}
