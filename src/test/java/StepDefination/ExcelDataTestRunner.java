package StepDefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFiles/ExcelData.feature",glue={"StepDefination"},
monochrome=true,tags={"@ExcelDataTest"},dryRun=true,
plugin={"pretty","html:target/HTMLReports"})



public class ExcelDataTestRunner {

}
