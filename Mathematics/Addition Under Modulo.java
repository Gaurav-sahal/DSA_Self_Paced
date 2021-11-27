/*
Addition Under Modulo 
Basic Accuracy: 56.29% Submissions: 34434 Points: 1

Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.

Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation: 
9223372036854775807 + 9223372036854775807 
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006

Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: 1000000007 + 1000000007 =
(2000000014) mod (109+7) = 0

Your Task:
You don't need to read input or print anything. Your task is to complete the function sumUnderModulo() that takes a and b as input parameters and returns sum of a and b under modulo 109+7.

Expected Time Complexity : O(1)
Expected Auxilliary Space :  O(1)

Constraints:
1 <= a,b <= 263-1*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //taking testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            
            //taking input a and b
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);
            
            //calling method sumUnderModulo()
            System.out.println(new Solution().sumUnderModulo(a,b));
        }
    }
}// } Driver Code Ends
//User function Template for Java

class Solution {
    public static long sumUnderModulo(long a, long b){
        // code here
        long mod = 1000000007;
        long res = ((a%mod) + (b%mod))%mod;
        return res;
    }   
}

//Total Time Taken: 1.4/3.0