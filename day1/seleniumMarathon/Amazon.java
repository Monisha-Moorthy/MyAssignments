package week2.seleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
public static void main(String[] args) {
	//Testcase:2(Amazon)
	//===============
	//01) Launch Chrome  
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    ChromeDriver driver = new ChromeDriver(options);
    
	//02) Load https://www.amazon.in/
     driver.get("https://www.amazon.in/");
     
	   // add  implicitlyWait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	//03) Type "Bags" in the Search box
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");
	     
	//04) Choose the item in the result (bags for boys)
	     driver.findElement(By.xpath("(//div[contains(@class,'s-suggestion ')])[3]")).click();
	     
	//05) Print the total number of results (like 50000)
	     driver.findElement(By.xpath("(//div[contains(@class,'a-section ')])/span")).getText();
	     
	//    1-48 of over 50,000 results for "bags for boys"
	//06) Select the first 2 brands in the left menu  (like American Tourister, Generic)
	     driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[3]")).click();
	     driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[4]")).click();
	     
	//07) Choose New Arrivals (Sort)
	     driver.findElement(By.xpath("//span[contains(@class,'a-button-text')]")).click();
	     driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
	     
	//08) Print the first resulting bag info (name, discounted price)
	    System.out.println(driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus')]")).getText()); 
	    System.out.println(driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus')]")).getText());  
	    
	//09) Get the page title and close the browser(driver.close())	
	    driver.getTitle();
	    driver.close();
	
}
}
