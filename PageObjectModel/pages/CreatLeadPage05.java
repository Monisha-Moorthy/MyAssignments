package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class CreatLeadPage05 extends BaseClass{
	
	public CreatLeadPage05 enterCompanyName() {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("tcs");
		return this;
	}
	
	public CreatLeadPage05 enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("moni");
		return this;
	}
	
	public CreatLeadPage05 enterLast() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nisha");
		return this;

	}
	public ViewsLeadsPage06 clickCreatLeadButton() {
		driver.findElement(By.name("submitButton")).click();

		return new  ViewsLeadsPage06();
	}

}
