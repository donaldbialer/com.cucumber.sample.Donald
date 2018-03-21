package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by donaldbialer on 2/10/18.
 */
public class AmazonHomePage extends BasePage {

    private By hoverOver = By.id("nav-link-accountList");
    private By SignIn = By.id("nav-link-accountList");
    //private By SignIn = By.xpath("/*[@id=“nav-flyout-ya-signin”]");
    private By invalidEmail = By.id("ap_email");
    private By invalidPassword = By.id("ap_password");
    // private By clickOnSignIn = By.id("a-autoid-0");
    private By clickOnSignIn = By.id("continue");
    private By errorMessage = By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span");

    public void signOverHover() {
        mouseOver(hoverOver);
    }

    public void signInClick() {
        clickOn(SignIn);
    }

    public void invalidEmailAddress(String invalidEmailAddress) {
        sendText(invalidEmail, invalidEmailAddress);
    }

    public void invalidPassword(String invalidPW) {
        sendText(invalidPassword, invalidPW);
    }

    public void clickSignIn() {
        clickOn(clickOnSignIn);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public WebElement passField() {
        return getDriver().findElement(invalidPassword);
    }

    public boolean isPassFieldExists() {
        int count = getDriver().findElements(invalidPassword).size();
        if (count <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void setClickOnSignIn() {
        clickOn(clickOnSignIn);
    }

    //combine method
    public void mouseOverSignIn(String email, String Password) {
        signOverHover();
        invalidEmailAddress(email);
        invalidPassword(Password);
        clickSignIn();
    }

    public String getWarningMessage() {
        String warning = getTextFromElement(errorMessage);
        return warning;
    }

}







