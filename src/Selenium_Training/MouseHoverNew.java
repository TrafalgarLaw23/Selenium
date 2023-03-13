package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseHoverNew {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.carmax.com/");
		
		WebElement element = driver.findElement(By.xpath("//button[@id='header-helpful-links-button']"));
		
		  Actions action = new Actions(driver); //typecasting// driver binding with Actions class
		  
		  action.moveToElement(element).build().perform();
		 
		
		Thread.sleep(2000);
		
		WebElement subElement = driver.findElement(By.xpath("//a[contains(.,'Why CarMax')]"));
		
		subElement.click();
		
		// if you have sub element for car max link then use below four lines

		/*action.moveToElement(subElement).build().perform();
	
		WebElement sub_child_Element = driver.findElement(By.xpath("//a[contains(.,'help')]"));
		
		// to click on hold on sub element value
		action.moveToElement(sub_sub_Element).click().build().perform();
		
		//or
		
		action.moveToElement(sub_sub_Element).click();*/

		driver.quit();
	}

}