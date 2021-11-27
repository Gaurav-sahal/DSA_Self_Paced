/*
Exactly 3 Divisors 
Easy Accuracy: 44.86% Submissions: 72181 Points: 2

Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Example 1:

Input:
N = 6
Output: 1
Explanation: The only number less than 6 with 
3 divisors is 4.
Example 2:

Input:
N = 10
Output: 2
Explanation: 4 and 9 have 3 divisors.

Your Task:
You don't need to read input or print anything. Your task is to complete the function exactly3Divisors() that takes N as input parameter and returns count of numbers less than or equal to N with exactly 3 divisors.

Expected Time Complexity : O(N1/2 * N1/4)
Expected Auxilliary Space :  O(1)

Constraints :
1 <= N <= 109*/

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		}		
	}
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    
    public int exactly3Divisors(int N)
    {
        int count = 0;
        for(int i=2; i*i<=N; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i=5; i*i<=n; i++){
            if(n % i == 0 || n % (i+2) == 0) return false;
        }
        return true;
    }
}

//Total Time Taken: 0.3/1.3