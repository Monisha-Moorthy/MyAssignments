package week4.assignment;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Nykaa {
	public static void main(String[] args) throws InterruptedException {
		
		// 1) Go to https://www.nykaa.com/
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.nykaa.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
	    //2) Mouseover on Brands and Search L'Oreal Paris
		    WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
            Actions builder=new Actions(driver);
            builder.moveToElement(brand).perform();
            driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
            
		// 3) Click L'Oreal Paris
            driver.findElement(By.xpath("//a[contains(text(),'Paris')]")).click(); 
            
		// 4) Check the title contains L'Oreal Paris(Hint-GetTitle)
           System.out.println(driver.getTitle());
           
        //5) Click sort By and select customer top rated
           WebElement scroll = driver.findElement(By.xpath("//div[@id='filter-sort']"));
           Actions builder1=new Actions(driver);
           builder1.scrollToElement(scroll).perform();
           driver.findElement(By.className("sort-name")).click(); 
           driver.findElement(By.xpath("(//div[@class='control-value']/following-sibling::div)[4]")).click(); 
           
		// 6) Click Category and click Hair->Click haircare->Shampoo
           driver.findElement(By.xpath("//span[text()='Category']")).click(); 
           Thread.sleep(1000);
           WebElement findElement = driver.findElement(By.xpath("//span[text()='Hair']"));
           Actions action=new Actions(driver);
           action.scrollToElement(findElement);
           findElement.click();
           Thread.sleep(1000);
           
           
           WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Hair Care']"));
           action.scrollToElement(findElement2);
           findElement2.click();
           
           Thread.sleep(1000);
           WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Shampoo']"));
           action.scrollToElement(findElement3);
           findElement3.click();
           
		// 7) Click->Concern->Color Protection
           WebElement findElement4 = driver.findElement(By.xpath("//span[text()='Concern']"));
           action.scrollToElement(findElement4);
           findElement4.click();
           
           WebElement findElement5 = driver.findElement(By.xpath("//span[text()='Color Protection']"));
           action.scrollToElement(findElement5);
           findElement5.click();
           
		// 8)check whether the Filter is applied with Shampoo
           System.out.println(driver.findElement(By.xpath("//span[text()='Shampoo']")).getText());
           
		// 9) Click on L'Oreal Paris Colour Protect Shampoo
           driver.findElement(By.xpath("//div[contains(@class,'productWrapper')]")).click();
           
		// 10) GO to the new window and select size as 175ml
           Set<String> windowHandles = driver.getWindowHandles();
           List<String> list=new ArrayList<String>(windowHandles);
           driver.switchTo().window(list.get(1));
           
           driver.findElement(By.xpath("//span[text()='180ml']")).click();
           
		// 11) Print the MRP of the product
           System.out.println("The MRP IS:" + driver.findElement(By.xpath("//span[contains(text(),'209')]")).getText());
           
		// 12) Click on ADD to BAG
           driver.findElement(By.xpath("//span[text()='Add to Bag']")).click(); 
           
		// 13) Go to Shopping Bag 
           driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
           
		// 14) Print the Grand Total amount
           driver.switchTo().frame(0);
          String Total = driver.findElement(By.xpath("//span[contains(@class,'css-1um1mkq ')]")).getText();
          System.out.println(Total);
           
		// 15) Click Proceed
           driver.findElement(By.xpath("//span[text()='Proceed']")).click();
           
		// 16) Click on Continue as Guest
           driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
           
		// 17) Check if this grand total is the same in step 14
           driver.findElement(By.xpath("//div[contains(@class,'css-gecnnw ')]")).click();
           String text = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
           if(text.equals(Total)) {
        	   System.out.println("the grand price is:" +Total);
           }
		// 18) Close all windows
		  driver.quit();
	}

}
