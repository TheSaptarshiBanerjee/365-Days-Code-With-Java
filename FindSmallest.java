/******************************************************************************

                         Find Smallest number in the given Array

*******************************************************************************/
import java.util.*;


public class FindSmallest
{
    public static int smallest(int nums[])
{
    int smallest = Integer.MAX_VALUE;
    
    for (int i = 0;i<nums.length ;i++ )
    {
    if (smallest>nums[i])
    {
        smallest = nums[i];
    }
    }
    return smallest;
}
	public static void main(String[] args) {
		int nums[] = {4,2,8,10,5};
		System.out.println("THE SMALLEST NUMBER : "+smallest(nums));
	}
}
