package Selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chapter34 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}
}
