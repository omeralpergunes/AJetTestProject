package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='material-icons md-20']")
    public WebElement loginClick;

    @FindBy(xpath = "//*[@class='p-inputmask p-inputtext p-component w-full']")
    public WebElement phoneLogin;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "//*[@class='aj-button primary large w-full']")
    public WebElement userLoginClick;
}
