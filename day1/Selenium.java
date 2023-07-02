package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
public static void main(String[] args) {
		
		//launch the browser
	    EdgeDriver driver =new EdgeDriver();
	    driver.get("https://www.facebook.com/login");
	    driver.manage().window().maximize();
	    WebElement ref=driver. findElement(By.id(""));
	    Select opt=new Select(ref);
	    
	}

}
