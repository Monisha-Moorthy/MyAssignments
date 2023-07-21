package week4.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws IOException, InterruptedException {
	
		//1. Launch https://www.snapdeal.com/
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(options);
		    driver.get("https://www.snapdeal.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
			// 2. Go to Mens Fashion
		    WebElement webElement = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		    Actions builder=new Actions(driver);
		    builder.moveToElement(webElement).perform();
			 
			//3. Go to Sports Shoes
			 driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]")).click();
			 
			//4. Get the count of the sports shoes
			  String countOfShoes = driver.findElement(By.xpath("//span[contains(@class,'category-count')]")).getText();
			  System.out.println("The count of Shoes" +countOfShoes);
			  
			//5. Click Training shoes
			  driver.findElement(By.xpath("//div[contains(text(),'Training Shoes')]")).click();
			  
			//6. Sort by Low to High
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
			  driver.findElement(By.xpath("(//li[contains(@class,'search-li')])[2]")).click();
			  
			//7. Check if the items displayed are sorted correctly
			  List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
			  for (int i = 0; i < args.length; i++) {
				System.out.println(i);
			}
		
			  
			//8.Select the price range (900-1200)
			   //scroll
			  WebElement scroll = driver.findElement(By.xpath("//input[@name='fromVal']"));
			  Actions builder1=new Actions(driver);
			  builder1.moveToElement(scroll).perform();
			  driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
			  driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("519");
			  driver.findElement(By.xpath("//input[@name='toVal']")).clear();
			  driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("724");
			  driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
			  
		    //9.Filter with color Navy 
			  Thread.sleep(50000);
			  WebElement scroll1 = driver.findElement(By.xpath("//span[contains(@class,'filter-color-tile Black')]"));
			  Actions builder3=new Actions(driver);
			  builder3.moveToElement(scroll1).perform();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//span[contains(@class,'filter-color-tile Black')]")).click();
			  
			//10 verify the all applied filters 
			  System.out.println(driver.findElement(By.xpath("//a[text()='Black']")).getText());
			  System.out.println(driver.findElement(By.xpath("//a[@class='clear-filter-pill']")).getText());
			  
			//11. Mouse Hover on first resulting Training shoes
			  WebElement shoe = driver.findElement(By.xpath("//img[contains(@class,'product')]"));
			  Actions builder2=new Actions(driver);
			  builder2.moveToElement(shoe).perform();
			  
			//12. click QuickView button
			  driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click(); 
			  
			//13. Print the cost and the discount percentage
			  System.out.println(driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
			  System.out.println(driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());
			  
			//14. Take the snapshot of the shoes.
				//WebElement logo = driver.findElement(By.xpath("//img[@class='cloudzoom']"));
				File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			    File dest =new File("./Snap/DragAndDrop.png");
			    FileUtils.copyFile(screenshotAs, dest);
			  
			//15. Close the current window
			   // driver.close();
			    driver.findElement(By.xpath("//div[contains(@class,'close')]")).click();
			    
			//16. Close the main window
			   // driver.switchTo().window(list.get(0));
			    driver.close();
			
	}

}
