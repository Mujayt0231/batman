package practiceSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AAPC_HomePage {
	
	WebDriver driver;
	
	@BeforeClass
	public void initializingTheSystem() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
	}
	

	
	@Test
	public void checkCulture() {
		driver = new ChromeDriver();
		driver.get("https://www.aapc.com/");
		driver.findElement(By.xpath("//a[normalize-space(text())='About Us']")).click();
		driver.findElement(By.xpath("//a[@target]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://www.aapc.com/careers-benefits']")));
		driver.findElement(By.xpath("//a[@href='https://www.aapc.com/careers-benefits']")).click();
		String message = driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(message.toLowerCase(), "Page Not Found".toLowerCase());
		System.out.println(message);
		
	}

}
