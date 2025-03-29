package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FlightSetPage;
import java.time.Duration;
import java.util.List;

public class FlightSetStepDef {

    WebDriver driver;
    FlightSetPage flightSetPage;


    public FlightSetStepDef() {
        this.driver = Hooks.driver;
        this.flightSetPage = new FlightSetPage();
    }

    @Given("User goes to site")
    public void user_goes_to_site() throws InterruptedException {
        driver.get("https://ajet.com/");
        Thread.sleep(2000);
    }

    @When("Click on the check in")
    public void click_on_the_check_in() throws InterruptedException {
        flightSetPage.clickCheckIn();
        Thread.sleep(2000);

    }

    @When("Click on the flight management")
    public void click_on_the_flight_management() throws InterruptedException {
        flightSetPage.clickFlightManagement();
        Thread.sleep(2000);
    }

    @When("Click on the flight status")
    public void click_on_the_flight_status() throws InterruptedException {
        flightSetPage.clickFlightStatus();
        Thread.sleep(1000);
    }

    @When("Click on the slider")
    public void click_on_the_slider() throws InterruptedException {
        flightSetPage.slider.click();
        Thread.sleep(1500);
    }

    @When("Click on the slider right")
    public void click_on_the_slider_right() throws InterruptedException {
        flightSetPage.clickSliderNext();
        Thread.sleep(2000);

    }

    @When("Select the one way")
    public void select_one_way() throws InterruptedException {
        flightSetPage.oneway.click();
        Thread.sleep(2000);
    }

