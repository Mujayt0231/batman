package helpers;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	
	private static Logger logger = LogManager.getLogger(SeleniumHelper.class);
	
	public static WebElement waitForElementPresent(WebDriver driver,By by, long timeout) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		WebElement elem = getWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(by));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return elem;
		
	}
	
	
	private static WebDriverWait getWait(WebDriver driver, long timeout) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
	}
	
	
	
	
	
	
		
		
		

}
