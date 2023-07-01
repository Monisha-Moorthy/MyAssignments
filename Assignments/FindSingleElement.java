package week1.Assignments;
public class FindSingleElement {
	public void findSingleElement(int[] Array) {          //method

		for (int i = 0; i < Array.length; i++) {
			int count = 0;
			for (int j = 0; j < Array.length; j++) {
				if (Array[i] == Array[j]) {

					count++;
				}
			}
			if (count == 1) {
				System.out.println("Single one Element in the Array is ==> " + Array[i]);
			}
		}

	}

	public static void main(String[] args) {             //main method

		FindSingleElement element = new FindSingleElement();   //creating object
		int[] nums = { 2, 2, 1 };                              //inputs
 
		int[] nums_ = { 4, 1, 2, 1, 2 };

		int[] nums1 = { 1 };

		element.findSingleElement(nums);                       //calling an object
		element.findSingleElement(nums_);
		element.findSingleElement(nums1);
	}

	
}

	

