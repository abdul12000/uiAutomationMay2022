package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage{
    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "SIGN-ON") private WebElement signOnLinkElement;
    @FindBy(linkText = "REGISTER") private WebElement RegisterLinkElement;
    @FindBy(linkText = "SUPPORT") private WebElement SupportLinkElement;
    @FindBy(linkText = "CONTACT") private WebElement ContactLinkElement;

    public void clickSignOnLink(){
        signOnLinkElement.click();
    }
    public void clickRegisterLink(){
        RegisterLinkElement.click();
    }
    public void clickSupportLink(){
        SupportLinkElement.click();
    }
    public void clickContactLink(){
        ContactLinkElement.click();
    }
}
