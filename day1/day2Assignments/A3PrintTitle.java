package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3PrintTitle {

	public static void main(String[] args) throws InterruptedException {
		//1. Load url "https://acme-test.uipath.com/login"
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		//2. Enter email as "kumar.testleaf@gmail.com"
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		//3. Enter Password as "leaf@12"
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		//4. Click login button
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	//	5. Get the title of the page and print
		System.out.println("Title is:"+ driver.getTitle());
	//	6. Click on Log Out
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	//	7. Close the browser (use -driver.close())
		driver.close();
	}
}
