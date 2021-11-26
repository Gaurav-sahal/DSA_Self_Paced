/*GP Term 
Easy Accuracy: 44.39% Submissions: 88992 Points: 2
Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.

Example 1:

Input:
A = 2 
B = 3
N = 1
Output: 2
Explanation: The first term is already
given in the input as 2
Example 2:

Input:
A = 1
B = 2
N = 2
Output: 2
Explanation: Common ratio = 2,
Hence second term is 2.

Your Task:
You don't need to read input or print anything. Your task is to complete the function termOfGP() that takes A, B and N as parameter and returns Nth term of GP. The return value should be double that would be automatically converted to floor by the driver code.

Expected Time Complexity : O(logN)
Expected Auxilliary Space : O(1)

Constraints:
-100 <= A <= 100
-100 <= B <= 100
1 <= N <= 5*/

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    
		    Solution  obj=new Solution ();
		    int A,B;
		    
		    //taking A and B
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method termOfGP() of class GP
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        //GP Series : a, ar, ar^2, ar^3,......ar^(n-1)
        //Hence B = ar
        double r = (double)B/A;
        double pow = Math.pow(r,N-1);
        return A * pow;
    }

}

//Total Time Taken: 0.2/1.2