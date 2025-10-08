package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Features/Login.feature",
glue={"stepdefintions"},
plugin={"pretty","html:target/cucumber-reports.html",
		"junit:target/reportJunit.xml",
		"json:target/reportJson.json"
},
monochrome = true
)

public class RunnerFlightSearch {

}
