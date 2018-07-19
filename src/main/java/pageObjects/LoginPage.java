package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage  {

	public WebDriver driver;



	By email = By.cssSelector("input[name='principal']");
	By password = By.cssSelector("input[name='password']");
	By signIn = By.cssSelector(".actionButtonText");

	public WebElement getEmail() {

		return driver.findElement(email);
	}

	public WebElement getPassword() {
		
		return driver.findElement(password);
	}
	
	public WebElement getSignIn() {
		
		return driver.findElement(signIn);
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	

}
