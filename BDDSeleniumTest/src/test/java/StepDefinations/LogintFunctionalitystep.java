package StepDefinations;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogintFunctionalitystep {

	WebDriver driver = null;


	@Given("Browser should be open")


	public void browser_is_open() {

		System.out.println("Inside Step - browser is open");

		//String projectPath = System.getProperty("user.dir");
		//System.out.println("Project path is : "+projectPath);

		//System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/Drivers/geckodriver");

		System.setProperty("webdriver.chrome.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/chromedriver");

		driver = new ChromeDriver();

		//driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}




	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	

	@When("^after entering (.*) and (.*)")
	public void after_entering_Raghav_and_passowrd(String username, String password) throws InterruptedException {
	   

		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(2000);
	}
	@And("tap on login button")
	public void tap_on_login_button() {


		driver.findElement(By.id("login")).click();
	}

	@Then("User should navigate to homepage of application")
	public void user_should_navigate_to_homepage_of_application()throws InterruptedException {

		driver.findElement(By.id("logout")).isDisplayed();

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}


}






