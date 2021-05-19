//package StepDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleSearchSteps {
//	WebDriver driver = null;
//	@Given("Browser should be open")
//	public void browser_should_be_open() {
//
//		System.out.println("Inside Step - browser is open");
//
//	//	String projectPath = System.getProperty("user.dir");
//		//System.out.println("Project path is : "+projectPath);
//
//	//	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//
//		System.setProperty("webdriver.chrome.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/chromedriver");
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//		driver.manage().window().maximize();
//
//	}
//
//	@And("google page should be open")
//	public void google_page_should_be_open() {
//		System.out.println("Inside Step - user is on goolge search page");
//
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("tap on search button")
//	public void tap_on_search_button() throws InterruptedException {
//		System.out.println("Inside Step - user enters a text in search box");
//
//		driver.findElement(By.name("q")).sendKeys("Selenium freamwork");
//
//		Thread.sleep(2000);
//	}
//	@And("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside Step - hits enter");
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}
//
//
//
//
//	@Then("Navigate to search result page")
//	public void navigate_to_search_result_page() throws InterruptedException {
//		System.out.println("Inside Step - hits enter");
//
//System.out.println("Inside Step - user is navigated to search results");
//		
//		driver.getPageSource().contains("Advanced Selenium: Automation Frameworks Online Class");
//		
//		driver.close();
//		driver.quit();
//
//	}}
//
////here earlier Commented this out because here login demo is taking from browser open step from here
//
