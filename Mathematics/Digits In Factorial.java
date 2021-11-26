/*Digits In Factorial 
Easy Accuracy: 48.64% Submissions: 73423 Points: 2
Given an integer N. Find the number of digits that appear in its factorial. 
Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 
Example 1:

Input: N = 5
Output: 3
Explanation: Factorial of 5 is 120.
Number of digits in 120 is 3 (1, 2, and 0) 

Example 2:

Input: N = 120
Output: 199
Explanation: The number of digits in
120! is 199

Your Task:
You don't need to read input or print anything. Your task is to complete the function digitsInFactorial() that takes N as input parameter and returns number of digits in factorial of N.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 ≤ N ≤ 105*/

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public int digitsInFactorial(int N){
        // code here
        //log10(N!) = log10(1*2*3*4*....*N) = log10(1)+log10(2)+......+log10(N)
        double res = 0;
        for(int i=1; i<=N; i++){
            res += Math.log10(i);
        }
            
        return (int)Math.floor(res + 1);
    }
}

//Total Time Taken: 0.4/1.4