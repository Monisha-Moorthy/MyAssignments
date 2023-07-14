package week3.day1;

public class PolyOverridCalculator {
	
	public void add(int a ,int b){
		
		System.out.println(a+b);
	}
	
	public void add(int a ,int b , float c){
		System.out.println(a+b-c);
	}
	
	public void multiple(double a ,double b ){
		System.out.println(a+b);
	}
	
	public void multiple(float a ,float b ){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		PolyOverridCalculator obj=new PolyOverridCalculator();
		int a=10;
		int b=12;
		obj.add(10,12);
		obj.add(13, 14, 6);
		obj.multiple(7.8d, 5.9d);
		obj.multiple(7.6f, 8.5f);
		
	}
	
}
