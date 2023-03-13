package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// scrolling main page
		jse.executeScript("scroll(0,300)");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));
		
		driver.switchTo().frame(iframe);

		// scrolling frame
		jse.executeScript("scroll(0,200)");

		driver.findElement(By.xpath("(//a[contains(.,'Next â�¯')])[1]")).click();

		Thread.sleep(2000);

	/*	// Just to highlight found element
		((JavascriptExecutor) driver).executeScript("arguments[0].style.color='green'",
				driver.findElement(By.xpath("(//a[contains(.,'Next â�¯')])[1]")));*/

		driver.quit();

	}

}
