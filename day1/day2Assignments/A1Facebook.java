package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1Facebook {
	public static void main(String[] args) throws InterruptedException {
		//Assignment:1
		//FaceBook:
		//================================
		// Step 2: Launch the chromebrowser
		 ChromeDriver driver=new ChromeDriver();
		 
		// Step 3: Load the URL https://en-gb.facebook.com/
		 driver.get("https://en-gb.facebook.com/");
		 
		// Step 4: Maximise the window
		 driver.manage().window().maximize();
		 
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("(//a[contains(text(),'Forgotten')]/following::a)[1]")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Monisha");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Joy");
		
		// Step 9: Enter the mobile number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080868540");
		
		// Step 10: Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("saibaba");
		
		// Step 11: Handle all the three drop downs
		WebElement DD=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select opt = new Select(DD);
		opt.selectByVisibleText("17");
		
		WebElement DD1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select opt1 = new Select(DD1);
		opt1.selectByIndex(3);
		
		WebElement DD2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select opt2 = new Select(DD2);
		opt2.selectByVisibleText("1999");
		
		
		// Step 12: Select the radio button "Female" 
		         //   ( A normal click will do for this step)
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		driver.close();
		
	}
	

}
