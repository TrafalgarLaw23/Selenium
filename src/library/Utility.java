package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

///// refer Code Screenshot_SemiAutomatic

public class Utility {

		//public void capturescreenshot(WebDriver driver) throws IOException {

	// we passed webdriver parameter
	
		public static void capturescreenshot(WebDriver driver) throws IOException {
			
		TakesScreenshot ts = (TakesScreenshot) driver; // it will show error
														// bcoz not getting 
														// driver so we
														// parameterized
														// driver in method
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("./screenshot/facebooklogin.png"));
		System.out.println("screenshot taken");

	}
}
