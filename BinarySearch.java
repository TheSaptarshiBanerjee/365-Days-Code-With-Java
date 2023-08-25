/******************************************************************************

           Search Number using Binary Search from the given array

*******************************************************************************/
import java.util.*;

public class BinarySearch
{
    public static int bSearch(int arr[],int key)
{
    int start=0,end=arr.length - 1;
    
    while(start <= end)
    {
        int mid = (start+end)/2;
        
        if(arr[mid] == key) //Element Found
        {
            return mid;
        }
        if(arr[mid] < key)  //Right
        {
            start = mid + 1;
            
        }
        else{
            end = mid - 1;  //Left
        }
    }
    return -1;
}
	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 1, 3};
		int key = 7;
		System.out.println("THE KEY LOCATION FOUND AT : " bSearch(arr[]));
	}
}
