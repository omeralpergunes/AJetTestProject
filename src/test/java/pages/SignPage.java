package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage {

    WebDriver driver;

    public SignPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name='dateOfBirth']")
    public WebElement birthDay;

    @FindBy(xpath = "//*[@for='gender2']")
    public WebElement gender;

    @FindBy(xpath = "//*[@placeholder='Cep Telefonu']")
    public WebElement usernamePhone;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;


    @FindBy(xpath = "//*[@class='grid mt-40']")
    public WebElement signUpClick;

}
