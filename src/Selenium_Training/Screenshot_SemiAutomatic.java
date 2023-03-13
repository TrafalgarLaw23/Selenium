package Selenium_Training;

import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import library.Utility;

public class Screenshot_SemiAutomatic {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prafull");

		/*
		 * Utility obj = new Utility(); obj.capturescreenshot(driver);
		 */

		Utility.capturescreenshot(driver);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");

		Utility.capturescreenshot(driver);

		driver.quit();

	}

}
