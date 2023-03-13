package Selenium_Training;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//////////////////////////  Windowsutils class //////////////////////
/// this class is used to kill open process

/////////////////// we will see how to get cookies & how to delete cookies //////////////

import org.testng.annotations.Test;


public class chapter97 
{
	@Test
	public void killingprocess()
	{
		System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.indiabuyerscredit.com/");
		
		Set<Cookie> cok = driver.manage().getCookies(); // get cookies
		System.out.println(cok.size());                 // get size of cookies means count of cookies
		
		//you can also use Short cut method
		//System.out.println(driver.manage().getCookies().size());
		
		// remove cookies delete cookies
		
		driver.manage().deleteAllCookies();
		//Set<Cookie> cok1 = driver.manage().getCookies(); // get cookies
	}

}
