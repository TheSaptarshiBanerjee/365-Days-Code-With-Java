/******************************************************************************

                        MAKE PAIRS IN ARRAY ELEMENTS
*******************************************************************************/

public class PairsInArray
{
    public static void Pairs(int arr[])
    {
        for (int i=0;i<arr.length ;i++ )
        {
            int curr = arr[i];
            for (int j=i+1;j<arr.length ;j++ )
            {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		System.out.println("THE ORIGINAL ARRAY : ");
		System.out.print("( ");
		for (int i = 0;i<arr.length ;i++ )
		{
		    System.out.print( arr[i]+" ");
		}
		System.out.print(" )" + "\n");
		System.out.println("The Array after making pairs");
		Pairs(arr);
	}
}
