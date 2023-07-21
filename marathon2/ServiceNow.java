package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Testcase:3 Ordering mobile
		
		/*Instance URL:  https://dev31913.service-now.com/
		Username: admin
		Password: q+NozS5Qe8!E */

		//Add ChromeOptions to handle browser notification
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//1. Launch ServiceNow application
		driver.get("https://dev31913.service-now.com/now/nav/ui/classic/params/target/ui_page.do%3Fsys_id%3Dc2ad7eef97d32110c5c5faafe153afc6");
		
		//2. Login with valid credentials username as admin and password 
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("q+NozS5Qe8!E");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
	    Thread.sleep(4000);
		Shadow shadow =new Shadow(driver);
		shadow.setImplicitWait(50);
		shadow.findElementByXPath("//div[@id='all']").click();
		shadow.findElementByXPath("//mark[text()='Service Catalog']").click();
		
		//4. Click on  mobiles
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");	
		driver.switchTo().frame(frame);
		WebElement findElement = driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]"));
		Actions action=new Actions(driver);
		action.scrollToElement(findElement).perform();
		findElement.click();
		
		//5. Select Apple iphone6s
		WebElement apple = driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']"));
		action.scrollToElement(apple).perform();
		apple.click();
		
		//6. Update color field to Rose gold and storage field to 128GB
		WebElement color = driver.findElement(By.xpath("(//select[contains(@class,'form-control ')])[2]"));
		Select sel=new Select(color);
		sel.selectByVisibleText("Rose Gold");
		
		WebElement storage = driver.findElement(By.xpath("(//select[contains(@class,'form-control ')])[3]"));
		Select sel1=new Select(storage);
		sel1.selectByVisibleText("128GB");
		
		
		//7. Select  Order now option
		WebElement order = driver.findElement(By.xpath("//button[@id='oi_order_now_button']"));
		action.scrollToElement(order).perform();
		order.click();
		
		//8. Verify order is placed and copy the request number"
		System.out.println(shadow.findElementByXPath("//span[contains(@class,'Thank you, your request has been submitted'])").getText());
		System.out.println("Req id :" +driver.findElement(By.xpath("//a[@id='requesturl']")).getText());
		
		//9. Take a snapshot of the ordered page.
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Snap/servicnow.png");
		FileUtils.copyFile(screenshotAs, dest);

		
	}

}
