package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
	public static void main(String[] args) {
		
	
	
	/*1. Load https://buythevalue.in/

		//Handle alert
		9. Accept the alert */
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notification");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://buythevalue.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//2. Click on first product (eg: Hamdard Hing - 50GM)
	driver.findElement(By.xpath("//a[@class='product-title']")).click();
	//3. Close chat widget
	driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-popup-close-popup-push']/div")).click();
	//4. Enter the pincode 
	driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("600034");
	//5. Click on Check
	driver.findElement(By.xpath("//input[@class='btn']")).click();
	//6. Click on ADD TO CART
	driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	
	//7. Click on View
	driver.findElement(By.xpath("//a[text()='View Cart']")).click();
	
	//8. Click on CHECK OUT
	driver.findElement(By.xpath("//input[@id='checkout']")).click();
	driver.close();
	
	
	
	
	

}
}