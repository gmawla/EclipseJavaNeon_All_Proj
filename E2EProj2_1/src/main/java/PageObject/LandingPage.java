package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[1]/div/div/div[2]/div[2]/a")
	WebElement SignInBtn;
	@FindBy(xpath = "//section[2]/div[1]/div[1]/div[1]/h2")
	WebElement FeaturedCrs;

	public WebElement getLogin() {
		return SignInBtn;
	}

	public WebElement getTitle() {
		return FeaturedCrs;
	}
}
