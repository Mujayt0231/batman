package helpers;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

	public static String browserName = "chrome";

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	public static WebDriver getDriver() throws Exception {

		WebDriver driver = null;

			if (browserName.equalsIgnoreCase("chrome")) {
				driver = drivers.get(browserName);
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
					driver = new ChromeDriver();
					drivers.put("chrome", driver);
				}
			}
			
			else throw new Exception("check browser name");

		return driver;
	}

}
