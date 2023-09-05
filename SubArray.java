/******************************************************************************

                PRINT AND COUNT THE SUB ARRAY FROM A GIVEN ARRAY

*******************************************************************************/

public class SubArray
{
    public static void subArr(int arr[])
    {
        int subArrCount = 0;
        for (int i =0; i<arr.length ;i++ )
        {
           int start = i;
            for(int j = start; j < arr.length; j++)
            {
               int end = j;
                for (int k=start;k <= end ;k++ )
                {
                    System.out.print(arr[k]+ " ");
                    
                }
                
                System.out.println();
                subArrCount++;
            }
            System.out.println();
            
        }
        System.out.print("TOTAL SUB ARRAYS : " + subArrCount);
    }
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		
		subArr(arr);
	}
}
