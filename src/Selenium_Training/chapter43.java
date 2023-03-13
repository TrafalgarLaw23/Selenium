package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chapter43 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("prafull@gmail.com");
		
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("pass")).sendKeys("jhvhvk");
		
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
	}

}
