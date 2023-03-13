package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Name_Selector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.className("inputtext _55r1 _6luy")).clear();
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("prafullbarve26@gmail.com");
		driver.findElement(By.className("_6luy _55r1 _1kbt _9nyh")).clear();
		driver.findElement(By.className("_6luy _55r1 _1kbt _9nyh")).sendKeys("xxxxxxx");
		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		driver.quit();
	}

}
