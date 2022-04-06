/*
Nth number made of prime digits 
Easy Accuracy: 66.03% Submissions: 3981 Points: 2

Given a number 'N'. The task is to find the Nth number whose each digit is a prime number i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.

Example 1:
Input:
N = 10
Output: 33
Explanation:10th number in the sequence of
numbers whose each digit is prime is 33.

Example 2:
Input:
N = 21
Output: 222
Explanation:21st number in the sequence of
numbers whose each digit is prime is 222.

Your Task:
Complete primeDigits function and return the nth number of the given sequence made of prime digits.

Constraints:
1 <= N <= 100 */

// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  Solution ob = new Solution();
		  System.out.println(ob.primeDigits(n));
		}
	}
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to find nth number made of only prime digits.
    public static int primeDigits(int n)
    {
        //Your code here
        int num = 2, res = -1, count = 0;
        while(count < n){
            if(checkPrime(num)){
                res = num;
                count++;
            }
            num++;
        }
        return res;
    }
    
    public static boolean checkPrime(int x){
        String str = String.valueOf(x);
        for(char ch : str.toCharArray()){
            if(ch == '2' || ch=='3' || ch=='5' || ch=='7'){}
            else
                return false;
        }
        return true;
    }
}

//Total Time Taken: 0.25/1.42