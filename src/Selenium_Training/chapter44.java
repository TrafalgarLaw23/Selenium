package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter44 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("prafullbarve26@gmail.com");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("xxxxxxx");
		driver.findElement(By.name("login")).click();
		
		driver.quit();
	}

}
