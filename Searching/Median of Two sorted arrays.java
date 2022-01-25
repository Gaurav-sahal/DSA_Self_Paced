/*
Median of Two sorted arrays 
Hard Accuracy: 46.21% Submissions: 20799 Points: 8

Given two sorted arrays of sizes N and M respectively. The task is to find the median of the two arrays when they get merged.
If there are even number of elements in the resulting array, find the floor of the average of two medians.

Example 1:
Input:
N = 5, M = 6 
arr[] = {1,2,3,4,5}
brr[] = {3,4,5,6,7,8}
Output: 4
Explanation: After merging two arrays, 
elements will be as 1 2 3 3 4 4 5 5 6 7 8
So, median is 4.
 
Example 2:
Input:
N = 2, M = 3 
arr[] = {1,2}
brr[] = {2,3,4}
Output: 2
Explanation: After merging two arrays, 
elements will be as 1 2 2 3 4. So, 
median is 2.
 
Your Task:
You do not need to read input or print anything. Complete findMedian() function which takes the two arrays and n and m as input parameters and returns their median. If there are total even elements, return floor of average of middle two elements.

Expected Time Complexity : O(log(max(m,n)))
Expected Auxilliary Space : O(1)

Constraints:
1 <= N, M <= 106
1 <= arr[i], brr[i] <= 107*/

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
		    int n,m;
		    n=sc.nextInt();
		    m=sc.nextInt();
		    
		    int arr[]=new int[n];
		    int brr[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<m;i++)
		    {
		        brr[i]=sc.nextInt();
		    }
		    
		     if(n < m)
	        System.out.println(new Solution().findMedian(arr, n, brr, m));
	         else
	        System.out.println(new Solution().findMedian(brr, m, arr, n));
		}
	}
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        //Your code here
        int low = 0, high = n;
        while(low <= high){
            int mid1 = (low+high)/2;
            int mid2 = ((n+m+1)/2) - mid1;
            
            int min1 = (mid1 == n)?Integer.MAX_VALUE : arr[mid1];
            int max1 = (mid1 == 0)?Integer.MIN_VALUE : arr[mid1-1];
            int min2 = (mid2 == m)?Integer.MAX_VALUE : brr[mid2];
            int max2 = (mid2 == 0)?Integer.MIN_VALUE : brr[mid2-1];
            
            if(max2 <= min1 && max1 <= min2){
                if((n+m)%2 == 0){
                    return (Math.max(max1, max2) +Math.min(min1, min2))/2;
                }
                else
                    return Math.max(max1, max2);
            }
            else if(max2 > min1)
                low = mid1 + 1;
            else
                high = mid1 - 1;
        }
        return -1;
    }
}

//Total Time Taken: 1.7/3.6