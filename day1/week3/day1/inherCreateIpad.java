package week3.day1;

public class inherCreateIpad extends InheriCreateIOS {
	
	public void watchMovie() {
		System.out.println("Start App ------>coming from CreateIpad class");	
	}
	
	
	
	//polymorphism using overriding

	public void startApp() {           //modifying the method from superclass 
		System.out.println("new start app ------>coming from ipad class");	
		}
	public static void main(String[] args) {       
		inherCreateIpad obj=new inherCreateIpad();
		obj.startApp();
	}
}
