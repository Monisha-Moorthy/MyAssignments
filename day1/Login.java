package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) {
		
	
	//launch the browser
	ChromeDriver driver=new ChromeDriver();
	//url
	driver.get("https://login.salesforce.com/");
	//maximize the window
	driver.manage().window().maximize();
	//Enter username
	WebElement eleprogram=driver.findElement(By.id("username"));  // using variable we can't contue with other methods eg sendkeys 
	eleprogram.sendKeys("hari.radhakrishnan@qeagle.com");
	
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	WebElement cal= driver.findElement(By.id(""));
	Select org=new Select(cal);
	
	
	}
}
