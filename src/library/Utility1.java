package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//// we pass parameter string screenshotname in capturescreenshot method  
/// refer Screenshot_FullyAutomatic program
//// bcoz of parameterization we will get new screenshots otherwise screenshot will overwrite

public class Utility1 {

	public static void capturescreenshot(WebDriver driver, String screenshotname) throws IOException // we
																										// passed
																										// webdriver
																										// parameter
	{
		TakesScreenshot ts = (TakesScreenshot) driver; // it will show error
														// bcoz not getting
														// driver so we
														// parameterized driver
														// in method
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("./screenshot/" + screenshotname + ".png"));
		System.out.println("scrrenshot taken");
	}

}
