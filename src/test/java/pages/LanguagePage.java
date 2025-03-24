package pages;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguagePage {

    WebDriver driver;
    WebDriverWait wait;

    public LanguagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='lang']")
    private WebElement languageMenu;

    @FindBy(xpath = "//span[@class='lang-select']")
    private WebElement secondLanguage;

    public void clickLanguageMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(languageMenu)).click();
    }

    public void selectSecondLanguage() {
        wait.until(ExpectedConditions.elementToBeClickable(secondLanguage)).click();
    }
}
