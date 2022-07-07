package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewtoursRegisterConfirmationPage  extends BasePage{
    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//b") private List<WebElement> msgs;

    public String getAcknowledgementMsg(){
        return msgs.get(1).getText();
    }
}
