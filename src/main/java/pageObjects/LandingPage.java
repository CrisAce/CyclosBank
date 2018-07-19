package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signIn = By.cssSelector("li.statusMenuItem:nth-child(2)");
	By textValidation = By.cssSelector(".pageHeadingText");
	By footerSection = By.cssSelector(".footerContents");

	/*
	 * @FindBy(css="li.statusMenuItem:nth-child(2)") 
	 * WebElement signInButton;
	 */

	public WebElement getLogin() {

		return driver.findElement(signIn);
	}
	
	public WebElement getTextValidation() {
		return driver.findElement(textValidation);
	}
	
	public WebElement getFooterValidation() {
		return driver.findElement(footerSection);
	}

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

}
