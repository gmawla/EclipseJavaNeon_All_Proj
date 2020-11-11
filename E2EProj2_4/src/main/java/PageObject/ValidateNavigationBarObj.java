package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateNavigationBarObj {
	public WebDriver driver;

	public ValidateNavigationBarObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[2]/div/div/div[2]/nav/div[2]/ul")
	WebElement NavBar;

	public WebElement NavBar() {
		return NavBar;
	}

}
