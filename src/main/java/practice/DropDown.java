package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.way2automation.com/way2auto_jquery/dropdown.php#load_box");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//select/option"));
		for (WebElement webElement : elements) {
			if(webElement.getText().equalsIgnoreCase("Austria")) {
				webElement.click();
				break;
			}
		}
		
		
	}

}
