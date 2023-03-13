 package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Upload
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///F://Selenium_Automation//Tools//AUTO_IT//Upload_path.html");
		
		//driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000L);
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		
		/*Actions AC = new Actions(driver);
		
		AC.moveToElement(ele);*/
		
		//Thread.sleep(2000L);
		
		ele.sendKeys("F:\\Selenium_Automation\\Tools\\AUTO_IT\\New_Text_Document.txt");
		
		driver.quit();
	}
}
