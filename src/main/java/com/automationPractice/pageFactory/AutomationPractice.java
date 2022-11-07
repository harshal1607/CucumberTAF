package com.automationPractice.pageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.BaseTest;
import generic.Pojo;

public class AutomationPractice extends BaseTest{

	WebElement RadioButton_1;
	WebElement DropDownIcon;
	WebElement CheckBox_1;
	WebElement btnHome;
	WebElement mouseHovorElement;
	private Pojo objPojo;

	public AutomationPractice(Pojo pojo){
		this.objPojo=pojo;
	}

	public void verifyAutomationPracticePageUrlIsOpen()  {
		//objPojo.getDrivernavigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Pojo.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
		//String parentWindowId=objPojo.getDrivergetWindowHandle();
		Pojo.getDriver().manage().window().maximize();
	}
	public void userClickOnRadioButton() throws InterruptedException {
		RadioButton_1=Pojo.getDriver().findElement(By.xpath("(//label/input[@name='radioButton'])[1]")); 
		RadioButton_1.click();
		Thread.sleep(30);	
	}
	public void verifyRadioButtonIsSelected()  {
		Boolean RadioButton_1=Pojo.getDriver().findElement(By.name("radioButton")).isSelected();
		Assert.assertTrue(RadioButton_1);
	}
	public void verifyUserCanClickOnDropdownOption() throws Throwable {
		DropDownIcon=Pojo.getDriver().findElement(By.xpath("//div[@class='cen-right-align']/child::fieldset/select[@id='dropdown-class-example']"));
		DropDownIcon.click();
		Pojo.getDriver().findElement(By.id("dropdown-class-example")).isSelected();
	}
	public void verifyUserCanSelectDropdownOption() throws InterruptedException{
		Select Dropdownoption= new Select(Pojo.getDriver().findElement(By.id("dropdown-class-example")));
		Dropdownoption.selectByVisibleText("Option1");
		Thread.sleep(30);
	}
	public void verifyUserCanSelectCheckboxOption() throws Throwable {
		CheckBox_1= Pojo.getDriver().findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/label/child::input[@id='checkBoxOption1']"));  
		CheckBox_1.click();
	}
	public void verifyCheckboxIsSelected()  {
		Boolean CheckBox_1=Pojo.getDriver().findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertTrue(CheckBox_1);
	}
	public void verifyUserClickOnOpenWindow() throws Throwable {
		Pojo.getDriver().findElement(By.xpath("//div[@class='block large-row-spacer']/child::div/child::fieldset/button[@id='openwindow' and text()='Open Window']")).click();
	}
	public void verifyUserNavigatedToNewWindow() throws Throwable {
		//objPojo.getDriver().Element(By.xpath("//div[@class='block large-row-spacer']/child::div/child::fieldset/button[@id='openwindow' and text()='Open Window']"));
		Set <String>secondWindow=Pojo.getDriver().getWindowHandles();//return window/browser ids
		for(String i:secondWindow){
			String strTitle=Pojo.getDriver().switchTo().window(i).getTitle();
			System.out.println("Title of window:"+strTitle);
			Thread.sleep(5);

		}
		//objPojo.getDriverswitchTo().window("parentWindowId");
	}
	public  void verifyUserCanEnterNameInTextBox(String username) throws Throwable {
		Pojo.getDriver().findElement(By.xpath("//div/child::fieldset/input[@id='name']")).sendKeys(username);
		Thread.sleep(20);
	}
	public void verifyUserCanClickOnAlertButton() throws Throwable {
		Pojo.getDriver().findElement(By.xpath("//div/child::fieldset/input[@id='alertbtn']")).click();
	}
	public void verifyAlertPopupIsDisplay() throws InterruptedException {
		Pojo.getDriver().switchTo().alert().accept();
		Thread.sleep(20);
	}
	public void setAutoSUggestedDropdownValue(String strInputValue) throws InterruptedException{
		By locator=By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']//li/div[1]");
		WebElement webElement = Pojo.getDriver().findElement(By.xpath("//input[@id='autocomplete'][@placeholder='Type to Select Countries']"));
		webElement.sendKeys(strInputValue);
		Thread.sleep(20);
		List<WebElement> listElement = Pojo.getDriver().findElements(locator);
		for (WebElement webElement_1 : listElement) {
			String strCountryName=webElement_1.getText().trim();
			if(strCountryName.toLowerCase().equals("india")){
				webElement_1.click();            
				break;
			}
		}
	}
	public void userMouseHovorOnMouseHovorButton() throws Throwable {
		mouseHovorElement=Pojo.getDriver().findElement(By.xpath("//button[@id='mousehover' and text()='Mouse Hover']"));
		Actions action=new Actions(Pojo.getDriver());
		action.moveToElement(mouseHovorElement).perform();
	}
	public void verifyTwoOptionsShouldDisplay() throws Throwable {
		Boolean mouseHovorContent=Pojo.getDriver().findElement(By.xpath("//div[@class='mouse-hover']/div[@class='mouse-hover-content']")).isDisplayed();
		Assert.assertTrue(mouseHovorContent);
	}
	public void verifyUserClickOnOpenTab() throws Throwable {
		Pojo.getDriver().findElement(By.xpath("//div[@class='cen-align']/child::fieldset/a[@id='opentab' and text()='Open Tab']")).click();
	}
	public void verifyuserClickOnHideButton() throws Throwable {
		Pojo.getDriver().findElement(By.xpath("//div[@class='right-align']/fieldset/legend[text()='Element Displayed Example']/following::input[@id='hide-textbox']")).click();
		Thread.sleep(10);

	}
	public void verifyTextBoxIsNotDispalyed() throws Throwable {
		Boolean textBox=Pojo.getDriver().findElement(By.xpath("//div[@class='right-align']/fieldset/legend[text()='Element Displayed Example']/following::input[@id='displayed-text']")).isDisplayed();
		Assert.assertFalse(textBox);
	}
	@When("^user click on show button$")
	public void verifyUserClickOnShowButton() throws Throwable {
		Pojo.getDriver().findElement(By.xpath("//div[@class='right-align']/fieldset/legend[text()='Element Displayed Example']/following::input[@id='show-textbox']")).click();
		Thread.sleep(10);

	}

