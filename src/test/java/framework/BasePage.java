package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepdefinition.SharedSD;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class BasePage extends SharedSD {

	public void clickOn(By locator) {
		try {
			SharedSD.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public void sendText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = SharedSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}

	public void clickOnBrowserBackArrow() {
		SharedSD.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		SharedSD.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		SharedSD.getDriver().navigate().refresh();
	}


	//Mouseover
	public void mouseOver(By locator)/*throws InterruptedException*/{
		WebElement element = SharedSD.getDriver().findElement(locator);
		Actions action = new Actions(SharedSD.getDriver());
		action.moveToElement(element).build().perform();
		//SharedSD.getDriver().findElement(locator2).click();
	}



	//Enter value to Input Fields
	public void setValueToInputField(By locator, String value) {
		SharedSD.getDriver().findElement(locator).sendKeys(value);

	}
}
