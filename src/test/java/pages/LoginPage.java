package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;

    // WebDriver parametre olarak alınıyor
    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this); // Elementleri başlatıyoruz
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
