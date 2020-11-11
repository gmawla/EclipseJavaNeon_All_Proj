package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.ValidateFeaturedCrsText;
import utilities.base;

public class ValidateFeaturedCrsTest extends base {
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void invokeDriver() throws IOException{
		log.info("ValidateFeaturedCrsTest_invoke_driver");
		driver = initiateDriver();
		log.info("ValidateFeaturedCrsTest_invoke_driver success");
	}
	
	@Test
	public void ValidateFeaturedCourseText(){
		log.info("ValidateFeaturedCrsTest_get_url");
		driver.get(prop.getProperty("homePageUrl"));
		log.info("ValidateFeaturedCrsTest_get_url success");
		log.info("ValidateFeaturedCrsTest_get_validate_text");
		ValidateFeaturedCrsText ValidateFeaturedCrs= new ValidateFeaturedCrsText(driver);
		Assert.assertEquals(ValidateFeaturedCrs.FeaturedCrsText().getText(), "Featured Crs");
		log.info("ValidateFeaturedCrsTest_get_validate_text success");
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
	
}