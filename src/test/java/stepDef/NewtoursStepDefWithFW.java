package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;
import utilities.EncapsulationClass;
import utilities.PropertiesReader;
import utilities.Utility;

import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDefWithFW extends BaseUtil {
    private BaseUtil base;

    public NewtoursStepDefWithFW(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Newtours home page")
    public void i_am_on_the_newtours_home_page() throws IOException {
        base.driver.manage().window().maximize();
//        base.driver.get("https://demo.guru99.com/selenium/newtours");
//        base.driver.navigate().to("https://demo.guru99.com/selenium/newtours");
        PropertiesReader propertiesReader = new PropertiesReader();
        base.driver.get(propertiesReader.getNewtoursUrl());
    }

    @When("I click on Register link")
    public void i_click_on_register_link() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.clickRegisterLink();

    }
    @When("I enter User Information of {string}, password and confirm password as {string}")
    @And("I enter User Information of username as {string}, password and confirm password as {string}")
    @When("I enter username as {string}, password and confirm password as {string}")
    public void i_enter_username_as_password_and_confirm_password_as(String uName, String pWord) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUsername(uName);
        newtoursRegisterPage.enterPassword(pWord);
        newtoursRegisterPage.enterConfirmPassword(pWord);

    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.clickOnSubmitButton();
    }

    @Then("the confirmation page is displayed with the username as {string}")
    public void the_confirmation_page_is_displayed_with_the_username_as(String uName) {

//                String acknowledgementMsg = driver.findElements(By.xpath("//b")).get(1).getText();
        //        assertThat(acknowledgementMsg.contains(uName),equalTo(true));
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);

        assertThat(newtoursRegisterConfirmationPage.getAcknowledgementMsg().contains(uName), equalTo(true));
    }

    @When("I enter the Contact information of {string}, {string}, {string} and {string}")
    @When("I enter the Contact information of Firstname as {string}, Lastname as {string}, number as {string} and email as {string}")
    public void iEnterTheContactInformationOfFirstnameAsLastnameAsNumberAsAndEmailAs(String fName, String lName, String pNumber, String email) {
//       EncapsulationClass.setRandNumbers(Utility.generateFiveRandNumbers());
        EncapsulationClass.setRandNumbers(12345);
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterFirstName(fName);
        newtoursRegisterPage.enterLastName(lName);
        newtoursRegisterPage.enterPhoneNumber(pNumber);
        newtoursRegisterPage.enterEmail(email);
    }

    @When("I enter mailing Information of {string},{string}, {string}, {string} and {string}")
    @And("I enter mailing Information of Address as {string}, city as {string}, State as {string}, Postcode as {string} and country as {string}")
    public void iEnterMailingInformationOfAddressAsCityAsStateAsPostcodeAsAndCountryAs(String address, String city, String state, String pCode, String country) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);

        System.out.println(EncapsulationClass.getRandNumber());
        newtoursRegisterPage.enterAddress(address + EncapsulationClass.getRandNumber());
        newtoursRegisterPage.enterCity(city);
        newtoursRegisterPage.enterState(state);
        newtoursRegisterPage.enterPostcode(pCode);
        newtoursRegisterPage.selectCountry(country);
    }

}
