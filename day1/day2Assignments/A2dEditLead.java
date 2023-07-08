package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2dEditLead {
public static void main(String[] args) throws InterruptedException {
	//*http://leaftaps.com/opentaps/control/main
	
	//1	Launch the browser
			ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/login");
		     driver.manage().window().maximize();
			//2	Enter the username
			//3	Enter the password
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		     driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			  //4	Click Login
			    driver.findElement(By.className("decorativeSubmit")).click();
			//5	Click crm/sfa link
			    driver.findElement(By.partialLinkText("SFA")).click();
			//6	Click Leads link
			    driver.findElement(By.xpath("//a[text()='Leads']")).click();
			  //7	Click Find leads
			    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	//* 8	Enter first name
			    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("moni");  
	//* 9	Click Find leads button
			    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	//* 10 Click on first resulting lead
			    driver.findElement(By.xpath("//a[text()='10452']")).click();
	//* 11 Verify title of the page
			    System.out.println(driver.getTitle());
	//* 12 Click Edit
			    driver.findElement(By.xpath("//a[text()='Edit']")).click();    
	//* 13 Change the company name
			    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
			    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("changecompanyname");    
	//* 14 Click Update
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();    
	//* 15 Confirm the changed name appears
			    System.out.println(driver.findElement(By.xpath("(//span[@id='viewLead_companyName_sp'])[1]")).getText());
	//* 16 Close the browser (Do not log out)
			    driver.close();

	
}
}
