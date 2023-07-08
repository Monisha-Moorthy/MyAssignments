package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4eRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// Step 2: Launch the chromebrowser
				 ChromeDriver driver=new ChromeDriver();
				// Step 3: Load the URL https://www.leafground.com/radio.xhtml
				 driver.get("https://www.leafground.com/radio.xhtml");
				// Step 4: Maximise the window
				 driver.manage().window().maximize();
				// Step 5: Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Your most favorite browser
				driver.findElement(By.xpath("//"+ "label[text()='Chrome']/preceding-sibling::div")).click();
				//UnSelectable
				WebElement res=driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div"));
				boolean opt=res.isSelected();
				System.out.println(opt);
				Thread.sleep(3000);
				//Find the default select radio button
                System.out.println("The default select radio button:" +driver.findElement(By.xpath("(//label[text()='Safari']/preceding-sibling::div)[2]")).isSelected());
               // Select the age group (only if not selected)
                WebElement res1= driver.findElement(By.xpath("(//label[contains(text(),'Years')]/preceding-sibling::div)[1]"));
                boolean opt1=res.isSelected();
                if(opt1==false) {
                	System.out.println("the age group (only if not selected)");
                	System.out.println("1-20 years");
                }
                
                WebElement res2= driver.findElement(By.xpath("(//label[contains(text(),'Years')]/preceding-sibling::div)[3]"));
                boolean opt2=res.isSelected();
                if(opt2==false) {
                	System.out.println("41-60 Years");
                }
                
				driver.close();
				
				
	}
}
