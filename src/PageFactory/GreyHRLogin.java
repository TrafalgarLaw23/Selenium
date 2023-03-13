package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreyHRLogin {
	
	WebDriver driver;
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement Login;
	
	@FindBy(xpath = "//label[contains(text(),'Login ID')]")
	WebElement TitleText;
	
	public GreyHRLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void setUsername(String strUser) {
		Username.sendKeys(strUser);		
	}
	
	public void setPassword(String strPassword) {
		Password.sendKeys(strPassword);	
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public String getLoginTitle(){
		 return	TitleText.getText();
		}
	
	public void loginPage(String strUser, String strPassword) {
		this.setUsername(strUser);
		this.setPassword(strPassword);
		this.clickLogin();		
		
	}
}

