package testSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import helpers.WebDriverFactory;
import io.cucumber.java.en.*;
import pages.PageObject;

public class SignInSteps_store {

	WebDriverWait wait;
	WebDriver driver;

	@Given("user is on home page")
	public void user_is_on_home_page() throws Exception {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
		driver = WebDriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://automationpractice.com/index.php");

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php";

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));

		Assert.assertEquals(currentUrl, expectedUrl);
		

	}

	@When("user click sign in button in dashboard")
	public void user_click_sign_in_or_join_button_in_dashboard() throws Exception {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='login']")));
		PageObject.getHomePage().loginButton();
	}
	
	

	@Then("user navigated to sign in page")
	public void user_navigated_to_sign_in_page() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.urlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account"));

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

		Assert.assertEquals(currentUrl, expectedUrl);
	}

	@And("user enter {string} as email and {string} as password")
	public void user_enter_as_email_and_as_password(String email, String password) throws Exception {

		PageObject.getSignInPage().enterEmail_Password(email, password);
//		signIn = new SignInPage(driver);
//		signIn.enterEmail_Password(email, password);
	}

	@Then("user click sign in button")
	public void user_click_sign_in_button() throws Exception {
		PageObject.getSignInPage().clickSubmit_button();
	}

	@Then("user should be able to sign in")
	public void user_should_be_able_to_sign_in() {

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(currentUrl, expectedUrl);
	}

}
