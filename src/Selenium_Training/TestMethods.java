package Selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Selenium_Training.TestNG_Listener_Library.class)

public class TestMethods extends BaseTest 
{
		@BeforeMethod
		public static void browseropening()
		{
			BaseTest.BaseMethod();
		}
	
		//@BeforeTest
		public static void browseropen()
		{
			BaseTest.BaseMethod();
		}
	 
		@Test (priority=2)
     	public static void googleverification()
     	{
			 driver.get("https://www.google.co.in/?gws_rd=ssl");
			 System.out.println(driver.getTitle());
     	}
		
		@Test (priority=3)   
		public static void facebook()
		{
			 driver.get("https://www.facebook.com/");
			 System.out.println(driver.getTitle());
			 
		}
		
		@Test (priority=1)
		public static void flipkart()
		{
			 driver.get("https://www.flipkart.com/");
			 System.out.println(driver.getTitle());
		}
		
		@Test (priority=4)
		public static void Amazon()
		{
			driver.get("http://www.amazon.in/");
			System.out.println(driver.getTitle());
		}
		
		@AfterMethod
		public static void browserclosing()
		{
			 driver.quit();
		}
		
		
		//@AfterTest
		public static void quit()
		{
			 driver.quit();
		}
}
