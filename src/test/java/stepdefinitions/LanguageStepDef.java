package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LanguagePage;


public class LanguageStepDef {

    WebDriver driver;
    LanguagePage languagePage;


    public LanguageStepDef( ) {
        this.driver = Hooks.driver;
        this.languagePage = new LanguagePage(driver);
    }

    @Given("User language go to homepage")
    public void user_language_go_to_homepage() {
        driver.get("https://ajet.com/");
    }

    @When("Click on the language button")
    public void click_on_the_language_button() throws InterruptedException {
        languagePage.clickLanguageMenu();
        Thread.sleep(1000);
    }

   @Then("Click on the second language")
    public void click_on_the_second_language() {
       languagePage.selectSecondLanguage();

   }
   @And("User close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
