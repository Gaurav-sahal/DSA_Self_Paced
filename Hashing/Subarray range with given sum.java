/*
Subarray range with given sum 
Easy Accuracy: 48.5% Submissions: 14561 Points: 2

Given an unsorted array of integers and a sum. The task is to count the number of subarray which adds to the given sum.

Example 1:
Input:
n = 5
arr[] = {10,2,-2,-20,10}
sum = -10
Output: 3
Explanation: Subarrays with sum -10 are: 
[10, 2, -2, -20], [2, -2, -20, 10] and 
[-20, 10].

Example 2:
Input:
n = 6
arr[] = {1,4,20,3,10,5}
sum = 33
Output: 1
Explanation: Subarray with sum 33 is: 
[20,3,10].

Your Task:
This is a function problem. You only need to complete the function subArraySum() that takes arr, n, sum as parameters and returns the count of subarrays which adds up to the given sum. 

Expected Time Comlexity: O(n)
Expected Auxilary Space: O(n)

Constraints:
1 <= n <= 105
-105 <= arr[i] <= 105
-105 <= sum <= 105*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;

class Driverclass
{
	public static void main (String[] args)
	 {
    	 Scanner sc=new Scanner(System.in);
    	 int t=sc.nextInt();
    	 while(t-->0)
    	 {
    	        int n = sc.nextInt();
    		    int arr[] = new int[n];
    		    for(int i=0;i<n;i++)
    		    {
    		        arr[i] = sc.nextInt();
    		    }
    		    int sum = sc.nextInt();
    		    System.out.println(new Solution().subArraySum(arr, n, sum));
    		    
    		}
	}
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
        int count = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            preSum += arr[i];
            if(preSum == sum)
                count++;
            if(map.containsKey(preSum - sum)){
                count += map.get(preSum - sum);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}

//Total Time Taken: 2.5/5.1