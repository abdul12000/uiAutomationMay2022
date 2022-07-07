package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegisterPage extends BasePage{
    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    //Identifying the elements
    @FindBy(id = "email") private WebElement usernameElement;
    @FindBy(xpath = "//input[@name='password']") private WebElement passwordElement;
    @FindBy(xpath = "//input[@name='confirmPassword']") private WebElement confirmPasswordElement;
    @FindBy(css = "input[name='submit']") private WebElement submitButtonElement;

    @FindBy(xpath = "//input[@name='firstName']") private WebElement firstNameElement;
    @FindBy(css = "input[name='lastName']") private WebElement lastNameElement;
    @FindBy(css = "input[name='phone']") private WebElement phoneElement;
    @FindBy(css = "select[name='country']") private WebElement countryElement;


    @FindBy(xpath = "//*[@name='address1']") private WebElement addressElement;
    @FindBy(css = "input[name='city']") private  WebElement cityElement;
    @FindBy(css = "input[name='state']") private WebElement stateElement;
    @FindBy(css = "input[name='postalCode']") private WebElement postalCodeElement;

    //Writing the methods to perform actions on the elements
    public void enterUsername(String uName){
        usernameElement.sendKeys(uName);
    }
    public void enterPassword(String pWord){ passwordElement.sendKeys(pWord);}
    public void enterConfirmPassword(String cPWord) {confirmPasswordElement.sendKeys(cPWord);}
    public void clickOnSubmitButton(){
        submitButtonElement.click();
    }

    public void enterFirstName(String fName){
        firstNameElement.sendKeys(fName);
    }
    public void enterLastName(String lName){
        lastNameElement.sendKeys(lName);
    }
    public void enterPhoneNumber(String pNumber){
        phoneElement.sendKeys(pNumber);
    }
    public void enterEmail(String uName){
        usernameElement.sendKeys(uName);
    }

    public void enterAddress(String address){
        addressElement.sendKeys(address);
    }
    public void enterCity(String cityName){
        cityElement.sendKeys(cityName);
    }
    public void enterState(String stateName){
        stateElement.sendKeys(stateName);
    }
    public void enterPostcode(String uName){
        usernameElement.sendKeys(uName);
    }
    public void selectCountry(String countryName){
//        Select select = new Select(countryElement);
//        select.selectByVisibleText(countryName);
        selectFromDropDownUsingVisibleText(countryName, countryElement);
    }
}
