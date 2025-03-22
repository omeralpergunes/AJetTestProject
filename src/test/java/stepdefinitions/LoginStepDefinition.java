package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() {
        // WebDriver'ı başlatıyoruz ve LoginPage'i parametre olarak geçiyoruz.
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver); // WebDriver'ı LoginPage'e geçiriyoruz
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("User goes to homepage")
    public void user_goes_to_homepage() throws InterruptedException {
        driver.get("https://ajet.com"); // WebDriver üzerinden get() metodunu çağırıyoruz
        Thread.sleep(2000); // Sayfa yüklenmesini bekliyoruz
    }

    @Then("User click to login")
    public void user_click_to_login() throws InterruptedException {
        loginPage.loginClick.click();
        Thread.sleep(2000);
    }

    @And("Enters mobile phone information")
    public void enters_mobile_phone_information() throws InterruptedException {
        loginPage.phoneLogin.click();
        loginPage.phoneLogin.sendKeys("5537688013");
        Thread.sleep(1200);
    }

    @When("Enters password information")
    public void enters_password_information() throws InterruptedException {
        loginPage.passwordLogin.click();
        loginPage.passwordLogin.sendKeys("Malatya*77");
        Thread.sleep(1500);
    }

    @And("Click on the Sign in button")
    public void click_on_the_sign_in_button() throws InterruptedException {
        loginPage.userLoginClick.click();
        Thread.sleep(1000);
    }

    @And("Close to browser")
    public void close_to_browser(){
        driver.close(); // Tarayıcıyı kapatıyoruz
    }
}
