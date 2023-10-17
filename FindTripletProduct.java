// Java program to find a triplet product in an array
public class FindTripletProduct {

	// returns true if there is triplet with Product equal
	// to 'Product' present in A[]. Also, prints the triplet
	int find3Numbers(int A[], int arr_size, int mul)
	{
		int  count=0;

		// Fix the first element as A[i]
		for (int i = 0; i < arr_size - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < arr_size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < arr_size; k++) {
					if (A[i] * A[j] * A[k] == mul) {
			
				count++;
					
					}
					
				}
				
			}
			
		}
		System.out.println(count);

		// If we reach here, then no triplet was found
		return count;
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		FindTripletProduct triplet = new FindTripletProduct();
		int A[] = { 5,3,20,10,1,4,2 };
		int mul = 60;
		int arr_size = A.length;

		triplet.find3Numbers(A, arr_size, mul);
	}
}
