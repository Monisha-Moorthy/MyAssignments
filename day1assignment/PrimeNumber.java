package week1.day1assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=15;
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
		if(n%i==0){
			flag=true;
			break;
		}
		}
		 if(!flag)
			System.out.println("The given number is:"+"Primenumber");
		 else
			System.out.println("the given number is:"+"Not prime number");
		}
		
	
	}

