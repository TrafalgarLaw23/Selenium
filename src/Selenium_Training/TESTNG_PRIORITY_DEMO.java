package Selenium_Training;

import org.testng.annotations.Test;

public class TESTNG_PRIORITY_DEMO {
	
	
	@Test (priority = 4, description = "Adding product into the cart")
	public void AddToCart()
	{
		System.out.println("It will Run fourth");
	}
	
	@Test (priority = 1, description = "Browser Opening done")
	public void BrowserOpening()
	{
		System.out.println("It will Run First");
	}
	
	@Test (priority = 2, description = "Login to the Flipkart" )
	public void Login()
	{
		System.out.println("It will Run Second");
	}
	
	@Test (priority = 3, description = "Searched shoes")
	public void SearchProduct()
	{
		System.out.println("It will Run third");
	}
	
	@Test (priority = 6, description = "order confirmed")
	public void OrderConfirmation()
	{
		System.out.println("It will Run fifth");
	}
	
	@Test (priority = 5, description = "payment done")
	public void PaymentGateway()
	{
		System.out.println("It will Run Sixth");
	}
	
	@Test (priority = 7, description = "Logout succefully")
	public void Logout()
	{
		System.out.println("It will Run Seventh");
	}

}
