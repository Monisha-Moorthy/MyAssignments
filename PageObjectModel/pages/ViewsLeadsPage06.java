package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class ViewsLeadsPage06 extends BaseClass{

		
		public ViewsLeadsPage06 verifyleadpage() {
			String Currentpage = driver.getTitle();
			System.out.println(Currentpage);
			
			return new ViewsLeadsPage06();
	}
	
		 
}
