package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerDBAddAComputerPage extends BasePage implements IComputerDBAddAComputerPage {
    public ComputerDBAddAComputerPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input#name")
    private WebElement computerNameInputElement;
    @FindBy(css = "input#introduced")
    private WebElement introducedDateInputElement;
    @FindBy(css = "input#discontinued")
    private WebElement discontinuedDateInputElement;
    @FindBy(css = "select[name='company']")
    private WebElement companyElement;
    @FindBy(css = ".btn.primary")
    private WebElement createThisComputerButtonElement;
    @FindBy(linkText = "Cancel")
    private WebElement cancelButtonElement;


    public void enterComputerName(String computerName) {
        computerNameInputElement.sendKeys(computerName);
    }

    public void enterIntroducedDate(String iDate) {
        introducedDateInputElement.sendKeys(iDate);
    }

    public void enterDiscontinuedDate(String dDate) {
        discontinuedDateInputElement.sendKeys(dDate);
    }

    public void selectCompany(String cName) {
        selectFromDropDownUsingVisibleText(companyElement, cName);
    }

    public void clickOnCreateThisComputerButton() {
        createThisComputerButtonElement.click();
    }


    public void testMethod() {

    }
}
