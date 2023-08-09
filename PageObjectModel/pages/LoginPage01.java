package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class LoginPage01  extends BaseClass{
	
	public LoginPage01 enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;

	}
	
	public LoginPage01 enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	
	public WelcomePage02 clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage02();
	}

}
