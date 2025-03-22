package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SignPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignStepDef {

     WebDriver driver;
     SignPage signPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        signPage = new SignPage(driver); // WebDriver'ı LoginPage'e geçiriyoruz
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Given("User go to homepage")
    public void userGoToHomepage() throws InterruptedException {
        driver.get("https://ajet.com/signup");
        Thread.sleep(2000);
    }

    @When("Enter your username")
    public void enterYourUsername() throws InterruptedException {
        signPage.firstName.sendKeys("Alper");
        Thread.sleep(500);
    }
    @And("Enter your lastname")
    public void enterYourLastname() throws InterruptedException {
        signPage.lastName.sendKeys("Kaya");
        Thread.sleep(500);
    }
    @Then("Enter your birthday")
    public void enterYourBirthDay() throws InterruptedException {
        signPage.birthDay.sendKeys("12/12/1999");
    }

    @But("Enter your gender")
    public void enterYourGender() throws InterruptedException {
        signPage.gender.click();
        Thread.sleep(2000);

    }
    @And("Enter your phoneNumber")
    public void enter_your_phone_number() throws InterruptedException {
        signPage.usernamePhone.click();
        signPage.usernamePhone.sendKeys("5537688013");
        Thread.sleep(1500);
    }
    @And("Enter your email")
    public void enter_your_email() throws InterruptedException {
        signPage.email.sendKeys("omeralpergunes@gmail.com");
        Thread.sleep(1500);

    }
    @And("Enter your password")
    public void enter_your_password() throws InterruptedException {
        signPage.password.sendKeys("Gunes*44wien");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        action.sendKeys(Keys.SPACE).perform();
        Thread.sleep(1000);
    }


   @And("Click to Sign Up")
    public void click_to_sign_up() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(signPage.signUpClick));
        Thread.sleep(1000);
        signUpButton.click();

    }

   @And("Close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
