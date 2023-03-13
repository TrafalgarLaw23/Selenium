package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter42 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prafullbarve26@gmail.com");

		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();

	}

}
