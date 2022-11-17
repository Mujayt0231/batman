package practiceSteps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AAPC_HomePage {
	
	WebDriver driver;
	
	@BeforeTest
	public void initializingTheSystem() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		
	}
	

	
	@Test(enabled = false)
	public void checkCulture() {
		driver.findElement(By.xpath("//a[normalize-space(text())='About Us']")).click();
		driver.findElement(By.xpath("//a[@target]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://www.aapc.com/careers-benefits']")));
		driver.findElement(By.xpath("//a[@href='https://www.aapc.com/careers-benefits']")).click();
		String message = driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(message.toLowerCase(), "Page Not Found".toLowerCase());
		System.out.println(message);
	}
	
	@Test(enabled = true)
	public void checkResources() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.aapc.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='tm-110']")));
		driver.findElement(By.xpath("//a[@id='tm-110']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='tm-144']")));
		driver.findElement(By.xpath("//a[@id='tm-144']")).click();
		String alert = driver.findElement(By.xpath("//strong[contains(text(),'AAPC member')]")).getText();
		if(alert.contains("The page you are trying to access requires you to log in")) {
			System.out.println("Accepted");
		}
		else throw new Exception("Content is wrong");
		
		driver.findElement(By.cssSelector("#ctl00_Body_UserName")).sendKeys("Username");
		driver.findElement(By.cssSelector("#ctl00_Body_Password")).sendKeys("password");
		
	}
	
	

}
