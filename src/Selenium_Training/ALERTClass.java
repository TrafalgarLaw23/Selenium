package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ALERTClass {

	@Test
	public void alertTest() throws Exception  {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/oprs-web/");

		driver.findElement(By.xpath("//button[contains(.,'Search for Bus')]")).click();

		Thread.sleep(2000);

		
		 // First Way
		
		
		/*  Alert al = driver.switchTo().alert();
		  
		  System.out.println(al.getText());
		  
		  al.accept(); // It impose on positive scenario 
		  
		  //al.dismiss(); // It impose on negative scenario 
		  
		  driver.quit();
		 */

		///////////////////////////////////////////////////////////

		// Second Way with assert alert message //most recommended way
		

		String actual_msg = driver.switchTo().alert().getText();

		System.out.println("Actual Message is:" + actual_msg);

		driver.switchTo().alert().accept();

		String expected_msg = "Please select start place.";
		
		Assert.assertEquals(actual_msg, expected_msg);

		driver.quit();
	}

}