package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomeMenuPage;

public class HomeMenuStepDef {

    WebDriver driver;
    HomeMenuPage homeMenuPage;

    public HomeMenuStepDef() {
        this.driver = Hooks.driver;
        this.homeMenuPage = new HomeMenuPage(driver);
    }

    @Given("User go to homemenu")
    public void user_go_to_homemenu() {
        driver.get("https://ajet.com/");
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String menu) throws InterruptedException {
        Thread.sleep(2000);
        if (menu.equalsIgnoreCase("services")) {
            homeMenuPage.serviceMenu.click();
            Thread.sleep(2000);
        } else if (menu.equalsIgnoreCase("city")) {
            homeMenuPage.cityMenu.click();
            Thread.sleep(2000);
        } else if (menu.equalsIgnoreCase("about us")) {
            homeMenuPage.questionMenu.click();
            Thread.sleep(3000);
            homeMenuPage.homeLogo.click();
            Thread.sleep(1000);
        }
    }

    @Then("Verify the services menu is displayed")
    public void verify_services_menu_displayed() {
        Assert.assertTrue("Service menu is displayed!", homeMenuPage.serviceMenu.isDisplayed());
    }

    @Then("Verify the city directory is displayed")
    public void verify_city_directory_displayed() {
        Assert.assertTrue("City directory is displayed!", homeMenuPage.cityMenu.isDisplayed());
    }

    @Then("Verify the about us directory is displayed")
    public void verify_about_us_menu_displayed() {
        Assert.assertTrue("About us menu is displayed!", homeMenuPage.questionMenu.isDisplayed());
    }


    @When("User clicks on submenu")
    public void user_clicks_on_submenu() throws InterruptedException {
        homeMenuPage.bedMenu.click();
        Thread.sleep(2000);
        homeMenuPage.extraBedMenu.click();;
        Thread.sleep(1500);
        homeMenuPage.cipLoungeMenu.click();
        Thread.sleep(1500);
        homeMenuPage.sportEquipmentMenu.click();
        Thread.sleep(1500);
        homeMenuPage.foodMenu.click();
        Thread.sleep(1500);
    }

    @And("Close the menu browser")
    public void close_the_menu_browser() {
        driver.quit();
    }
}
