package Selenium_Training;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@Test
	public void FB()
	{
		System.out.println("(Test1)FB");
	}
	
	@Test
	public void Amazon()
	{
		System.out.println("(Test2)Amazon");
	}
	
	@Test
	public void Flipkart()
	{
		System.out.println("(Test3)Flipkart");
	}
	
	@Test
	public void Google()
	{
		System.out.println("(Test4)Google");
	}
	
	
	@Test
	public void Decathalon()
	{
		System.out.println("(Test5)Decathalon");
	}
	
	
	@BeforeMethod
	public void BrowserOpen()
	{
		System.out.println("(BeforeMethod)This method will execute before each test case ");
	}
	
	
	@AfterMethod
	public void BrowserQuit()
	{
		System.out.println("(AfterMethod)This method will execute after each test case");
	}
	
	@BeforeTest
	public void  CacheClear()
	{
		System.out.println("(BeforeTest)This block will execute before all test cases");
	}
	
	@AfterTest
	public void CacheReload()
	{
		System.out.println("(AfterTest)This block will executes after all test cases");
	}
	
	
}
