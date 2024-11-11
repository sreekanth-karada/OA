package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtfirname;
@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtlaname;


@FindBy(xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtphone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtpwd;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtconpwd;

@FindBy(xpath="//input[@name='agree']")
WebElement chpolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btcontinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgconfig;


public void setFirstname(String fname)
{
	txtfirname.sendKeys(fname);
}
public void setLatname(String lname)
{
	txtlaname.sendKeys(lname);
}
public void setEmail(String email)
{
	txtemail.sendKeys(email);
}

public void setPhone(String phone)
{
	txtphone.sendKeys(phone);
}

public void setPassword(String pwd )
{
	txtconpwd.sendKeys(pwd);
}
public void setConPassword(String pwd )
{
	txtpwd.sendKeys(pwd);
}
 

public void setPolicy()
{
	chpolicy.click();
}
public void clickContinue()
{
	btcontinue.click(); 
}


public String getConfirMsg()
{
	try {
		return (msgconfig.getText());
	}
	catch (Exception e)
	{
		return (e.getMessage());
	}
}


}
