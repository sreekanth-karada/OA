package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	

	@Test(groups= {"Regression","Master"})
	public void verify_account_registration() throws InterruptedException
	{
		
		logger.info("***** Starting TC001_AccountRegistrationTest *****");
		try
		{
			
		 HomePage hp=new HomePage(driver);
		  hp.clickMyaccount();
		  Thread.sleep(3000);
		  logger.info("Clicked on MyAccount Link..");
		// Thread.sleep(2000);
		 hp.clickRegister();
		 Thread.sleep(3000);
		 logger.info("Clicked on  Register Link..");
		 
		 AccountRegistrationPage ar=new AccountRegistrationPage(driver);
		 logger.info("Providing customers details.");
		 ar.setFirstname(randomeString());
		 Thread.sleep(3000);
		 ar.setLatname(randomeString());
		 Thread.sleep(3000);
		 ar.setEmail(randomeString()+"@gmail.com");	  //randomly generated the mail
		 Thread.sleep(3000);
		 ar.setPhone(randomeNumber());
		 Thread.sleep(3000);
		 
		 String password=randomeAlphaNumberic();
		 Thread.sleep(3000);
		 ar.setPassword(password);
		 Thread.sleep(3000);
		 ar.setConPassword(password);
		 
		 ar.setPolicy();
		 Thread.sleep(3000);
		 ar.clickContinue();
		 Thread.sleep(3000);
		 
		 logger.info("Validating expected message");
		 
		 String conmsg=ar.getConfirMsg();
		 Assert.assertEquals(conmsg,"Your Account Has Been Created!");	 
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
	}
	 
	
	

}
