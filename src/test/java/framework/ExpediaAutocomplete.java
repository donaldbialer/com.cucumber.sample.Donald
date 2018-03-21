package framework;

import org.openqa.selenium.By;

/**
 * Created by donaldbialer on 3/3/18.
 */
public class ExpediaAutocomplete extends BasePage {

    private By flightButton = By.xpath("//*[@id='tab-flight-tab-hp']");
    private By origin = By.xpath("//*[@id='flight-origin-hp-flight']");
    private By searchResult = By.className("results-item");
    private By cityAirport = By.xpath("//*[@id=\"flight-origin-hp-flight\"]");

    public void clickFlightButton() {
        clickOn(flightButton);
    }

    public void enterPointOfOrigin(String searchCriteria, String choice) {
        autoComplete(origin, searchResult, searchCriteria, choice);
    }

    public String getCityAirport() {
        String CityAirport = getTextFromElement(cityAirport);
        return CityAirport;

    }
}
