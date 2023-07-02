package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A3DuplicateLead {
	public static void main(String[] args) {
		
		
		
		//Launch URL "http://leaftaps.com/opentaps/control/login"
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
			    driver.manage().window().maximize();
			    //Enter UserName and Password Using Id Locator
			    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    //Click on Login Button using Class Locator
			    driver.findElement(By.className("decorativeSubmit")).click();
			    //Click on CRM/SFA Link
			    driver.findElement(By.partialLinkText("SFA")).click();
			   // Click on Leads Button
			    driver.findElement(By.linkText("Leads")).click();
			   // Click on Create Lead 
				driver.findElement(By.linkText("Create Lead")).click();
				//Enter CompanyName Field Using id Locator
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("motors");
				//Enter FirstName Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("moni");
				//Enter LastName Field Using id Locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("joy");
				//Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("joy");
				//Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("joy");
				//Enter Description Field Using any Locator of your choice 
				driver.findElement(By.id("createLeadForm_description")).sendKeys("joy");
				//Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("moni@gmaol.com");
				//Select State/Province as NewYork Using Visible Text
				WebElement opt=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select n=new Select(opt);
				n.selectByVisibleText("New York");
				//Click on Create Button
				driver.findElement(By.className("smallSubmit")).click();
		/////////////////////////////////////////////////////////////////////////////////////////		
			   // Assignment 3:Duplicate Lead

              //  16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
				System.out.println("title:" +driver.getTitle());
              //  17. Click on Duplicate button
				driver.findElement(By.linkText("Duplicate Lead")).click();
              //  18. Clear the CompanyName Field using .clear() And Enter new CompanyName
				driver.findElement(By.id("createLeadForm_companyName")).clear();
              //  19.Clear the FirstName Field using .clear() And Enter new FirstName
				driver.findElement(By.id("createLeadForm_firstName")).clear();
             //   20.Click on Create Lead Button
				driver.findElement(By.className("smallSubmit")).click();
             //   21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()*/
				String title=driver.getTitle();
				System.out.println(title);
				//close
				driver.close();
						
	}

}
