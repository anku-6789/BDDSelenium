package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//What are HOOKS
//Blocks of code that runs before OR after each scenario
//Hooks in Cucumber are like Listeners in TestNG
//Can define hooks by using annotations @Before  @After
//
//Scenario Hooks - runs before and after each scenario
//Step Hooks - runs before and after each step
//Conditional Hooks - hooks associated with tags for conditional execution
//
//Why to use HOOKS
//To manage the setup and teardown
//To avoid rewriting the common setup or teardown actions
//Allow better management of code workflow
//
//When to use HOOKS 
//Whenever you have some common setup and teardown actions to be executed before each scenario 
public class HooksDemoClass{
 WebDriver driver;//so we can user it everywhere
	//here it will wrok as hook
 @Before(order=1)
	public void brwosersetup ()
	{
	     System.out.println("I am using hoook so it will open the browser and moximize it");
	     System.setProperty("webdriver.chrome.driver", "/Users/amandhare/eclipse-workspace/BDD/BDDSeleniumTest/src/test/resources/Drivers/chromedriver");

			driver = new ChromeDriver();

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
 @Before(order=2)
 public void setup2()
 {
	 System.out.println("i am inside setup 2");
 }
 @After
 public void teardown()
 {
	 System.out.println("i am insode tear down 1");
	 driver.close();
	 driver.quit();
 }
 @After(order=1)
 public void teardown2()
 {
	System.out.println("i am insode tear down 2");
	 driver.close();
	 driver.quit();
 }
	@BeforeStep
	public static void beforestep()
	{
		System.out.println("I am here in before steps method");
	}
 
	@AfterStep
	public static void afterestep()
	{
		System.out.println("I am here in After steps method");
	}
 
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("here navigating to login page");

	}

	@When("User enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		System.out.println("Entering username and passoword");
		
	}

	@And("Click on login page")
	public void click_on_login_page() {
		System.out.println("tapping on login button");
	
		
	}

	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() {
	    System.out.println();
		
	}



	
}
