// Two friends are playing a game. The rules of the game are as follows:

// Friend 1 provides a 4-digit natural number.

// Friend 2's task is to find the smallest 4-digit number that is greater than the number provided by 2 Friend 1 and has distinct digits.

// Write a function to solve this problem. You are given an integer num (1000 s num ≤ 9000) representing the number provided by Friend 1.
// Your task is to find and return the smallest 4-digit number that meets the criteria mentioned above.

// Input

// . num (1000 ≤ num ≤ 9000): A 4-digit natural number provided by Friend 1.

// Output

// • Return a single integer, the smallest 4-digit number that is greater than num and has distinct digits. For example, if Friend 1 provides the number 1234,
// the smallest 4-digit number greater than 1234 with distinct digits is 1235.




// Java code for the above approach 
import java.util.*;
import java.io.*; 

public class DistinctNum{ 

// Function to print unique 
// numbers 
public static void printUnique(int num) 
{ 
	int r=9000;
	// Iterate from l to r 
	while(num >=1000 && num <=9000)
	{
	for(int i = num+1; i <= r; i++) 
	{ 
		
		// Convert the no. to String
	
		String s = String.valueOf(i); 
		
		// Convert String to set using Java Collections 
		HashSet<Integer> uniDigits = new HashSet<Integer>(); 
		for(int c : s.toCharArray()) 
			uniDigits.add(c); 
			
		// Output if condition satisfies 
		if (s.length() == uniDigits.size()) 
		{ 
			System.out.print(i+ " ");
			break;
		} 
		
	} 
	break;
	}
	
} 

// Driver Code 
public static void main(String[] args) 
{ 
	
	
	
	// Function Call 
	printUnique(8050); 
} 
} 


