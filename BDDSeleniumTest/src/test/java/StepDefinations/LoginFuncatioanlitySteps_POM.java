//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import PageObjectModel.loginpage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginFuncatioanlitySteps_POM {
//	WebDriver driver ;
//	loginpage login ;
//	
//	
//	@Given("Browser should be open")
//	public void browser_should_be_open() {
//
//System.out.println("This is login inside with page object model");
//
//
//		//For chrome browser
//
//		System.out.println("Inside Step - browser is open");
//
//		//String projectPath = System.getProperty("user.dir");	
//	//	System.out.println("Project path is : "+projectPath);	
//		System.setProperty("webdriver.chrome.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/chromedriver");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//		driver.manage().window().maximize();
//
//		//for firefox
//		//	System.setProperty("webdriver.gecko.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/geckodriver");
//
//
//		//	driver = new FirefoxDriver();
//
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
//     
//		
//		//loginpage login= new loginpage(driver);//here we have difeinde globally
//		
//		login = new loginpage(driver);
//				
//
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
//	//	driver.findElement(By.id("name")).sendKeys(username);
//	//	driver.findElement(By.id("password")).sendKeys(password);
//
//		Thread.sleep(2000);
//	}
//
//
//
//	@And ("tap on login button")
//	public void tap_on_login_button() {
//		
//		login.clickLogin();
//		//driver.findElement(By.id("login")).click();
//
//
//	}
//
//	@Then("User should navigate to homepage of application")
//	public void user_should_navigate_to_homepage_of_application() throws InterruptedException {
//
//		driver.findElement(By.id("logout")).isDisplayed();
//
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//
//	}
//
//}