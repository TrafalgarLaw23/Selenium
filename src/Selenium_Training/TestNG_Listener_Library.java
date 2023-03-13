package Selenium_Training;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Used this library in ListnerDemo1 Class

public class TestNG_Listener_Library implements ITestListener 
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test cases start" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test cases Success" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test cases Failed" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test cases Skipped" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
