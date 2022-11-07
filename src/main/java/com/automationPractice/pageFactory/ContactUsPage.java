package com.automationPractice.pageFactory;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import generic.BaseTest;
import generic.Pojo;

public class ContactUsPage extends BaseTest {

	private Pojo objPojo;
	WebElement contactUs;

	public ContactUsPage(Pojo pojo){
		this.objPojo=pojo;
	}

	public void userNavigateToContactUsPage() throws Throwable {
		Pojo.getDriver().get("http://automationpractice.com/index.php");
		Pojo.getDriver().manage().window().maximize();
		contactUs=Pojo.getDriver().findElement(By.xpath("//div[@id='contact-link']//a[text()='Contact us']"));
		contactUs.click();
		Thread.sleep(20);
	}
	public void fillTheContactUs(String heading, String emailId,String OrderRefernce,String message) throws Throwable {
		Select select = new Select (Pojo.getDriver().findElement(By.id("id_contact")));
		select.selectByVisibleText(heading);
		Pojo.getDriver().findElement(By.id("email")).sendKeys(emailId);
		Pojo.getDriver().findElement(By.id("id_order")).sendKeys(OrderRefernce);
		Pojo.getDriver().findElement(By.id("message")).sendKeys(message);

	}
public void userClickOnSendButton() throws Throwable {
	WebElement btn_Send=Pojo.getDriver().findElement(By.xpath("//span[text()='Send']"));
	btn_Send.click();
	
	}
public void getMessage(String arg1) throws Throwable {
	Pojo.getDriver().findElement(By.id("email")).getText();
}

}
