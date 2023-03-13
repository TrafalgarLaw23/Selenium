package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Handle {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.32.0-win64\\geckodriver.exe");*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //upcasting runtime polymorphism
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='RememberMe']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected());
		
		driver.quit();
		
	}

}
