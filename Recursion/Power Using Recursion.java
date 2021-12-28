/*
Power Using Recursion 
Basic Accuracy: 63.0% Submissions: 17573 Points: 1

You are given two numbers n and p. You need to find np.

Example 1:
Input:
n = 9 p = 9 
Output: 387420489
Explanation: 387420489 is the value 
obtained when 9 is raised to the 
power of 9.

Example 2:
Input:
n = 2 p = 9
Output: 512
Explanation: 512 is the value 
obtained when 2 is raised to 
the power of 9.  

Your Task:
You don't need to read input or print anything. You only need to complete the function RecursivePower() that takes n and p as parameters and returns np.

Expected Time Complexity: O(p).
Expected Auxiliary Space: O(p).

Constraints:
1 <= n <= 9
0 <=  p <= 9*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();//testcases
        
        while(t-- > 0)
        {
            //input n and p
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            //calling RecursivePower() method 
            System.out.println(new Solution().RecursivePower(n,p));
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p == 0) return 1;
        if(p == 1) return n;
        return n * RecursivePower(n, p-1);
    } 
}

//Total Time Taken: 1.4/3.4