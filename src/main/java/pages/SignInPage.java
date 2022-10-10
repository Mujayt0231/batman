package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement passwordInput;
	
	@FindBy(css = "#SubmitLogin")
	WebElement submitButton;
	
	public void enterEmail_Password(String email, String password){
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
	}
	
	
	public void clickSubmit_button() {
		submitButton.click();
	}
	
	
	
	

}
