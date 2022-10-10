package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	static WebDriver driver;
	
	
	
	
	
	@Test(groups = {"heroku"})
	@Parameters({"url","browser","Browser"})
	public void openHeroku(String url,String browser,String Browser) {
		
		System.out.println("this is the parameterized browser ==> " + Browser);
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
			
		System.out.println("this is heroku");
		
		
		driver.get(url);
		driver.close();
		
	}
	
	
	
	@Test(groups = {"google"})
	@Parameters({"googleUrl"})
	public void openGoogle(String url) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("this is google");
		
		driver.get(url);
		driver.close();
		
	}

}
