package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import pages.FlightSetPage;

public class FlightSetStepDef {

    WebDriver driver;
    FlightSetPage flightSetPage;


    public FlightSetStepDef() {
        this.driver= Hooks.driver;
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
}
