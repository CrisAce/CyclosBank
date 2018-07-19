package OnlineBanking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pageObjects.LandingPage;
import resources.base;

public class TextValidationTestCase extends base {
	
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	
	public void lunchDriver() throws IOException {
		driver = initializeDriver();
		log.info("Driver is intialized");
		driver.get(pageURL);
		log.info("Navigate to Home Page");
	}
	
	@Test
	
	public void checkTextValidation() {
		
		LandingPage lp = new LandingPage(driver);
		String textVal = lp.getTextValidation().getText();
		Assert.assertEquals(textVal, "Cyclos 4 Dem");
		log.info("Successfully validated text");
	
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}

}
