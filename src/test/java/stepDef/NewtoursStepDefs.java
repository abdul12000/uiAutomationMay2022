package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDefs {
//    WebDriver driver;
//
//    @Before
//    public void createWebdriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @Given("I am on the Newtours home page")
//    public void i_am_on_the_newtours_home_page() {
//        driver.get("https://demo.guru99.com/selenium/newtours");
//    }
//    @When("I click on Register link")
//    public void i_click_on_register_link() {
////        //Identify the element
////       WebElement registerlinkElement = driver.findElement(By.linkText("REGISTER"));
////
////       //perform action on the element
////        registerlinkElement.click();
//
//
//        ///as a one liner :
//        driver.findElement(By.linkText("REGISTER")).click();
//    }
//    @When("I enter username as {string}, password and confirm password as {string}")
//    public void i_enter_username_as_password_and_confirm_password_as(String uName, String pWord) {
//        // Write code here that turns the phrase above into concrete actions
// WebElement userNameElement = driver.findElement(By.id("email"));
// userNameElement.sendKeys(uName);
//
//        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
//        passwordElement.sendKeys(pWord);
//        WebElement confirmPasswordElement = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
//        confirmPasswordElement.sendKeys(pWord);
//
//    }
//    @When("I click on submit button")
//    public void i_click_on_submit_button() {
//        // Write code here that turns the phrase above into concrete actions
//      driver.findElement(By.cssSelector("input[name='submit']")).click();
//    }
//    @Then("the confirmation page is displayed with the username as {string}")
//    public void the_confirmation_page_is_displayed_with_the_username_as(String uName) {
        // Write code here that turns the phrase above into concrete actions

//        String acknowledgementMsg = driver.findElements(By.xpath("//b")).get(1).getText();
//        assertThat(acknowledgementMsg.contains(uName),equalTo(true));

//    }
//
//    @After
//    public void TearDown(){
//        driver.close();
//        driver.quit();
//    }
}
