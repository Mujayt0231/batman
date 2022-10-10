package testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import helpers.WebDriverFactory;
import io.cucumber.java.en.*;

public class CheckoutSteps_store {
	
	WebDriver driver;
	
	
	@When("user click T-SHIRTS in my account page")
	public void user_click_t_shirts_in_my_account_page() throws Exception {
		driver = WebDriverFactory.getDriver();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click();
	}
	
	
	@Then("user should navigated to T-SHIRTS page")
	public void user_should_navigated_to_t_shirts_page() {
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?id_category=5&controller=category";
		
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}

	@Then("user click Faded Short Sleeve T-Shirts")
	public void user_click_faded_short_sleeve_t_shirts() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	
	}

	@Then("user proceed to checkout")
	public void user_proceed_to_checkout() {
		
		
		
	}


}
