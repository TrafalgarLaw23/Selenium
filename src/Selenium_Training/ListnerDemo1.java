package Selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//syntax
//@Listeners(PKG_Name.ClassName.class)

@Listeners(Selenium_Training.TestNG_Listener_Library.class)

public class ListnerDemo1 {
	@Test (priority =1)
	public void googletitleverify() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		String expected_title = "Google"; 
		
		Assert.assertEquals(driver.getTitle(), expected_title);
		
		driver.quit();
	}

	@Test  (priority =2)
	public void Titlematch() {
		
		System.out.println("Dumy");
		
		//Assert.assertTrue(false);
		
		Assert.assertTrue(true);

	}
}
