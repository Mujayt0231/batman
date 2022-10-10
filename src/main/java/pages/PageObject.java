package pages;


import helpers.WebDriverFactory;

public class PageObject {
	
	public static HomePage getHomePage() throws Exception {
		return new HomePage(WebDriverFactory.getDriver());
	}
	
	
	public static SignInPage getSignInPage() throws Exception {
		return new SignInPage(WebDriverFactory.getDriver());
	}

}
