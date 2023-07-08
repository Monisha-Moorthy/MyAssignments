package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2bDeleteLead {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
		//2	Enter the username and pwd
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
		//8	Click on Phone
		    driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]/parent::li")).click();
		//9	Enter phone number
		    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");  
		//10	Click find leads button
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click(); 
		//11	Capture lead ID of First Resulting lead
		    Thread.sleep(2000);
		  System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).getText());  
		//12	Click First Resulting lead
		    driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click(); 
		//13	Click Delete
		    driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//14	Click Find leads
		    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//15	Enter captured lead ID
		    Thread.sleep(3000);
		  System.out.println(driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText());  
		//16	Click find leads button
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click(); 
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	System.out.println("message" + driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
		//18	Close the browser (Do not log out)
		    driver.close();
	}

}
