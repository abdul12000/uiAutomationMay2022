package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ComputerDBAddAComputerPage;
import pages.ComputerDBHomePage;
import utilities.PropertiesReader;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ComputerDatabseStepDefs extends BaseUtil {
    private BaseUtil base;
    public ComputerDatabseStepDefs(BaseUtil base){
        this.base = base;
    }

    @Given("I am on the Play sample application home page")
    public void i_am_on_the_play_sample_application_home_page() throws IOException {
        base.driver.manage().window().maximize();
        PropertiesReader propertiesReader = new PropertiesReader();
        base.driver.get(propertiesReader.getComputerDBUrl());

    }
    @When("I click on {string} button")
    public void i_click_on_button(String string) {
        ComputerDBHomePage computerDBHomePage = new ComputerDBHomePage(base.driver);
        computerDBHomePage.ClickOnAddAComputerButton();

    }
    @When("I enter information as follows")
    public void i_enter_information_as_follows(List<List<String>>data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        ComputerDBAddAComputerPage computerDBAddAComputerPage = new ComputerDBAddAComputerPage(base.driver);
        computerDBAddAComputerPage.enterComputerName(data.get(1).get(1));
        computerDBAddAComputerPage.enterIntroducedDate(data.get(2).get(1));
        computerDBAddAComputerPage.enterDiscontinuedDate(data.get(3).get(1));
        computerDBAddAComputerPage.selectCompany(data.get(4).get(1));
        computerDBAddAComputerPage.clickOnCreateThisComputerButton();

    }
    @Then("I should be able to add the computer name to the Computer database")
    public void i_should_be_able_to_add_the_computer_name_to_the_computer_database() {
        WebElement doneMsg = base.driver.findElement(By.xpath("//strong[.='Done!']"));
        assertThat(doneMsg.isDisplayed(), equalTo(true));

    }



}
