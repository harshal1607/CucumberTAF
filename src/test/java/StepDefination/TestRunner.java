package StepDefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFiles",glue={"StepDefination"},
monochrome = true, dryRun = false, tags = "@RadioTest", strict = true, plugin = {
		/*"html:target/HTMLRepsort"*/ "json:target/BDD-Report/cucumber.json", "pretty", "html:target/BDD-Report/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter:target/BDD-Report/HTML-DashboardReport.html"}
)
public class TestRunner {

}
