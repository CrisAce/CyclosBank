package OnlineBanking;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePageTestCase extends base {
	
	@BeforeTest
	
	public void initialiseBrowser() throws IOException {
		
		driver = initializeDriver();
		driver.get("https://demo.cyclos.org/");
	}
	
	@Test
	
	public void basePageNavigation() throws IOException {
		
	
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;

	}

}
