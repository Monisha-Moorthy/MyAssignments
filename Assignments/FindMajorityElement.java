package week1.Assignments;

public class FindMajorityElement {

public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		
		int count =0,temp=0;//,count_=0;
		
		for(int i=0 ;i<nums.length;i++)
		{
			count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
			
			if(count>nums.length/2)
			{
				temp=nums[i];
				//count_=count;
			}
			
			
		}
		if(count>nums.length/2)
		{
		System.out.println("majority element is ====> "+temp);
		}
		else
		{
			System.out.println("No majority element");
		}
		
}
}
