package Selenium_Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_HardCoded {

	public static void main(String[] args) throws IOException  {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prafull");
				
				TakesScreenshot ts = (TakesScreenshot) driver; // typecasting or
																// interface binding
																// with driver object
				
				
				File Source = ts.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(Source, new File("./screenshot/facebookUsername.png"));
				
				// in above line use method copyFile(File srcfile, File destfile)
				
				System.out.println("screenshot taken");

				driver.quit();
			}
	}
