package StepDefination;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFiles/AutomationPractice.feature",glue={"StepDefination"},
monochrome=true,tags={"@RadioTest"},dryRun=false,strict=true,snippets=SnippetType.UNDERSCORE,

//snippets=SnippetType.CAMELCASE,
//tags={"@RadioTest","~@DropdownTest"}
//plugin={"pretty","html:target/HTMLReports"})
plugin= {"json:target/BDD-Report/cucumber.json", "pretty", "html:target/BDD-Report/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter:target/BDD-Report/HTML-DashboardReport.html"})

public class AutomationPracticeTestRunner {

}
