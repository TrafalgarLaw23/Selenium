package Selenium_Training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import library.Utility1;

public class Screenshot_FullyAutomatic {
	public static void main(String[] args) throws IOException, InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Utility1.capturescreenshot(driver, "Facebook homepage screenshot"); // imp

		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("prafull");

		// if we use utility library
		// here we do parameterization bcoz we will never capture same
		// screenshot facebooklogin.png
		// check utilty library everytime screenshot name is fcebooklogin.png so
		// that will
		/// override previous screenshot
		// so we will do parameterization for multiple screenshot

		// we will create another utility1 library check Utility1.java library

		// we use here utility1 class from  library
		
		Utility1.capturescreenshot(driver, "user name screenshot"); // u can
																	// give any
																	// name in// ""
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		
		Utility1.capturescreenshot(driver, "password screenshot");
		
		Thread.sleep(5000L);
		driver.quit();

	}

}
