package week4.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {
	public static void main(String[] args) throws InterruptedException {
		// Pseudo Code
		// Launch URL
		// "https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0"
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 1 Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[contains(@class,'ui-button-text')]")).click();
		String parentWindow = driver.getWindowHandle();

		// switch to new window
		Set<String> task1 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(task1);
		WebDriver childwindow = driver.switchTo().window(list.get(1));
		for (String each : list) {
			System.out.println(each);
		}

		// 2 Find the number of opened tabs (get the size )

		// switch back to parent window
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		Set<String> task2 = driver.getWindowHandles();

		int size = task2.size(); // size of window or no of windows
		System.out.println("The number of windows open:" + size);

		// 3 Close all windows except Primary ----
		driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
		Set<String> task3 = driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(task3);
		for (String eachhandles : list3) {
			if (!eachhandles.equals(parentWindow)) {
				driver.switchTo().window(eachhandles).close();
			}
		}

		// 4 Wait for 2 new tabs to open  //EXPLICITY WAIT
		driver.switchTo().window(parentWindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Open with delay')]")).click();
		Thread.sleep(3000);
		Set<String> confirm = driver.getWindowHandles();
		for (String each : confirm) {
			System.out.println(each);

		}

		driver.quit(); // to close all window

	}

}
