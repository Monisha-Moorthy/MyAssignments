package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4cSelect {
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
			// Step 3: Load the URL https://www.leafground.com/select.xhtml
			 driver.get("https://www.leafground.com/select.xhtml");
			// Step 4: Maximise the window
			 driver.manage().window().maximize();
			// Step 5: Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Which is your favorite UI Automation tool?
			WebElement opt=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
			Select res=new Select(opt);
			res.selectByIndex(1);
		//Choose your preferred country.(since we dont have select tag we are not using select class to click options)
			driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu-trigger')])[1]")).click();
			driver.findElement(By.xpath("//li[text()='India']")).click();
		//Confirm Cities belongs to Country is loaded
			driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu-trigger')])[2]")).click();
			driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//Choose the Course
			driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
			driver.findElement(By.xpath("//li[text()='Appium']")).click();
		//Choose language randomly
			driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle-1-s')])[4]")).click();
			driver.findElement(By.xpath("//li[text()='English']")).click();
		//Select 'Two' irrespective of the language chosen
			driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle-1-s')])[5]")).click();
			driver.findElement(By.xpath("//li[text()='Two']")).click();
			
			//driver.close


			
	}

}
