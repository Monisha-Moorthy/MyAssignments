package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4bButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		// Step 3: Load the URL https://www.leafground.com/button.xhtml
		 driver.get("https://www.leafground.com/button.xhtml");
		// Step 4: Maximise the window
		 driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		 driver.get("https://www.leafground.com/button.xhtml");
		 driver.manage().window().maximize();
		 //Confirm if the button is disabled.
	     System.out.println(driver.findElement(By.xpath("(//button[contains(@class,'ui-button')])[2]")).isEnabled());
	     //Find the position of the Submit butto
	     System.out.println(driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
	     //Find the Save button color
	   WebElement color= driver.findElement(By.xpath("//span[text()='Save']"));
	   String print=color.getCssValue("color");
	   System.out.println(print);
	   //Find the height and width of this button
	   System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
	  
	   
	   driver.close();
	}
	
}
