/*
Zero Sum Subarrays 
Medium Accuracy: 50.41% Submissions: 31847 Points: 4

You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.

Example 1:
Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].

Example 2:
Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]

Your Task:
You don't need to read input or print anything. Complete the function findSubarray() that takes the array arr and its size n as input parameters and returns the total number of sub-arrays with 0 sum. 
 
Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)
 
Constraints:    
1<= n <= 107
-1010 <= arri <= 1010
*/
// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}
// } Driver Code Ends
//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Long, Integer> map = new HashMap<>();
        long count = 0, preSum = 0;
        for(Long x : arr){
            preSum += x;
            if(preSum == 0)
                count++;
            if(map.containsKey(preSum))
                count += map.get(preSum);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}

//Total Time Taken: 4.3/8.5