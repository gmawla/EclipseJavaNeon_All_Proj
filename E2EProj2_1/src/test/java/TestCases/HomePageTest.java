package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.ValidateText;
import utilities.base;

public class HomePageTest extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initializeDriver() throws IOException{
		log.info("invoking homePage driver");
		driver = invokeDriver();
		log.info("invoking homePage driver-success.");
		driver.get(prop.getProperty("homePageUrl"));
	}
	
	@Test
	public void validateFeaturedCourse(){
		ValidateText ValidateText = new ValidateText(driver);
		Assert.assertEquals(ValidateText.FeaturedCrsText().getText(), "Featured Cos");
		
		
	}
	
	@AfterTest
	public void tearDrown(){
		driver.close();
	}
	

}
