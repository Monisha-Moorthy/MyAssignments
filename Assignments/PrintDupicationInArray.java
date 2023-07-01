package week1.Assignments;

public class PrintDupicationInArray {
	
	public static void main(String[] args) {
		int[] arr = {14,12,14,13,11,15,18,16,17,19,18,17,20};
		
		for (int i = 0; i < arr.length; i++) {       //   i=0  14        //      for(i=0 is taking array value ) eg i=0 ;14 compared with y 
			
			for (int j = i+1; j < arr.length; j++) {   // j=i+1 0+1=1 12  //  i+2  0+2 =2 14
				
				if(arr[i]==arr[j]) {                   //14==12          // 14==14
					System.out.println(arr[j]);                          //14
					break; 
				}
				
			}
			
		}
		
	}

}
