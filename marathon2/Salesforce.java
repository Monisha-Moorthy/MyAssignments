package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Salesforce {
	public static void main(String[] args) throws IOException {
		/*Credentials:
			hari.radhakrishnan@qeagle.com
			Leaf@1234*/

			//Testcase-1: Administrator Certifications
			//==============================
			//Add ChromeOptions to handle browser notification

			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(ch);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//	1. Launch Salesforce application https://login.salesforce.com/
			driver.get("https://login.salesforce.com/");
			
		//	2. Login with username as "hari.radhakrishnan@qeagle.com" 
			  //  and password as "Leaf@1234" click login
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
		//	3. Click on Learn More link in Mobile Publisher
			driver.findElement(By.xpath("//span[text()='Learn More']")).click();
			
		//	4. Click confirm on Confirm redirect
			Set<String> windowHandles = driver.getWindowHandles();
			List<String>list=new ArrayList<String>(windowHandles);
			driver.switchTo().window(list.get(1));
			
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			
		//	5. Click Learning (inside shadow root)
			Shadow shad=new Shadow(driver);
			shad.findElementByXPath("//span[text()='Learning']").click();
			
		//	6. And mouse hover on Learning On Trailhead
			Shadow shad1=new Shadow(driver);
			WebElement element = shad1.findElementByXPath("//span[contains(text(),'Learning on Trailhead')]");
			Actions mouseover =new Actions(driver);
			mouseover.moveToElement(element).perform();
			
		//	7. Clilck on Salesforce Certifications
			Shadow shad2=new Shadow(driver);
			WebElement yesSCroll = shad2.findElementByXPath("//a[text()='Salesforce Certification']");
			Actions ysScroll =new Actions(driver);
			ysScroll.scrollToElement(yesSCroll).perform();
			
			shad2.findElementByXPath("//a[text()='Salesforce Certification']").click();
			
			
		//	8. Click on first resulting Ceritificate
			WebElement webElement = driver.findElement(By.xpath("//div[@class='roleMenu-item_text']"));
			Actions ac=new Actions(driver);
			ac.scrollToElement(webElement).perform();
			
			driver.findElement(By.xpath("//div[@class='roleMenu-item_text']")).click();
			
		//	9. verify - Administrator Overview page
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Administrator")) {
				System.out.println("Administrator Overview page is displayed");
			}else {
					System.out.println("Administrator Overview page is not displayed");
			}
			
		//	10.Print the Certifications available for Administrator Certifications (List)
			WebElement scroll = driver.findElement(By.xpath("//div[@class='credentials-card_title']"));
			Actions scrollele=new Actions(driver);
			scrollele.moveToElement(scroll);
			
	    	List<WebElement> listof=driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			for (WebElement each : listof) {
				String text = each.getText();
				System.out.println(text);
			}
			
		//	11.Take A snapshot of Certifications.*/
			WebElement findElement = driver.findElement(By.xpath("//div[@class='credentials-card_title']"));
			scrollele.scrollToElement(findElement).perform();
			File screenshotAs = findElement.getScreenshotAs(OutputType.FILE);
			File dest =new File("./Snap/salesForce.png");
			FileUtils.copyFile(screenshotAs, dest);
            
			driver.close();
	}

}
