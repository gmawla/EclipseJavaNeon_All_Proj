package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.ValidateNavigationBarObj;
import utilities.base;

public class ValidateNavigationBarTest extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void invokeDriver() throws IOException {
		log.info("ValidateNavigationBarTest_invoke_driver");
		driver = initiateDriver();
		log.info("ValidateNavigationBarTest_invoke_driver success");
	}

	@Test
	public void ValidateNavigationBar() {
		log.info("ValidateNavigationBarTest_get_url");
		driver.get(prop.getProperty("homePageUrl"));
		log.info("ValidateNavigationBarTest_get_url success");
		ValidateNavigationBarObj ValidateNavigationBar = new ValidateNavigationBarObj(driver);
		Assert.assertTrue(ValidateNavigationBar.NavBar().isDisplayed());

	}

	@AfterTest
	public void tearDrown() {
		driver.close();
	}

}