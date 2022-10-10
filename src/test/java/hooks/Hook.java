package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import helpers.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.UIConstants;

public class Hook {
	
	
	
	@Before
	public void initDriver() throws Exception {
		WebDriverFactory.getDriver();
	}
	
	
	
	@AfterStep
	public void ScreenShot(Scenario scenario) throws WebDriverException, Exception {
		  final byte[] screenshots = ((TakesScreenshot)WebDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		  scenario.attach(screenshots, "image/png", "image");
	}
	
	
	@After
	public void tearDown() throws Exception {
		WebDriverFactory.getDriver().close();
	}

}
