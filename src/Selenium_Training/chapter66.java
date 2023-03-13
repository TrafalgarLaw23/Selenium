package Selenium_Training;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter66 {
	
	//How to handle radiobuttons

	public static void main(String args []) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "F:/Selenium_Automation/Tools/geckodriver-v0.32.0-win64/geckodriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
		
		driver.findElements(By.xpath("//input[@type='radio']"));
		
		List <WebElement> radiobuttons =driver.findElements(By.xpath("//input[@type='radio']"));
		
		//on above line list can be import only using Java Util
		
		System.out.println(radiobuttons.size());
		
		radiobuttons.get(0).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	

}
