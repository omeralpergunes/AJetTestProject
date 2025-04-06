package pages;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdditionalPage {

    WebDriverWait wait;
    WebDriver driver = Hooks.driver;

    public AdditionalPage() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='flex flex-wrap text-2xl md:text-4xl font-semibold gap-2 aj-font']")
    public WebElement additionalMenu;

    @FindBy(xpath = "//*[@src='/_ajt_theme/svg/KoltukSecimi.svg']")
    public WebElement seatSelection;

    @FindBy(xpath = "//*[@src='/_ajt_theme/svg/FazlaBagaj.svg']")
    public WebElement excessBaggage;

    @FindBy(xpath = "//*[@src='/_ajt_theme/svg/YemekSecimi.svg']")
    public WebElement mealSelection;
}
