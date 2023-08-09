package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class MyHomePage03 extends BaseClass{
	
	public MyLeadPage04 clickLeadsLink() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Leads")).click();
		 return new MyLeadPage04();
		 
	}
      
}
