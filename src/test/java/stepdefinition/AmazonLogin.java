package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AmazonHomePage;
import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by donaldbialer on 2/10/18.
 */
public class AmazonLogin {

    private AmazonHomePage amazonHomePage = new AmazonHomePage();

    @Given("^I am on home page of Amazon$")
    public void homePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", "Invalid home page");
    }

    @When("^I Hover over to Accounts & List$")
    public void signOverHover() {
        amazonHomePage.signOverHover();
    }

    @And("^I click on Sign in button$")
    public void SignIn() {
        amazonHomePage.signInClick();
    }

    @And("^I enter (rock@fail.com) for invalid email address$")
    public void invalidEmailAddress(String email) {
        amazonHomePage.invalidEmailAddress(email);
    }

    @And("^I enter (BadPassword) for invalid password$")
    public void invalidEmailPassword(String password) {
        amazonHomePage.invalidPassword(password);
    }

    @And("^I click on continue button$")
    public void clickSignIn() {
        amazonHomePage.clickSignIn();
    }

    @Then("^I verify invalid error message$")
    public void verifyInvalidMessage() {
        String actualError = SharedSD.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
        Assert.assertEquals(actualError, "We cannot find an account with that email address");
    }
}



