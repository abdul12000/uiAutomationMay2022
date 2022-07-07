package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GapPurchaseSteps extends BaseUtil {
    private BaseUtil base;


    public GapPurchaseSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Gap Home page")
    public void i_am_on_the_gap_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gap.co.uk/");
    }

    @When("I choose the Summer Essentials under the {string} category")
    public void i_choose_the_summer_essentials_under_the_category(String string) throws InterruptedException {
        WebElement womensMenu = base.driver.findElement(By.xpath("//div[@class='navigation__category']/div[contains(text(),'Women')]"));
        Actions actionProvider = new Actions(base.driver);
        actionProvider.moveToElement(womensMenu).build().perform();
        Thread.sleep(4000);
        List<WebElement> womensSummerEssentials = base.driver.findElements(By.xpath("//div[contains(text(),'Summer Essentials')]"));
        womensSummerEssentials.get(0).click();
    }

    @When("I choose the first item on the list")
    public void i_choose_the_first_item_on_the_list() {
        //close the pop up
        base.driver.findElement(By.cssSelector("svg.email-popup-close")).click();

        base.driver.findElements(By.cssSelector("div.product-name>a")).get(0).click();
    }

    @When("I click on {string}")
    public void i_click_on(String text) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.id("add-to-cart")).click();
//        base.driver.findElement(By.xpath("//button[.='Add to Bag']")).click();
//        base.driver.findElement(By.xpath("//button[.='" + text +"']")).click();

    }

    @Then("I should see error msg displayed as {string}")
    public void i_should_see_error_msg_displayed_as(String string) throws InterruptedException {
        Thread.sleep(2000);
        assertThat(base.driver.findElement(By.xpath("//div[.='Please select Size before adding to bag']")).isDisplayed(), is(equalTo(true)));
    }


}