	@Then("^user should  able to see textbox$")
	public void verifyTextBoxIsDispalyed() throws Throwable {
		Boolean textBox=Pojo.getDriver().findElement(By.xpath("//div[@class='right-align']/fieldset/legend[text()='Element Displayed Example']/following::input[@id='displayed-text']")).isDisplayed();
		Assert.assertTrue(textBox);
	}
	public void verifyUserShouldAbleToGetRowData(int intRow){
		WebElement rowData=Pojo.getDriver().findElement(By.xpath("//table[@id='product']/tbody//th[text()='Instructor']/parent::tr/following-sibling::tr["+intRow+"]"));
		String tableData=rowData.getText();
		System.out.println("TableData:"+tableData);
	}
	public List<String> getRowDataOfTable(int intRow){
		List<String> arrayList=new ArrayList<String>();
		WebElement myTable=Pojo.getDriver().findElement(By.xpath("//table[@id='product']"));
		List<WebElement> tableRows=myTable.findElements(By.tagName("tr"));
		List<WebElement> tableColumns=tableRows.get(intRow).findElements(By.tagName("td"));
		int cols_count=tableColumns.size();
		for(int c=0;c<cols_count;c++){
			String cellTxt=tableColumns.get(c).getText();
			arrayList.add(cellTxt);

		}
		System.out.println(arrayList);
		return arrayList;
	}
	public void verifyUserShouldVerifyDataTableTextFields(DataTable dataTable)  {
		JavascriptExecutor js = (JavascriptExecutor) Pojo.getDriver();
		js.executeScript("window.scrollBy(0,280)", "");
		List<Map<String, String>> listDataTable=dataTable.asMaps(String.class,String.class);
		for(int i=0;i<listDataTable.size();i++){
			String testData=listDataTable.get(i).get("Fields");
			WebElement webElement=Pojo.getDriver().findElement(By.xpath("//th[text()='"+testData+"']"));
			if(!testData.equals(""))
				Assert.assertTrue(webElement.isDisplayed());
			System.out.println("User verify fields of data table:"+testData);
		}
	}
	public void userClickOnIframeExampleButton() throws Throwable {
		Boolean btn=Pojo.getDriver().findElement(By.xpath("//legend[text()='iFrame Example']")).isDisplayed();
		Assert.assertTrue(btn);
	}

