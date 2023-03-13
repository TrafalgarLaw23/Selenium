package Selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Library Class for TestMethods

public class BaseTest {
	public static WebDriver driver = null;

	public static void BaseMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		 driver = new ChromeDriver();
	}
	

}
