package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.GreyHRLogin; 

public class TestGreyHRLogin {
	
	static WebDriver driver;
	static GreyHRLogin objlogin;
	
	@BeforeTest
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://enel.greythr.com/uas/portal/auth/login");
		driver.manage().window().maximize();
}
	@Test
	public static void login() {		
		objlogin = new GreyHRLogin(driver);
		String LoginTitle= objlogin.getLoginTitle();
		Assert.assertEquals(LoginTitle, "Login ID");
		objlogin.loginPage("T00010", "J@son230990");
		
		
	}
}
