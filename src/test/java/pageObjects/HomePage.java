package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//li[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement lnklogin;
	
	public void clickMyaccount() throws InterruptedException
	{
		//Thread.sleep(5000);
		lnkMyaccount.click();
	}
	public void clickRegister() throws InterruptedException
	{
		lnkRegister.click(); 
	}
	public void clickLogin() 
	{
		lnklogin.click(); 
	}
	
}
