package pages;

import hooks.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightSetPage {

    WebDriver driver = Hooks.driver;
    WebDriverWait wait;

    public FlightSetPage() {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "pv_id_3_1_header_action")
    public WebElement checkInButton;
    public void clickCheckIn() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkInButton);
    }

    @FindBy(id = "pv_id_3_2_header_action")
    public WebElement flightManagementButton;
    public void clickFlightManagement() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", flightManagementButton);
    }

    @FindBy(id = "pv_id_3_3_header_action")
    public WebElement flightStatusButton;
    public void clickFlightStatus() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", flightStatusButton);
    }

    @FindBy(xpath = "//div[contains(@class, 'slider') or contains(@class, 'carousel')]//div[contains(@class, 'active')]\n")
    public WebElement slider;


    // Slider Next Button
    @FindBy(xpath = "//*[@class='swp swp-next']")
    public WebElement sliderNextButton;

    public void clickSliderNext() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", sliderNextButton);
    }

    @FindBy(xpath = "//*[@class='p-radiobutton p-component']")
    public WebElement oneway;
    public void clickOneway() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", oneway);
    }

    @FindBy(xpath = "//*[@for='departure-input']")
    public WebElement departureAirport;

    @FindBy(xpath = "//*[@for='arrival-input']")
    public WebElement arrivalAirport;

    @FindBy(xpath = "//*[@class='aj-button primary large search-button']")
    public WebElement searchFlight;

    @FindBy(xpath = "//input[contains(@class, 'dp__input')]")
    public WebElement datePicker;

    @FindBy(xpath = "//div[@id='2025-03-30']")
    public WebElement datePickerNext;

    @FindBy(xpath = "//*[@id='2025-03-31']")
    public WebElement datePickerPrev;

    @FindBy(xpath = "//*[@id='passenger']")
    public WebElement passenger;

    @FindBy(xpath = "//*[@aria-label='Çocuk Artır']")
    public WebElement passengerAdd;

    @FindBy(xpath = "//*[@for='roundtrip']")
    public WebElement roundTrip;

    @FindBy(xpath = "(//*[contains(@class, 'date-picker')])[2]")
    public WebElement returnDate;

    @FindBy(xpath = "//*[@id='bookingId']")
    public WebElement ticketCheckIn;

    @FindBy(xpath = "//*[@name='surname']")
    public WebElement ticketCheckSurname;

    @FindBy(xpath = "//*[@class='aj-button primary large w-full']")
    public WebElement checkInSearch;

    @FindBy(id = "goToRouteList")
    public WebElement routeSearchButton;

    @FindBy(xpath = "//*[@for='undefined-input']")
    public WebElement undefinedFromInput;

    @FindBy(xpath = "//*[@class='el-select__selected-item el-select__placeholder is-transparent']")
    public WebElement arrivalInput;

}
