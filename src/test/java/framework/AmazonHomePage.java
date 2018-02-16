package framework;

import org.openqa.selenium.By;
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
    private By clickOnSignIn = By.id("a-autoid-0");
    private By errorMessage = By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span");

    public void signOverHover() {mouseOver(hoverOver);}

    public void signInClick() {clickOn(SignIn); }

    public void invalidEmailAddress(String invalidEmailAddress){sendText(invalidEmail, invalidEmailAddress); }

    public void invalidPassword(String invalidPW){sendText(invalidPassword, invalidPW); }

    public void clickSignIn () {clickOn(clickOnSignIn);}

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    //public void verifyInvalidMessage
    // Replicate Homepage Format
}



