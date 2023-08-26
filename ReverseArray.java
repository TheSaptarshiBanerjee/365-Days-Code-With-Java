/******************************************************************************

                            reverse the array

*******************************************************************************/

public class ReverseArray
{
    public static int reverse(int numbers[])
    {
        int first = 0, last = numbers.length - 1;
        while(first < last)
        {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first]=temp;
            
            first++;
            last--;
        }
        return -1;
    }
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		System.out.print("The Original Array : ");
		for (int i=0;i<numbers.length ;i++ )
		{
		System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.print("The Reversed Array : ");
		reverse(numbers);
		for (int i = 0; i<numbers.length ;i++ )
		{
		    System.out.print(numbers[i] + " ");
		}
	}
}
