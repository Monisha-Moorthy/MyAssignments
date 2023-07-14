package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListFacebook {

	public static void main(String[] args) {
		

/*1.Load amazon("https://www.amazon.in/")
2. type mobiles in the search box and click enter
3. Print all  mobile price
4. Find the least mobile*/
		
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		   List<WebElement> price =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		   List<Integer> print =new ArrayList<Integer>();
		   for (WebElement each : price) {
			   String list=each.getText();
			   String replaceAll = list.replaceAll(",", "");
			   int parseInt = Integer.parseInt(replaceAll);
               print.add(parseInt);
               
		}
		 
		   System.out.println(print.get(0));
		   driver.close();
		}
		  
		
		
		   
		
	}

