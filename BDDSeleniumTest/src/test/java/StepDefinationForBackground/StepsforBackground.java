package StepDefinationForBackground;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//What is Background?
//A Step or a group of steps that are common to all the scenarios in a feature
//Is defined once in the feature
//Runs before every scenario of the feature
//
//Why use Background?
//To avoid repeating the common steps in every scenario
//For better readability & maintenance
//Unlike hooks, background is visible to the readers of the feature file
//
//When to use Background?
//Whenever there are common repeating steps in a feature
//When you want the common steps to be visible to the readers
public class StepsforBackground {


	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	}



	@Given("user is logged in")
	public void user_is_logged_in() {
	}

	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
	}

	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
	}

	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	}



		
}
