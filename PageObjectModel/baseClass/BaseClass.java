package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;

public class BaseClass {

	 public static ChromeDriver driver;
	
	 @BeforeMethod
	 public void preCondition() {
			driver= new ChromeDriver();
			 
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

		
		@AfterMethod
		public void postCondition() {
	    driver.close();
		

		}
}
