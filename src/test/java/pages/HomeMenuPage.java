package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomeMenuPage {

    WebDriver driver;
    WebDriverWait wait;

    public HomeMenuPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy( xpath = "//*[@src='/assets/ajet-logo-0d41a81e.svg']")
    public WebElement homeLogo;

    @FindBy(xpath = "//*[@class='material-icons ml-4']")
    public WebElement serviceMenu;

    @FindBy(xpath = "//*[@href='/tr/sehir-rehberi']")
    public WebElement cityMenu;

    @FindBy(xpath = "//*[@href='/tr/sikca-sorulan-sorular']")
    public WebElement questionMenu;

    @FindBy(xpath = "//*[@href='/tr/hizmetlerimiz/koltuk-secimi']")
    public WebElement bedMenu;

    @FindBy(xpath = "//*[@href='/tr/hizmetlerimiz/fazla-bagaj']")
    public WebElement extraBedMenu;

    @FindBy(xpath = "//*[@href='/tr/hizmetlerimiz/cip-lounge']")
    public WebElement cipLoungeMenu;

    @FindBy(xpath = "//*[@href='/tr/hizmetlerimiz/spor-ekipmani']")
    public WebElement sportEquipmentMenu;

    @FindBy(xpath = "//*[@href='/tr/hizmetlerimiz/yemek-secimi']")
    public WebElement foodMenu;

}
