package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_pf {
WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	

	public Logout_pf (WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver, LoginPage_pf.class);//Assigning  page  factory webelement
		 }
	
	public void checklogoutIsDisplayed()
	{
		btn_logout.isDisplayed();
	}
}
