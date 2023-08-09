package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class MyLeadPage04 extends BaseClass{
	
	public CreatLeadPage05 clickCreateLeadLink() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		 
		 return new CreatLeadPage05();

	}
}
