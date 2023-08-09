package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class WelcomePage02 extends BaseClass{
	
	public WelcomePage02 verifyHomePage() {

		String title = driver.getTitle();
		System.out.println(title);

		if (title.contentEquals(title)) {
			System.out.println("TITLE VERIFIED");
		}

		return this;
	
	}
	
	
	
	public MyHomePage03 clickCRMSFALink() {
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		MyHomePage03 hm=new MyHomePage03();
//		return hm;
		return new MyHomePage03();
	
	}

}
