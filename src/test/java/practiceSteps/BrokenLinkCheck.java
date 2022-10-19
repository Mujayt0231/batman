package practiceSteps;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BrokenLinkCheck {

	@Test(enabled = false)
	public void borkenLink() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> elems = driver.findElements(By.xpath("//a[@class='pHiOh']"));
		for (WebElement webElement : elems) {

			String url = webElement.getAttribute("href");
			URL u = new URL(url);
			HttpURLConnection urlConnection = (HttpURLConnection) u.openConnection();

			urlConnection.connect();
			int statusCode = urlConnection.getResponseCode();
			System.out.println("current Url: " + url + ", status code is ==> " + statusCode);

		}

	}

	@Test
	public void tables() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> webElems = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int lastRow = webElems.size();
		
	    List<WebElement> lastRowData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + lastRow + "]/td"));
	    
	    for (WebElement webElement : lastRowData) {
			System.out.println(webElement.getText());
		}
//		for(int i = lastRow - 1; i >= 0; i--) {
//			System.out.println(webElems.get(i).getText());
//			break;
//		}
	    
		driver.close();
		
		

	}

}
