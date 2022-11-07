package generic;

import org.openqa.selenium.WebDriver;

public class Pojo {

	private static WebDriver driver;
	private static ExcelReader objExcelReader;

	public static ExcelReader getObjExcelReader() {
		return objExcelReader;
	}

	public static void setObjExcelReader(ExcelReader objExcelReader) {
		Pojo.objExcelReader = objExcelReader;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Pojo.driver = driver;
	}
	
}
