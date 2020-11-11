package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateFeaturedCrsText {
	public WebDriver driver;
	
	public ValidateFeaturedCrsText(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//section[2]/div[1]/div[1]/div[1]/h2")
	WebElement FeaturedCrs;

	public WebElement FeaturedCrsText() {
		return FeaturedCrs;
	}
	
	
	
	
	
}
