package runner;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage01;


public class RunnerClass extends BaseClass{
	@Test
	public void login() {
		LoginPage01 login=new LoginPage01();
		login.enterUserName()
			.enterPassword()
			.clickLoginButton()
			.verifyHomePage()
			.clickCRMSFALink()
			.clickLeadsLink()
			.clickCreateLeadLink()
			.enterCompanyName()
			.enterFirstName().enterLast()
			.clickCreatLeadButton()
			.verifyleadpage();
			
		

	}
	
}
