package OnlineBanking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class LoginPageTestCase extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void lunchDriver() throws IOException {

		driver = initializeDriver();
		// driver.get("https://demo.cyclos.org");
		driver.get(pageURL);
	}

	@Test(dataProvider = "getData")

	public void loginPage(String User, String password) throws IOException {

		LandingPage landpage = new LandingPage(driver);
		landpage.getLogin().click();

		LoginPage loginpage = new LoginPage(driver);
		loginpage.getEmail().sendKeys(User);
		loginpage.getPassword().sendKeys(password);
		loginpage.getSignIn().click();
	}

	@DataProvider
	public Object[][] getData() {
		// row stands for how many different data types test should run
		// column stands for how many values per each test
		Object[][] data = new Object[2][2];
		// 0th row
		data[0][0] = "demo";
		data[0][1] = "1234";
		// 1st row
		data[1][0] = "demo2";
		data[1][1] = "1234";

		return data;

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;

	}

}
