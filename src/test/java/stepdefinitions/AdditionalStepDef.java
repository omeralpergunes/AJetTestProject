package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdditionalPage;

import java.time.Duration;

public class AdditionalStepDef {

    WebDriver driver;
    AdditionalPage additionalPage;

    public AdditionalStepDef() {
        this.driver=Hooks.driver;
        this.additionalPage=new AdditionalPage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", additionalPage.additionalMenu);

    }

    @When("Click on the seat selection")
    public void clickOnTheSeatSelection() throws InterruptedException {
        Thread.sleep(1200);
        additionalPage.seatSelection.click();
        Thread.sleep(2000);
    }

    @When("Click on the excess baggage")
    public void clickOnTheExcessBaggage() throws InterruptedException {
        additionalPage.excessBaggage.click();
        Thread.sleep(2000);
    }

    @When("Click on the meal selection")
    public void clickOnTheMealSelection() throws InterruptedException {
        additionalPage.mealSelection.click();
        Thread.sleep(2000);
    }

}