	public void userShouldVerifyImageRS() throws Throwable {
		Pojo.getDriver().switchTo().frame("iframe-name");
		Boolean logo= Pojo.getDriver().findElement(By.xpath("//div[@class='logo']//img[@src='assets/images/rs_logo.png']")).isDisplayed();
		Assert.assertTrue(logo);
		Pojo.getDriver().switchTo().defaultContent();

	}
	public void userIsOnFBSignUpPage() throws Throwable {
		Pojo.getDriver().get("https://www.facebook.com/reg");
		Pojo.getDriver().manage().window().maximize();
		Thread.sleep(20);
		//		Boolean fb_Text= Pojo.getDriver().findElement(By.xpath("//div[text()='Sign Up']")).isDisplayed();
		//		Assert.assertTrue(fb_Text);
	}
	public void userClickOnCreateNewAccountButton() throws Throwable {
		//		WebElement btn_SignUp=Pojo.getDriver().findElement(By.xpath("//a[text()='Create New Account']"));
		//		btn_SignUp.click();
		//		Thread.sleep(20);
		System.out.println("User is on Sign up page:");
	}

	public void userShouldVerifyFBSignUpTextFields(DataTable dataTable) throws Throwable {
		List<Map<String,String>> listDataTable=dataTable.asMaps(String.class, String.class);
		for(int i=0;i<listDataTable.size();i++){
			String testData=listDataTable.get(i).get("fields");
			if(testData.equals("firstname")||testData.equals("lastname")||testData.equals("reg_email__")||testData.equals("reg_passwd__")){    
				WebElement webElement=Pojo.getDriver().findElement(By.xpath("//input[@name='"+testData+"']"));
				if(!testData.equals("")){
					Assert.assertTrue(webElement.isDisplayed());
					System.out.println("verify fields of Facebook Sign up Page: "+testData);
				}
			}
			if(testData.equals("birthday_day")||testData.equals("birthday_month")||testData.equals("birthday_year")){    
				WebElement webElement=Pojo.getDriver().findElement(By.xpath("//select[@name='"+testData+"']"));
				if(!testData.equals("")){
					Assert.assertTrue(webElement.isDisplayed());
					System.out.println("verify fields of Facebook Sign up Page:"+testData);
				}
			}
			if(testData.equals("Female")||testData.equals("Male")||testData.equals("Custom")){    
				WebElement webElement=Pojo.getDriver().findElement(By.xpath("//label[text()='"+testData+"']"));
				if(!testData.equals("")){
					Assert.assertTrue(webElement.isDisplayed());
					System.out.println("verify fields of Facebook Sign up Page: "+testData);
				}
			}
			if(testData.equals("Sign Up")){    
				WebElement webElement=Pojo.getDriver().findElement(By.xpath("//button[text()='"+testData+"']"));
				if(!testData.equals("")){
					Assert.assertTrue(webElement.isDisplayed());
					System.out.println("verify fields of Facebook Sign up Page: "+testData);
				}
			}

		}
	}
	public void userEntersFirstName() throws Throwable {
		String strFirstName=Pojo.getObjExcelReader().get("Scenario","firstName");
		Pojo.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(strFirstName);
	}
	public void userEntersSurname() throws Throwable {
		String strLastName=Pojo.getObjExcelReader().get("Scenario","firstName");
		Pojo.getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys(strLastName);

	}

	public void userShouldSignUpFields() throws Throwable {
      System.out.println("First Name and Last Name are inserted:");
	}
}

