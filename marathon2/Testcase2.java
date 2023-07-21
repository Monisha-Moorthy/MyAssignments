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

public class Testcase2 {
	public static void main(String[] args) throws IOException {
		
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
		WebElement yesSCroll = shad2.findElementByXPath(("//a[text()='Salesforce Certification']"));
		Actions ysScroll =new Actions(driver);
		ysScroll.scrollToElement(yesSCroll).perform();
		
		shad2.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		//7. Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		
		//8. Get the Text(Summary) of Salesforce Architect 
		WebElement findElement = driver.findElement(By.xpath("(//div[contains(text(),' Sale')])[4]"));
		ysScroll.scrollToElement(findElement).perform();
		System.out.println(findElement.getText());
		
		//9. Get the List of Salesforce Architect Certifications Available
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Application Architect']"));
		ysScroll.scrollToElement(findElement2).perform();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//a[text()='Application Architect']"));
		for (WebElement each : findElements) {
			String text = each.getText();
			System.out.println(text);
			
		}
		//10.Click on Application Architect 
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();

		//11.Get the List of Certifications available
		WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Data Architect']"));
		ysScroll.scrollToElement(findElement3).perform();
		
		List<WebElement> findElements1 = driver.findElements(By.xpath("//a[text()='Data Architect']"));
		for (WebElement each : findElements1) {
			String text = each.getText();
			System.out.println(text);
			
		}
		
		//12.Take A snapshot of Certifications.
		WebElement snap = driver.findElement(By.xpath("//a[text()='Data Architect']"));
		ysScroll.scrollToElement(snap).perform();
		File screenshotAs = snap.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Snap/salesForce1.png");
		FileUtils.copyFile(screenshotAs, dest);

	}

}
