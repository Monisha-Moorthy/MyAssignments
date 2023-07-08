package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4dCheckBox {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
			// Step 3: Load the URL https://www.leafground.com/radio.xhtml
			 driver.get("https://www.leafground.com/checkbox.xhtml");
			// Step 4: Maximise the window
			 driver.manage().window().maximize();
			// Step 5: Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Basic Checkbox
			driver.findElement(By.xpath("(//span[contains(text(),'Basic')]/preceding-sibling::div)[2]")).click();
			//notification
			driver.findElement(By.xpath("(//span[contains(text(),'Ajax')]/preceding-sibling::div)[2]")).click();
			//Choose Your fav ;anguage
			driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ')])[3]")).click();
			//toggle
			driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch ')]")).click();
			//Verify if check box is disabled
			System.out.println(driver.findElement(By.xpath("(//span[text()='Disabled']/ancestor::div)[2]")).isEnabled());
			//multiple section since we dont have seclect tag we are selecting one by one
			Thread.sleep(2000);
			driver.findElement(By.className("ui-selectcheckboxmenu-trigger")).click();
			driver.findElement(By.xpath("//label[contains(text(),'London')]/preceding-sibling::div")).click();
			driver.findElement(By.xpath("//label[contains(text(),'Barcelona')]/preceding-sibling::div")).click();
			
			driver.close();
			
			
			
			
			
			
	}
}
