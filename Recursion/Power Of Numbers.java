/*
Power Of Numbers 
Easy Accuracy: 49.24% Submissions: 58023 Points: 2

Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:
Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2
and after raising power of 2 by 2 
we get 4 which gives remainder as 
4 by dividing 1000000007.

Example 2:
Input:
N = 12
Output: 864354781
Explanation: The reverse of 12 is 21
and 1221 , when divided by 1000000007 
gives remainder as 864354781.

Your Task:
You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).

Constraints:
1 <= N <= 109*/

// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
            //input N
		    N=sc.nextInt();
		    int R=0;
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		}		
	}
}

// } Driver Code Ends
//User function Template for Java

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        if(R == 0) return 1;
        long temp = power(N, R/2)%1000000007;
        temp = (temp * temp)%1000000007;
        if(R % 2 == 0)
            return temp;
        
        else
            return (temp * (N%1000000007))%1000000007;
    }
}

//Total Time Taken: 0.2/1.2