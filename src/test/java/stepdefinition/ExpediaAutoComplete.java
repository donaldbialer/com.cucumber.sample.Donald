package stepdefinition;


import cucumber.api.PendingException;
import framework.BasePage;
import framework.ExpediaAutocomplete;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by donaldbialer on 3/3/18.
 */
public class ExpediaAutoComplete {
    private ExpediaAutocomplete expediaAutocomplete = new ExpediaAutocomplete();

    @Given("^I am on Expedia home page$")
    public void homePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations", "Invalid home page");
    }

    @When("^I select flight button on menu$")
    public void clickFlightButton() {expediaAutocomplete.clickFlightButton();}


    @And("^I enter/select a Destination and Airport option$")
    public void enterPointOfOrigin() throws InterruptedException
    {expediaAutocomplete.enterPointOfOrigin("New York","John F. Kennedy Intl.");
    java.lang.Thread.sleep(5000);
    }

//    @Then("^Verify Autocomplete displays and populates my selectio$")
//    public void verifyAutocompleteDisplay() {
//        Assert.assertEquals(expediaAutocomplete.getCityAirport(), "New York, NY (JFK-John F. Kennedy Intl.)");
//    }

    @Then("^Verify Autocomplete displays and populates my selection$")
    public void verifyAutocompleteDisplaysAndPopulatesMySelection() throws Throwable {
        String correctDestion = expediaAutocomplete.getCityAirport();
        Assert.assertEquals(correctDestion, "New York, NY (JFK-John F. Kennedy Intl.)");
        throw new PendingException();
    }

    





//    @Then("^Verify Autocomplete displays and populates my selection$")
//    public void verifyAutocompleteDisplays() {
//        String cityLocation = SharedSD.getDriver().findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).getText();
//        Assert.assertEquals(cityLocation, "New York, NY (JFK-John F. Kennedy Intl.)");
//    }
}


