package StepDefination;

import com.automationPractice.pageFactory.BackgroundPractice;

import cucumber.api.java.en.*;
import generic.Pojo;

public class Background extends Pojo {

	private Pojo objPojo;
	private BackgroundPractice objBackgroundPractice;

	public Background(Pojo pojo){
		this.objPojo=pojo ;
		objBackgroundPractice= new BackgroundPractice(pojo);
	}
	@When("^user enters emailid and password$")
	public void user_enters_emailid_and_password() throws Throwable {
		objBackgroundPractice.userEntersEmailidAndPassword();

	}

	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage() throws Throwable {
		objBackgroundPractice.userNavigatedToHomepage();
	}

	@Given("^user is logged in$")
	public void user_is_logged_in() throws Throwable {
		objBackgroundPractice.userIsLoggedIn();
	}

	@When("^user clcik on electronics  link$")
	public void user_clcik_on_electronics_link() throws Throwable {
		objBackgroundPractice.userClcikOnElectronicsLink();
	}

	@Then("^user should navigate to electronics page$")
	public void user_should_navigate_to_electronics_page() throws Throwable {
		objBackgroundPractice.userNavigateToElectronicsPage();
	}

	@When("^user clcik on mobiles and tablets  link$")
	public void user_clcik_on_mobiles_and_tablets_link() throws Throwable {
		objBackgroundPractice.userClcikMobilesTabletsLink();
	}

	@Then("^user should navigate to mobiles and tablets page$")
	public void user_should_navigate_to_mobiles_and_tablets_page() throws Throwable {
		objBackgroundPractice.userNavigateMobilesTabletsPage();
	}

}
