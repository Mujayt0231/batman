package practiceSteps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GlobalSQA {
	
	
	@Test(enabled = false)
	
	public void tabsTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.findElement(By.xpath("//a[text()='Tabs']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		driver.findElement(By.cssSelector("#ui-id-1")).click();
		driver.findElement(By.cssSelector("#ui-id-3")).click();
		driver.findElement(By.cssSelector("#ui-id-3")).click();
		driver.close();
		driver.quit();
		
		
	}
	
	
}
