package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectFromDropDownUsingVisibleText(WebElement element, String textName) {
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }
    public void selectFromDropDownUsingVisibleText(String textName, WebElement element) {
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }
    public void selectFromDropDownUsingVisibleText(String textName) {
        WebElement element = null;
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }
}
