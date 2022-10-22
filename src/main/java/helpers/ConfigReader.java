package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigReader {

	public static void main(String[] args) throws FileNotFoundException {

		Properties prop = new Properties();
		FileInputStream inputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/test/resources/config.properties"));

		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		
	}

}
