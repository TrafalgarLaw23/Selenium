package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookaccount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		//driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();

		//WebElement day = driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='day']"));
		
		/*
		 * //How to handle drop down explanation //below is the just explanation
		 * not a code till line number 58
		 * 
		 * WebElement day = driver.findElement(By.xpath(
		 * "//div[@id='reg_form_box']//select[@id='day']"));
		 * 
		 * Select obj1 = new Select(day);
		 * 
		 * // There are three ways to select value from dropdown //*
		 * selectByIndex //* selectByValue //* selectByVisibleText
		 * 
		 * obj1.selectByIndex(10);
		 * 
		 * obj1.selectByValue("3");
		 * 
		 * obj1.selectByVisibleText("Day");
		 * 
		 * // most preferred method is selectByVisibleText
		 * 
		 * obj1.selectByVisibleText("2007");
		 * 
		 * obj1.selectByVisibleText("Mar");
		 */

		// First Way
		
		/*  WebElement Day = driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='day']"));
		  Select obj1 = new Select(Day);
		  obj1.selectByVisibleText("26");
		  
		  WebElement Month = driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='month']")); 
		  Select obj2 = new Select(Month); 
		  obj2.selectByVisibleText("Aug");
		  
		  WebElement Year = driver.findElement(By.xpath( "//div[@id='reg_form_box']//select[@id='year']")); 
		  Select obj3 = new Select(Year); 
		  obj3.selectByVisibleText("1991");
		 
		  Thread.sleep(2000);*/

		// Second Way with less line of code

		/*WebElement Day = driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='day']"));
		WebElement Month = driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='month']"));
		WebElement Year = driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='year']"));
		
		new Select(Day).selectByVisibleText("26");
		new Select(Month).selectByVisibleText("Aug");
		new Select(Year).selectByVisibleText("1989");
		Thread.sleep(2000);*/
		
		
		//Third way to use select value from dropdown 
		
		new Select(driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='day']"))).selectByVisibleText("5");
	
		new Select(driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='month']"))).selectByVisibleText("Aug");
		
		new Select( driver.findElement(By.xpath("//div[@id='reg_form_box']//select[@id='year']"))).selectByVisibleText("1992");
		
		driver.quit();
		

	}

}
