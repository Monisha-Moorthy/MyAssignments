package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProgram {
	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//url
		driver.get("http://leaftaps.com/opentaps");
		//maximize the window
		driver.manage().window().maximize();
		//Enter username
		WebElement eleprogram=driver.findElement(By.id("username"));  // using variable we can't contue with other methods eg sendkeys 
		eleprogram.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("motors");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("moni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("joy");
		//select Select Employee in source dropdown using index
		WebElement dd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option=new Select(dd);
		option.selectByIndex(3);
		
		//Select Automobile in MarketCampaign using visibleText
		WebElement dd1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option1=new Select(dd1);
		option1.selectByVisibleText("Automobile");
		
		//Select Corporation in Ownership using value
		WebElement dd2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option2=new Select(dd2);
		option2.selectByValue("OWN_CCORP");
		
		//Click create
		driver.findElement(By.className("smallSubmit")).click();
		
		//verify the title
		String Title=driver.getTitle();
		System.out.println(Title);
		
		//close the window
		driver.close();
		
		
				
		

}
}
