package generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest extends Pojo{
	private WebDriver driver;
	private ExcelReader objExcelReader;



	public WebDriver intializeWebEnvironment(){
		System.out.println("Intialize the browser");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		Pojo.setDriver(driver);
		objExcelReader=new ExcelReader();
		Pojo.setObjExcelReader(objExcelReader);
		return driver;
	}

	public void tearDownWebEnvironment(){
		if (driver != null) {
			driver.quit();
		}
		System.out.println("Quiting the browser");

	}	

}