    @Then("Enter the value for the departure airport")
    public void enter_the_value_for_the_departure_airport() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement departureLabel = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.departureAirport));
            System.out.println("Departure label bulundu ve tıklanıyor...");

            js.executeScript("arguments[0].click();", departureLabel);

            WebElement departureInput = driver.findElement(By.id("departure-input"));

            wait.until(ExpectedConditions.elementToBeClickable(departureInput));

            departureInput.clear();
            departureInput.sendKeys("Ankara");
            Thread.sleep(1000);
            departureInput.sendKeys(Keys.DOWN);
            departureInput.sendKeys(Keys.ENTER);

            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Hata!!: " + e.getMessage());
        }
    }


    @When("Select the airport to arrival")
    public void select_the_airport_to_arrival() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement arrivalLabel = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.arrivalAirport));
            js.executeScript("arguments[0].click();", arrivalLabel);

            WebElement arrivalInput = driver.findElement(By.id("arrival-input"));

            wait.until(ExpectedConditions.elementToBeClickable(arrivalInput));

            arrivalInput.clear();
            arrivalInput.sendKeys("Malatya");
            Thread.sleep(1000);
            arrivalInput.sendKeys(Keys.DOWN);
            arrivalInput.sendKeys(Keys.ENTER);
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Hata!!!: " + e.getMessage());
        }
    }

    @Then("Select departure date")
    public void select_departure_date() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        flightSetPage.datePicker.click();
        Thread.sleep(2000);
        try {
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.datePickerNext));
            nextButton.click();
        } catch (Exception e) {
            System.out.println("İşlem gerçekleşmedi. Lütfen tekrar deneyin.");
        }
        WebElement dateFlight = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.datePickerNext));

        JavascriptExecutor dateJs = (JavascriptExecutor) driver;
        dateJs.executeScript("arguments[0].click();", dateFlight);
    }

    @Then("Determine the number of passengers arriving")
    public void determine_number_of_passengers_arriving() throws InterruptedException {
        flightSetPage.passenger.click();
        Thread.sleep(1000);
        flightSetPage.passengerAdd.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(1000);
    }


    @Then("Select the round trip")
    public void select_the_round_trip() throws InterruptedException {
        flightSetPage.roundTrip.click();
    }

    @Then("Select return date")
    public void select_return_date() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.activeElement.blur();");
        Thread.sleep(1000);

        js.executeScript("arguments[0].click();", flightSetPage.returnDate);
        Thread.sleep(2000);

        try {
            WebElement prevButton = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.datePickerPrev));
            prevButton.click();
        } catch (Exception e) {
            System.out.println("Tarihe tıklandı.");
        }

        WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.datePickerPrev));
        js.executeScript("arguments[0].click();", returnDate);
    }

    @Then("Click on the search flight button")
    public void click_on_the_search_flight_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor search = (JavascriptExecutor) driver;
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.searchFlight));
        searchButton.click();
        wait.until(driver -> search.executeScript("return document.readyState").equals("complete"));
        Thread.sleep(5000);
    }

     @Then("Access ticket area")
     public void access_ticket_area() throws InterruptedException {
        flightSetPage.ticketCheckIn.click();
        Thread.sleep(1000);
        flightSetPage.ticketCheckIn.sendKeys("14ALFGKG");
     }

     @Then("Enter a value in the lastname field")
    public void enter_a_value_in_the_lastname_field() throws InterruptedException {
        flightSetPage.ticketCheckSurname.click();
        Thread.sleep(1000);
        flightSetPage.ticketCheckSurname.sendKeys("GÜNEŞ");
        Thread.sleep(1000);
     }

     @Then("Click on the search button")
    public void click_on_the_search_button() throws InterruptedException {
        flightSetPage.checkInSearch.click();
        Thread.sleep(2000);
     }

     @Then("Access pnr area")
    public void access_pnr_area() throws InterruptedException {
         flightSetPage.ticketCheckIn.click();
         Thread.sleep(1000);
         flightSetPage.ticketCheckIn.sendKeys("14ALFGKG5698664");

     }
     @Then("Click on the route search")
    public void click_on_the_route_search() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

         try {
             wait.until(ExpectedConditions.presenceOfElementLocated(By.id("goToRouteList")));
             WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.routeSearchButton));
             searchButton.click();

         } catch (TimeoutException e) {
             System.out.println("Hata!! İstenen zaman da çalışmadı..");
         } catch (Exception e) {
             System.out.println("Tıklanmıyor!!: " + e.getMessage());
         }
     }

     @Then("Enter the value for the departure")
     public void enter_the_value_for_the_departure() throws InterruptedException {
         try {
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             JavascriptExecutor js = (JavascriptExecutor) driver;

             WebElement undefinedLabel = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.undefinedFromInput));

             js.executeScript("arguments[0].click();", undefinedLabel);

             WebElement undefinedInput = driver.findElement(By.id("undefined-input"));

             wait.until(ExpectedConditions.elementToBeClickable(undefinedInput));

             undefinedInput.clear();
             undefinedInput.sendKeys("Ankara");
             Thread.sleep(1000);
             undefinedInput.sendKeys(Keys.DOWN);
             undefinedInput.sendKeys(Keys.ENTER);
             Thread.sleep(1000);
             undefinedInput.sendKeys(Keys.TAB);
             undefinedInput.sendKeys(Keys.ENTER);

         } catch (Exception e) {
             System.out.println("Hata!!: " + e.getMessage());
         }
     }

     @Then("Enter the value for arrival")
     public void enter_the_value_for_arrival() throws InterruptedException {
         try {
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             JavascriptExecutor js = (JavascriptExecutor) driver;

             WebElement arrivalLabel = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.arrivalInput));
             js.executeScript("arguments[0].click();", arrivalLabel);

             List<WebElement> undefinedInputs = driver.findElements(By.id("undefined-input"));

             if (undefinedInputs.size() > 1) {
                 WebElement secondUndefinedInput = undefinedInputs.get(1);

                 wait.until(ExpectedConditions.elementToBeClickable(secondUndefinedInput));

                 secondUndefinedInput.clear();
                 secondUndefinedInput.sendKeys("İzmir");
                 Thread.sleep(1000);

                 secondUndefinedInput.sendKeys(Keys.DOWN);
                 secondUndefinedInput.sendKeys(Keys.ENTER);
                 Thread.sleep(1000);

             } else {
                 System.out.println(" Değer bulunamadı!");
             }
         } catch (Exception e) {
             System.out.println("Hata!!: " + e.getMessage());
         }}


     @Then("Select the departure date")
     public void select_the_departure_date() throws InterruptedException {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         flightSetPage.datePicker.click();
         Thread.sleep(2000);
         try {
             WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.datePickerNext));
             nextButton.click();
         } catch (Exception e) {
             System.out.println("İşlem gerçekleşmedi. Lütfen tekrar deneyin.");
         }
         WebElement dateFlight = wait.until(ExpectedConditions.elementToBeClickable(flightSetPage.datePickerNext));

         JavascriptExecutor dateJs = (JavascriptExecutor) driver;
         dateJs.executeScript("arguments[0].click();", dateFlight);
     }
     }
