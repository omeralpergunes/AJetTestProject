package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FlightSetPage;

import java.time.Duration;

public class FlightSetStepDef {

    WebDriver driver;
    FlightSetPage flightSetPage;


    public FlightSetStepDef() {
        this.driver= Hooks.driver;
        this.flightSetPage = new FlightSetPage();
    }

    @When("Click on the check in")
    public void click_on_the_check_in() throws InterruptedException {
        WebElement element = driver.findElement(By.id("pv_id_3_1_header_action"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);

    }
}
