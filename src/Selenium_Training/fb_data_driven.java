package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.ExcelDataConfig_ForString;

public class fb_data_driven {

	public static void main(String[] args) throws Exception {
		
		ExcelDataConfig_ForString obj = new ExcelDataConfig_ForString("C:\\Users\\14506215\\eclipse-workspace\\Tools\\ReadData.xlsx");
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\Study\\TestingStudy\\Testing\\selenium\\Selenium jars\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(obj.getData(0, 6, 0));
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(obj.getData(0, 6, 1));
		driver.findElement(By.name("login")).click();
		
		driver.quit();

		
		
	}

}
