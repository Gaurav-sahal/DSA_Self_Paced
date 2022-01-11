/*
Longest Subarray Of Evens And Odds 
Medium Accuracy: 51.18% Submissions: 12992 Points: 4

You are given an array of size n. Find the maximum possible length of a subarray such that its elements are arranged alternately either as even and odd or odd and even .

Example 1:
Input:
n = 5
a[] = {10,12,14,7,8}
Output: 3
Explanation: The max length of subarray
is 3 and the subarray is {14 7 8}. Here 
the array starts as an even element and 
has odd and even elements alternately.

Example 2:
Input:
n = 2
a[] = {4,6}
Output: 1
Explanation: The array contains {4 6}. 
So, we can only choose 1 element as 
that will be the max length subarray.

Your Task:
You don't need to take any input. Just complete the function maxEvenOdd() that returns the maximum length.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n <= 106
1 <= Ai <= 103*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            
            //inserting elements in the array
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            //calling function    
            System.out.println(new Solution().maxEvenOdd(arr, n));
            
        }
    }
}   // } Driver Code Ends
//User function Template for Java
// User class to complete  

class Solution
{
    // arr[]: input array
    // n: size of array
    //Function to find the length of longest subarray of even and odd numbers.
    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int count = 1, max = 1;
        for(int i=1; i<n; i++){
            if((arr[i]%2 == 0 && arr[i-1]%2 == 0) || (arr[i]%2 != 0 && arr[i-1]%2 != 0))
                count = 1;
            else{
                count++;
                max = Math.max(count, max);
            }
        }
        return max;
    }
}

//Total Time Taken: 1.5/3.6