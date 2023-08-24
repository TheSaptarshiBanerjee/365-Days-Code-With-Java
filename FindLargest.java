/******************************************************************************

                         Find largest number in the given Array.

*******************************************************************************/
import java.util.*;


public class FindLargest
{
    public static int largest(int nums[])
{
    int largest = Integer.MIN_VALUE;
    
    for (int i = 0;i<nums.length ;i++ )
    {
    if (largest<nums[i])
    {
        largest = nums[i];
    }
    }
    return largest;
}
	public static void main(String[] args) {
		int nums[] = {4,2,8,10,5};
		System.out.println("THE LARGEST NUMBER : "+largest(nums));
	}
}
