package StepDefination;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.pageFactory.AutomationPractice;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import generic.BaseTest;
import generic.Pojo;

public class Practice extends Pojo{

	private Pojo objPojo;
	private AutomationPractice objAutomationPractice ;

	public Practice(Pojo pojo){
		this.objPojo=pojo ;
		objAutomationPractice= new AutomationPractice(pojo);
	}
	@Given("^automation practice site is open$")
	public void automation_practice_site_is_open() throws Throwable {
		//objAutomationPractice.beforeMethod();
		//driver= new ChromeDriver();
		objAutomationPractice.verifyAutomationPracticePageUrlIsOpen();
	}

	@And("^user is on automation practice site home page$")
	public void user_is_on_automation_practice_site_home_page() throws InterruptedException {
		Thread.sleep(20);
		objPojo.getDriver().getPageSource().contains("Practice Page");
	//driver.findElement(By.xpath("//h1[text()='Practice Page']")).isDisplayed();
	}
	@When("^user click radio button$")
	public void user_click_radio_button() throws Throwable {
		objAutomationPractice.userClickOnRadioButton();	
	}

	@Then("^radio button should be selected$")
	public void radio_button_should_be_selected()  {
		objAutomationPractice.verifyRadioButtonIsSelected();
		//objAutomationPractice.afterMethod();
	}
	@When("^user click on dropdown option$")
	public void user_click_on_dropdown_option() throws Throwable {
		objAutomationPractice.verifyUserCanClickOnDropdownOption();
	}

	@And("^dropdown should be selected$")
	public void dropdown_should_be_selected() throws Throwable {
		objAutomationPractice.verifyUserCanSelectDropdownOption();
		//objAutomationPractice.afterMethod();

	}
	@When("^user select checkbox option$")
	public void user_select_checkbox_option() throws Throwable {
		objAutomationPractice.verifyUserCanSelectCheckboxOption();
	}

	@Then("^checkbox should be selected$")
	public void checkbox_should_be_selected() throws Throwable {
		objAutomationPractice.verifyCheckboxIsSelected();
		//objAutomationPractice.afterMethod();

	}
	@When("^user click on open window$")
	public void user_click_on_open_window() throws Throwable {
		objAutomationPractice.verifyUserClickOnOpenWindow();
	}

	@Then("^user should navigated new page$")
	public void user_should_navigated_new_page() throws Throwable {
		objAutomationPractice.verifyUserNavigatedToNewWindow();
		//objAutomationPractice.afterMethod();

	}
	@When("^user enter (.*) in text box$")
	public void user_enter_name_in_text_box(String username) throws Throwable {
		objAutomationPractice.verifyUserCanEnterNameInTextBox(username);
	}

	@When("^click on alert button$")
	public void click_on_alert_button() throws Throwable {
		objAutomationPractice.verifyUserCanClickOnAlertButton();
	}

	@Then("^alert popup should display$")
	public void alert_popup_should_display() throws Throwable {
		objAutomationPractice.verifyAlertPopupIsDisplay();
	}

	@Then("^user should able to close popup displayed$")
	public void user_should_able_to_close_popup_displayed() throws Throwable {
		objPojo.getDriver().getPageSource().contains("Practice Page");
		//objAutomationPractice.afterMethod();

	}

	@When("^user enter country name India in textbox$")
	public void user_enter_country_name_India_in_textbox() throws Throwable {
		objAutomationPractice.setAutoSUggestedDropdownValue("India");
	}

	@Then("^country name India should be selected$")
	public void country_name_India_should_be_selected() throws Throwable {
		//objAutomationPractice.afterMethod();

	}
	@When("^user mouse hovor on mouse hovor button$")
	public void user_mouse_hovor_on_mouse_hovor_button() throws Throwable {
		objAutomationPractice.userMouseHovorOnMouseHovorButton();
	}

	@Then("^two options should display$")
	public void two_options_should_display() throws Throwable {
		objAutomationPractice.verifyTwoOptionsShouldDisplay();
		//objAutomationPractice.afterMethod();

	}
	@When("^user click on open tab$")
	public void user_click_on_open_tab() throws Throwable {
		objAutomationPractice.verifyUserClickOnOpenTab();
		//objAutomationPractice.afterMethod();

	}

	@When("^user click on hide button$")
	public void user_click_on_hide_button() throws Throwable {
		objAutomationPractice.verifyuserClickOnHideButton();
	}

	@Then("^user should not able to see textbox$")
	public void user_should_not_able_to_see_textbox() throws Throwable {
		objAutomationPractice.verifyTextBoxIsNotDispalyed();
	//	objAutomationPractice.afterMethod();

	}
	@When("^user click on show button$")
	public void user_click_on_show_button() throws Throwable {
		objAutomationPractice.verifyUserClickOnShowButton();
	}
	@Then("^user should  able to see textbox$")
	public void user_should_able_to_see_textbox() throws Throwable {
		objAutomationPractice.verifyTextBoxIsDispalyed();
	}
	@When("^user enters  any row number$")
	public void user_enters_any_row_number() throws Throwable {
		objAutomationPractice.getRowDataOfTable(2);
		//objAutomationPractice.verifyUserShouldAbleToGetTableData();
	}

	@Then("^user should  able to get that row data$")
	public void user_should_able_to_get_that_row_data() throws Throwable {
		//objAutomationPractice.afterMethod();

	}


	@Then("^user should verify data table text fields are dispalyed$")
	public void user_should_verify_data_table_text_fields_are_dispalyed(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		objAutomationPractice.verifyUserShouldVerifyDataTableTextFields(dataTable);
	}
	@When("^user click iframe example button$")
	public void user_click_iframe_example_button() throws Throwable {
		objAutomationPractice.userClickOnIframeExampleButton();
	}

	@Then("^user should verify image RS$")
	public void user_should_verify_image_RS() throws Throwable {
		objAutomationPractice.userShouldVerifyImageRS();
		//objAutomationPractice.afterMethod();

	}
	@Given("^user is on FB Sign up page$")
	public void user_is_on_FB_Sign_up_page() throws Throwable {
		objAutomationPractice.userIsOnFBSignUpPage();
	}

	@When("^user click on create new account button$")
	public void user_click_on_create_new_account_button() throws Throwable {
		objAutomationPractice.userClickOnCreateNewAccountButton();
	}

	@Then("^user should verify FB sign up  text fields are dispalyed$")
	public void user_should_verify_FB_sign_up_text_fields_are_dispalyed(DataTable dataTable) throws Throwable {
		objAutomationPractice.userShouldVerifyFBSignUpTextFields(dataTable);

	}
	
	@When("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		objAutomationPractice.userEntersFirstName();
	}
	@And("^user enters surname$")
	public void user_enters_surname() throws Throwable {
		objAutomationPractice.userEntersSurname();
	}

	@Then("^user should sign up fields$")
	public void user_should_sign_up_fields() throws Throwable {
		objAutomationPractice.userShouldSignUpFields();
	}

}

