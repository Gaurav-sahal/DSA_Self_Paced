/*Sum of Digits of a Number 

Basic Accuracy: 61.16% Submissions: 26132 Points: 1
You are given a number n. You need to find the sum of digits of n.

Example 1:
Input:
n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.

Example 2:
Input:
n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sumOfDigits() that takes n as parameter and returns the sum of digits of n.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn) (Recursive).

Constraints:
1 <= n <= 107*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().sumOfDigits(n)); // computing sum of digits of n
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        // add your code here
        if(n <= 9) return n;
        
        return (n % 10) + sumOfDigits(n/10);
    }
}

//Total Time Taken: 1.3/2.6