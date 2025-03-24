package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStepDefinition {

    WebDriver driver = Hooks.driver;
    LoginPage loginPage;

    @Given("User goes to homepage")
    public void user_goes_to_homepage() throws InterruptedException {
        driver.get("https://ajet.com");
        Thread.sleep(2000);
    }

    @Then("User click to login")
    public void user_click_to_login() throws InterruptedException {
        loginPage.loginClick.click();
        Thread.sleep(2000);
    }

    @And("Enters mobile phone information")
    public void enters_mobile_phone_information() throws InterruptedException {
        loginPage.phoneLogin.click();
        loginPage.phoneLogin.sendKeys("55555555555");
        Thread.sleep(1200);
    }

    @When("Enters password information")
    public void enters_password_information() throws InterruptedException {
        loginPage.passwordLogin.click();
        loginPage.passwordLogin.sendKeys("Sifremiz123");
        Thread.sleep(1500);
    }

    @And("Click on the Sign in button")
    public void click_on_the_sign_in_button() throws InterruptedException {
        loginPage.userLoginClick.click();
        Thread.sleep(1000);
    }

    @And("Close to browser")
    public void close_to_browser(){
        driver.close();
    }
}
