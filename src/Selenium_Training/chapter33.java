
package Selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter33 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\14506215\\eclipse-workspace\\Tools\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); // Java Upcasting & Runtime
												// Polymorphism
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
