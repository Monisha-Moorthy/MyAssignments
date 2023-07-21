package week4.assignment;

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
import org.openqa.selenium.interactions.Actions;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Amazon {
	public static void main(String[] args) throws IOException {
		
		 // 1.Load the URL https://www.amazon.in/
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
         // 2.search as oneplus 9 pro 
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
	    driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
	    
         // 3.Get the price of the first product
	    String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	    System.out.println(price);
	    
         // 4. Print the number of customer ratings for the first displayed product '''''
	    WebElement mouseover = driver.findElement(By.xpath("//span[@class='a-icon-alt']"));
	    Actions builder=new Actions(driver);
	    builder.moveToElement(mouseover);
	    String rating = driver.findElement(By.xpath("//i[contains(@class,'a-icon')]/span")).getText();
	    System.out.println(rating);
	    
         // 5. Click the first text link of the first image
	    driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[3]")).click();
	    
         // 6. Take a screen shot of the product displayed
	          //switch to new window
	        Set<String> windowHandles = driver.getWindowHandles();
	        List<String> list =new ArrayList<String>(windowHandles);
	         driver.switchTo().window(list.get(1));
	         File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	         File des =new File("./snap/Amazon.png");
	         FileUtils.copyFile(screenshotAs, des);
	         
         // 7. Click 'Add to Cart' button
	         driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	         
         // 8. Get the cart subtotal and verify if it is correct.   '''''
	         String grandPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	         if(price.equals(grandPrice)) {
	        	 System.out.println("Verified Subtotal" +grandPrice);
	         }
	         
         // 9.close the browser
	         driver.close();
		 
	}

}
