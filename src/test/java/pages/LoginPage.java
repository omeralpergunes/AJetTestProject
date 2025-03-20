package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    // WebDriver parametre olarak alınıyor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
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

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement signUpUserName;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement signUpLastName;

    @FindBy(xpath = "//*[@id='dateOfBirth']")
    public WebElement birthDay;

   /* @FindBy(xpath = "//*[@id='gender2']")
    public WebElement gender;

    @FindBy(xpath = "//*[@name='username-phone-number']")
    public WebElement usernamePhone;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailSignUp;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordSignUp;*/

}
