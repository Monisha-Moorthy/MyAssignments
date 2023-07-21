package week4.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {
	public static void main(String[] args) throws InterruptedException {

		// Pseudo Code
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("SFA")).click();

		// 5. Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// 7. Click on Widget of From Contact
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();

		// switch to child window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);

		// 8. Click on First Resulting Contact
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a)[2]")).click();

		// switch back to parent frame
		driver.switchTo().window(list.get(0));

		// 9. Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();

		// switch to child window
		Set<String> Handles = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>(Handles);
		driver.switchTo().window(list1.get(1));

		// 10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a)[3]")).click();

		// switch back to parent frame
		driver.switchTo().window(list.get(0));

		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// 12. Accept the Alert
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		// 13. Verify the title of the page
		String title = driver.getTitle();
		if (title.contains("Merge Contacts")) {
			System.out.println("The Title is verified");
		}

		driver.close();
	}
}
