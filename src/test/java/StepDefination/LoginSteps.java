package StepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    System.out.println("User is on login page");

	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	    System.out.println("User enter valid username and password");

	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    System.out.println("User click on login button");

	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
	    System.out.println("User is navigated to home page");
	}

	@When("^user enters valid user(\\d+) and pass(\\d+)$")
	public void user_enters_valid_user_and_pass(int arg1, int arg2) throws Throwable {
	    System.out.println("User enter valid username and password");

	}

}
