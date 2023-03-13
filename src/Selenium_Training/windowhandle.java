package Selenium_Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14506215\\eclipse-workspace\\Tools\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();

		driver.findElement(By.linkText("Services")).click();
		
		Thread.sleep(2000);
		
		Set<String> MultipleTabs = driver.getWindowHandles();
		
		System.out.println(MultipleTabs.size());
		
		//for each loop
		for (String i : MultipleTabs) {
			
			if (!i.equals(parent)) {
				driver.switchTo().window(i); // driver focusing or switching to child window
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
			}

		}
		driver.switchTo().window(parent); // driver back to parent winow
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();
	}

}
