/*Count Total Digits in a Number 

Easy Accuracy: 50.0% Submissions: 40216 Points: 2
You are given a number n. You need to find the count of digits in n.

Example 1:
Input:
n = 1
Output: 1
Explanation: Number of digit in 1 is 1.

Example 2:
Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5

Your Task:
You don't need to read input or print anything. Your task is to complete the function countDigits() that takes n as parameter and returns the count of digits in n.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn).

Constraints:
0 <= n <= 107*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n =sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().countDigits(n)); // prints the count of digits 
        }
    }
}

// } Driver Code Ends
//User function Template for Java

class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        if(n <= 9) return 1;
        
        return 1 + countDigits(n/10);
    }
}

//Total Time Taken: 1.3/2.7