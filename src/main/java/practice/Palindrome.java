package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Palindrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[normalize-space(text())='New Browser Tab']")).click();

		String currentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> windows = windowHandles.iterator();

		while (windows.hasNext()) {

			String child_window = windows.next();
			if (!currentWindow.equals(child_window)) {
				driver.switchTo().window(child_window);
				break;
			}

		}

		driver.findElement(By.xpath("//a[normalize-space(text())='New Browser Tab']")).click();
	}

}
