package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4Input {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		// : Load the URL https://www.leafground.com/input.xhtml
		 driver.get("https://www.leafground.com/input.xhtml");
		// : Maximise the window
		 driver.manage().window().maximize();
		 //Type your name
		 driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield')])[1]")).sendKeys("Monisha");
		 //Append Country to this City.
		 driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield')])[2]")).sendKeys("Monisha"+" " +"Joy");
		 //Verify if text box is disabled
		 driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield')])[3]")).isEnabled();
		 //Clear the typed text.
		 driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield')])[4]")).clear();
		 //Retrieve the typed text.
		 driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield')])[5]")).getText();
		 //
		 driver.close();
	}

}
