package StepDefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFiles",glue={"StepDefination"},
monochrome=true,
plugin={"pretty","html:target/HTMLReports"})
//plugin={"pretty","html:target/JSONReports/JSONReports"})
//plugin={"pretty","html:target/JUNITeports/JUNITReports"})

public class TestRunner {

}
