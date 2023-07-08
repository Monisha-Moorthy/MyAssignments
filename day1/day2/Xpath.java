package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//Enter username
		WebElement eleprogram=driver.findElement(By.xpath ("//input[@id='username']"));  // using variable we can't contue with other methods eg sendkeys 
		eleprogram.sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.close();
		
		//ELder cousin to younger cousin 
		driver.findElement(By.xpath("(//span[@class='requiredField']/following::input)[1]")).sendKeys("Joy");
		driver.findElement(By.xpath("(//span[text()='Number Of Employees']/following::input)[1]")).sendKeys("Joy");
		
	}
}
