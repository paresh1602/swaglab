package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features/VtigerLogin.feature" }, // feature file folder name
		glue = { "stepdefinitions" }, // step definition package name
		plugin = { "html:target/My/cucumber-html-report" }, // reporting
		tags = "@tag1", monochrome = true, dryRun = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
