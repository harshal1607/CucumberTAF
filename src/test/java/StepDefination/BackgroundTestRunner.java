package StepDefination;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFiles/BackgroundDemo.feature",glue={"StepDefination"},
monochrome=true,tags={"@BackgroundTest"},dryRun=false,
plugin={"pretty","html:target/HTMLReports"})



public class BackgroundTestRunner {

}
