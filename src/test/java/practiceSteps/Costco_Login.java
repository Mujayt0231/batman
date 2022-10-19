package practiceSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Costco_Login {
	
	
	
	@Test(enabled = false)
	public void LoginWithValidCred() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.costco.com/");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
//		WebElement signIn_button  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='header_sign_in']")));
		WebElement signIn_button = waitForElementToPresent(By.xpath("//a[@id='header_sign_in']"), driver, 5);
		signIn_button.click();
		
//		WebElement emailAddress_inputBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='signInName']")));
		WebElement emailAddress_inputBox = waitForElementToPresent(By.xpath("//input[@id='signInName']"), driver, 5);
		emailAddress_inputBox.sendKeys("Mujiayitiabdu@gmail.com");
		
		WebElement password_inputBox = waitForElementToPresent(By.xpath("//input[@id='password']"), driver, 5);
		password_inputBox.sendKeys("Mm0231321..!");
		
		WebElement signIn_button_signInPage = waitForElementToPresent(By.xpath("//button[@id='next']"), driver, 5);
		signIn_button_signInPage.click();
		
		driver.close();
		
	}
	
	
	
	public static WebElement waitForElementToPresent(By elementPath, WebDriver driver, int time) {
		
		WebDriverWait wait = getWait(driver, Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.presenceOfElementLocated(elementPath));
		
	}
	
	public static WebDriverWait getWait(WebDriver driver, Duration ofSeconds) {
		
		return new WebDriverWait(driver, ofSeconds);
	}
	
	
	

}
