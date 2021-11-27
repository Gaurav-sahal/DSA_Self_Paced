/*
Multiplication Under Modulo 
Basic Accuracy: 63.97% Submissions: 12885 Points: 1

You are given two numbers a and b. You need to find the multiplication of a and b under modulo M (M as 109+7).

Example 1:

Input:
a = 92233720368547758
b = 92233720368547758
Output: 484266119
Explanation: Multiplication of a and b 
under modulo M will be 484266119.
Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: Multiplication of a and b
under modulo M is 0.

Your Task:
You don't need to read input or print anything. Your task is to complete the function multiplicationUnderModulo() that takes a and b as parameters and returns multiplication of a and b under modulo M.

Expected Time Complexity : O(1)
Expected Auxilliary Space :  O(1)

Constraints:
1 <= a,b <= 263-1*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //taking testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            
                        
            //taking input a and b
            long a = Long.parseLong(str[0]);
            long b = Long.parseLong(str[1]);
            

            //calling multiplicationUnderModulo() function
            System.out.println(new Solution().multiplicationUnderModulo(a, b));
        }
    }
}


// } Driver Code Ends
//User function Template for Java

class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long mod = 1000000007;
        return ((a % mod) * (b % mod)) % mod;
    }
}

//Total Time Taken: 1.1/2.9