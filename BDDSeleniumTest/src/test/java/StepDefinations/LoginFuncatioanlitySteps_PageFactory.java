//import org.openqa.selenium.chrome.ChromeDriver;
//
//package StepDefinations;
////
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import PageFactoryModel.LoginPage_pf;
//import PageFactoryModel.Logout_pf;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginFuncatioanlitySteps_PageFactory {
//	WebDriver driver = null;
//	LoginPage_pf login;
//	Logout_pf logout;
//
//	@Given("Browser should be open")
//	public void browser_should_be_open() {
//		System.out.println("Her iam in page factory model with login functionality");
//
//		//For chrome browser
//
//		System.out.println("Inside Step - browser is open");
//
//		//String projectPath = System.getProperty("user.dir");	
//		//	System.out.println("Project path is : "+projectPath);	
//		System.setProperty("webdriver.chrome.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/chromedriver");
//
//		driver = new ChromeDriver();
//
//
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//		driver.manage().window().maximize();
//		//
//		//		//for firefox/
//		//		//	System.setProperty("webdriver.gecko.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/geckodriver");
//		//
//		//
//		//		//	driver = new FirefoxDriver();
//
//
//
//	}
//
//	@And ("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^after entering (.*)and (.*)$")
//
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
//		login = new  LoginPage_pf(driver);
//	
//		login.enterUsername(username);
//		login.enterPassword(password);
//
//
//
//		Thread.sleep(2000);
//	}
//
//
//
//	@And ("tap on login button")
//	public void tap_on_login_button() {
//		login.clickOnLogin();
//
//
//	}
//
//	@Then("User should navigate to homepage of application")
//	public void user_should_navigate_to_homepage_of_application() throws InterruptedException {
//
//		logout.checklogoutIsDisplayed();
//
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//
//	}
//
//}