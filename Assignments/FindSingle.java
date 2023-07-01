package week1.Assignments;

public class FindSingle
{
	
	public static void main(String[] args)  //main method
	{
		int[] nums ={ 2, 2, 1 };    //input(2,2,1) 
		for (int i = 0; i < nums.length; i++)       // i=0 ;2				                                 // i=1 ;2    												 //i=2 ;1                                            
		{
			int count = 0;                          //count=0   //count=1             //  count=2               count=0           count=1         count=2                //count=0							count=1
			for (int j = 0; j < nums.length; j++)   //j=0 ;2                //j=1 ;2                j=2;1        j=0 ;2            j=1;2           j=2 ;1                  j=0 ;2       j=1 ;2    j=2 ;1
			{
				if (nums[i] == nums[j])             //2==2                  //2==2                  //2==1       2==2               2==2            2==1                   1==2         1==2      1==1
				{

					count++;                        //count++               count++                               count++         count++                                                          count++
				}
		    }
			if (count == 1) {                                                                 // cout==2                                                 			    count==2                              count==1    
				System.out.println("Single one Element in the Array is ==> " + nums[i]);																													//	print i value
			}
	}

}
}
