package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(
		
		features = {"src/test/resources/Features/Login.feature"},
		glue = {"testSteps","hooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:reports/cucumberReport.html", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
