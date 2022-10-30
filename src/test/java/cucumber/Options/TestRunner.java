package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue = {"stepDefinations"}, publish = true, tags = "@regression",plugin = {
		"pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json", "rerun:target/rerun.txt",
        "junit:target/junit-report.xml", "testng:target/testng-output.xml","html:target/cucumber-reports.html" }, monochrome = true )
public class TestRunner {

}
