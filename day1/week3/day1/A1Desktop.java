package week3.day1;

public class A1Desktop extends A1Oops {  // A1Desktop-child ,  A1Oops-parent //singleinheritance
	
	public void desktopSize(){
		System.out.println("desktopsize------->from desktop");
		
	}
	
	//calling all methods from A1Oops 
	public static void main(String[] args) {
		
		 A1Desktop print=new  A1Desktop();
		 print.computerModel();
		 print.desktopSize();
	}

}
