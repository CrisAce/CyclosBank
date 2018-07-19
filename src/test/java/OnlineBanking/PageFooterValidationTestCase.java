package OnlineBanking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class PageFooterValidationTestCase extends base {
	
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	
	public void lunchDriver() throws IOException {
		driver = initializeDriver();
		driver.get(pageURL);
		
	}
	
	@Test
	
	public void getFooter() {
		
		LandingPage lp = new LandingPage(driver);
	Boolean footerValid =	lp.getFooterValidation().isDisplayed();
		Assert.assertTrue(footerValid);
		log.info("Footer section is valid");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}

}
