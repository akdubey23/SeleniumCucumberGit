package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//Run this script for Happy flow
@CucumberOptions(
		features="features",
		glue={"stepDefination"},
		plugin = {"html:target/cucumber-html-report"}
		)

//Run this script for negative scenarios
//@CucumberOptions(features="negative",glue={"negstepsexection"},plugin = {"html:target/cucumber-html-report"})

public class TestRunner {

}
