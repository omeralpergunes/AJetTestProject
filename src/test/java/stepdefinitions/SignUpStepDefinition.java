package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SignUpPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignUpStepDefinition {

    WebDriver driver;
    SignUpPage signUpPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver(); // WebDriver başlatılıyor
        signUpPage = new SignUpPage(driver); // SignUpPage'in WebDriver ile başlatılması
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // İmplicit Wait
    }

    @Given("User goes to ajet homepage")
    public void user_goes_to_ajet_homepage() {
        // Sayfanın açılması işlemi
        driver.get("http://ajet.com/");
    }

    @Then("User click to home login")
    public void user_click_to_home_login() {
        // Login butonuna tıklama
        signUpPage.loginHomeClick.click();
    }

    @Then("User clicks the signup button")
    public void user_clicks_the_signup_button() {
        // Signup butonuna tıklama
        signUpPage.signUpClick.click();
    }
    @After
    public void tearDown() {
        driver.quit();
    }


}
