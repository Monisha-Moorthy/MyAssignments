package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2cDuplicateLead {
	public static void main(String[] args) throws InterruptedException {

		//http://leaftaps.com/opentaps/control/main
 
		//1	Launch the browser
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
		//2	Enter the username
		//3	Enter the password
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
		//8	Click on Email
		    driver.findElement(By.xpath("(//a[@class='x-tab-right'])[3]/parent::li")).click();
		//9	Enter Email
		    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("m");
		//10	Click find leads button
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//11	Capture name of First Resulting lead
		    System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).getText()); 
		//12	Click First Resulting lead
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).click();
		//13	Click Duplicate Lead
		    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//14	Verify the title as 'Duplicate Lead'	   
		   System.out.println(driver.getTitle());
		//15	Click Create Lead
		   driver.findElement(By.className("smallSubmit")).click(); 
		//16	Confirm the duplicated lead name is same as captured name
		   
		//17	Close the browser (Do not log out)
		driver.close();
		
	}

}
