package week2.seleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMarathon {
	public static void main(String[] args) throws InterruptedException {
		//Testcase:1 (AbhiBus)
		//==========
		//01) Launch  Chrome browser 
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    ChromeDriver driver = new ChromeDriver(options);
	    
	//	add  implicitlyWait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
	//	02) Load https://www.abhibus.com/
		     driver.get("https://www.abhibus.com/");
		     
	//	03) Click on Bus
		     driver.findElement(By.xpath("(//a[text()='Bus'])[2]"));
		     
	//	04) Type "Chennai" in the FROM text box
		     driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		     
	//	05) Click the first option from the pop up box
		     driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		     
	//	06) Type "Bangalore" in the TO text box
		     driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore"); 
		     
	//	07) Click the first option from the pop up box
		     driver.findElement(By.xpath("//li[text()='Bangalore']")).click(); 
		     
	//	08) Select tomorrow's date in the Date field
		     driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		     driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		     
	//	09) Click Search Buses
		     driver.findElement(By.xpath("//a[text()='Search']")).click(); 
		     
	//	09) Print the name of the first resulting bus (use .getText())
		     System.out.println(driver.findElement(By.xpath("//h2[contains(@class,'TravelAgntNm')]")).getText()); 
		     
	//	10) Choose SLEEPER in the left menu from Bus Type
		     driver.findElement(By.xpath("//input[@name='Bustypes']")).click(); 
		     
	//	11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		    System.out.println(driver.findElement(By.xpath("//p[contains(@class,'noseats')]")).getText());  
		    
	//	12) Click SelectSeat
		    driver.findElement(By.xpath("//span[@class='book']")).click(); 
		    
	//	13) Choose any one Available seat
		   driver.findElement(By.xpath("//span[@class='book']")).click();
		   
	//	14) Print Seats Selected ,Total Fare
		    System.out.println(driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());
		    
	//	15) Select Boarding Point  and Dropping Point
		   WebElement opt= driver.findElement(By.xpath("//select[@id='boardingpoint_id']")); 
		    Select dd=new Select(opt);
		    dd.selectByIndex(2);
		    
		    WebElement opt1= driver.findElement(By.xpath("//select[@id='droppingpoint_id']")); 
		    Select dd1=new Select(opt);
		    dd1.selectByIndex(1); 
		    
	//	16) Get the Title of the page(use .getTitle())
		    Thread.sleep(2000);
		    driver.getTitle();
		    
	//	17) Close the browser
		    driver.close();
	}

}
