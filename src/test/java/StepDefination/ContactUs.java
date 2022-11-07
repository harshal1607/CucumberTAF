package StepDefination;

import java.util.List;
import java.util.Map;

import com.automationPractice.pageFactory.AutomationPractice;
import com.automationPractice.pageFactory.ContactUsPage;

import cucumber.api.java.en.*;
import generic.Pojo;

public class ContactUs extends Pojo{

	private Pojo objPojo;
	private ContactUsPage objContactUsPage ;

	public ContactUs(Pojo pojo){
		this.objPojo=pojo ;
		objContactUsPage= new ContactUsPage(pojo);
	}
	@Given("^user navigate to contact us page$")
	public void user_navigate_to_contact_us_page() throws Throwable {
		objContactUsPage.userNavigateToContactUsPage();
	}

	@When("^user fills the form from sheetname \"([^\"]*)\" and rownumber(\\d+)$")
	public void user_fills_the_form_from_sheetname_and_rownumber(String SheetName, int rowNumber) throws Throwable {
		//objContactUsPage.fillTheContactUs(heading, emailId, OrderRefernce, message);
	//ExcelReader reader= new ExcelReader();
	//List<Map<String,String>>testData=
		//reader.getData("D:/eMS 23 Sept/Automation.xlsx",SheetName);
//		String strHeading=testData.get(rowNumber).get("Subjectheading");
//		String strEmail=testData.get(rowNumber).get("email");
//		String strOrderref=testData.get(rowNumber).get("orderrefernce");
//		String strMessage=testData.get(rowNumber).get("message");
		//objContactUsPage.fillTheContactUs(heading, emailId, OrderRefernce, message);

	}

	@And("^user clicks on send button$")
	public void user_clicks_on_send_button() throws Throwable {
		objContactUsPage.userClickOnSendButton();
	}

	@Then("^it shows a message \"([^\"]*)\"$")
	public void it_shows_a_message(String arg1) throws Throwable {
	    
	}
}
