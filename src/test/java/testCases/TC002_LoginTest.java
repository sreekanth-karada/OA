
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity", "Master"})
	public void verify_Login() throws InterruptedException 
	{
		logger.info("*** Starting TC002_LoginTest ****");
		
		try
		{
			
		//HomePage
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		Thread.sleep(3000);
		hp.clickLogin();
		Thread.sleep(3000);
		 
		//Login page
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		Thread.sleep(3000);
		lp.setPassword(p.getProperty("password"));
		Thread.sleep(3000);
		lp.setClick();
		Thread.sleep(3000);
		
		//MyAccount
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetPage=mp.isMyAccountPageExists();
		
		Assert.assertEquals(targetPage,true,"Login failed");
		Assert.assertTrue(targetPage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*** Finished TC002_LoginTest *****");
		
	}

}
