package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {


	WebDriver driver=null;
	@Given("^browser is open$")
	public void browser_is_open() {
		System.out.println("Browser is open");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is :"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver","D:/eMS 23 Sept/BDD_Cucumber_Test/src/test/resources/drivers/chromedriver.exe");
		//Absulute path D:\eMS 23 Sept\BDD_Cucumber_Test\src\test\resources\drivers\chromedriver.exe
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("^user is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
		System.out.println("User is on google search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("^user enters text in serch box$")
	public void user_enters_text_in_serch_box() throws Throwable {
		System.out.println("User enters text in search box");
		driver.findElement(By.name("q")).sendKeys("Verve Square Technology");
	}

	@When("^hits enter$")
	public void hits_enter() throws Throwable {
		System.out.println("User hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("^user is navigated to serched result$")
	public void user_is_navigated_to_serched_result() throws Throwable {
		System.out.println("User naviagted to searched result");
		driver.getPageSource().contains("Jobs");
		driver.close();
		driver.quit();
	}
}
