package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FlightSetPage;
import java.time.Duration;

public class FlightSetStepDef {

    WebDriver driver;
    FlightSetPage flightSetPage;


    public FlightSetStepDef() {
        this.driver = Hooks.driver;
        this.flightSetPage = new FlightSetPage();
    }

    @Given("User goes to site")
    public void user_goes_to_site() throws InterruptedException {
        driver.get("https://ajet.com/");
        Thread.sleep(2000);
    }

    @When("Click on the check in")
    public void click_on_the_check_in() throws InterruptedException {
        flightSetPage.clickCheckIn();
        Thread.sleep(2000);

    }

    @When("Click on the flight management")
    public void click_on_the_flight_management() throws InterruptedException {
        flightSetPage.clickFlightManagement();
        Thread.sleep(2000);
    }

    @When("Click on the flight status")
    public void click_on_the_flight_status() throws InterruptedException {
        flightSetPage.clickFlightStatus();
        Thread.sleep(1000);
    }

    @When("Click on the slider")
    public void click_on_the_slider() throws InterruptedException {
        flightSetPage.slider.click();
        Thread.sleep(1500);
    }

    @When("Click on the slider right")
    public void click_on_the_slider_right() throws InterruptedException {
        flightSetPage.clickSliderNext();
        Thread.sleep(2000);

    }

    @When("Select the one way")
    public void select_one_way() throws InterruptedException {
        flightSetPage.oneway.click();
        Thread.sleep(2000);
    }

    @Then("Enter the value for the departure airport")
    public void enter_the_value_for_the_departure_airport() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement departureLabel = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.departureAirport));
            System.out.println("Departure label bulundu ve tıklanıyor...");

            js.executeScript("arguments[0].click();", departureLabel);

            WebElement departureInput = driver.findElement(By.id("departure-input"));

            wait.until(ExpectedConditions.elementToBeClickable(departureInput));

            departureInput.clear();
            departureInput.sendKeys("Ankara");
            Thread.sleep(1000);
            departureInput.sendKeys(Keys.DOWN);
            departureInput.sendKeys(Keys.ENTER);

            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error while interacting with the departure input: " + e.getMessage());
        }
    }


    @When("Select the airport to arrival")
    public void select_the_airport_to_arrival() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement arrivalLabel = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.arrivalAirport));
            js.executeScript("arguments[0].click();", arrivalLabel);

            WebElement arrivalInput = driver.findElement(By.id("arrival-input"));

            wait.until(ExpectedConditions.elementToBeClickable(arrivalInput));

            arrivalInput.clear();
            arrivalInput.sendKeys("Malatya");
            Thread.sleep(1000);
            arrivalInput.sendKeys(Keys.DOWN);
            arrivalInput.sendKeys(Keys.ENTER);
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Error while interacting with the departure input: " + e.getMessage());
        }
    }

    @Then("Click on the search flight button")
    public void click_on_the_search_flight_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.searchFlight));

        searchButton.click();
        System.out.println("Uçuş arama butonuna basıldı!");

        wait.until(driver -> js.executeScript("return document.readyState").equals("complete"));
        System.out.println("Sayfa tamamen yüklendi!");

        Thread.sleep(5000);
    }
}