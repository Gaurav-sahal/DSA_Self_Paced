/*
Maximum Water Between Two Buildings 
Medium Accuracy: 54.12% Submissions: 9906 Points: 4

Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.

Example 1:
Input:
N = 6
height[] = {2,1,3,4,6,5}
Output: 8
Explanation: The heights are 2 1 3 4 6 5.
So we choose the following buildings
2 1 3 4 6 5  and remove others. So total
removed buildings is equal to 4, now the
height of smaller one is 2. So answer is
2 * removed buildings = 2*4 = 8. There is
no answer greater than this.

Example 2:
Input:
N = 2
height[] = {2,1}
Output: 0
Explanation: The heights are 2 1. So we
choose the following buildings 2 5  and
remove others. But there is no other 
buildings to be removed so total removed
= 0.  Now the height of smaller one is 2.
So answer is 2 * removed buildings = 2*0
= 0.

Your Task:
You need to complete the function maxWater that takes height array and size N as parameters and returns the max water that can be stored. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= heighti <= 106
1 <= N <= 105*/

// { Driver Code Starts
//Initial Template for Java
// Java implementation of the approach 

import java.util.Arrays; 
import java.util.*;
class GFG { 

	// Driver code 
	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int height[]=new int[n];
	        for(int i=0;i<n;i++)
	        height[i]=sc.nextInt();
	        Solution ob = new Solution();
	        System.out.println(ob.maxWater(height, n)); 
	    }
	} 
} 
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int height[], int n) 
    { 
        //Your code here
        int left = 0, right = n-1, res = -1;
        while(left < right){
            int max = (right - left - 1) * Math.min(height[left], height[right]);
            res = Math.max(max, res);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return res;
    } 
}

//Total Time Taken: 2.6/4.6