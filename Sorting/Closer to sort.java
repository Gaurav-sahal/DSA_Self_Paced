/*
Closer to sort 
Medium Accuracy: 59.81% Submissions: 8449 Points: 4

Given an array arr[](0-based indexing) of N integers which is closer sorted (defined below) and an element x. The task is to find the index of element x if it is present. If not present, then print -1.
Closer Sorted: The first array is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e, maybe to the arr[i+1] or arr[i-1].

Example 1:
Input: N = 5, A[] = [3 2 10 4 40], x = 2
Output: 1
Explanation: 2 is present at index 1 
(0-based indexing) in the given array.

Example 2:
Input: N = 4, A[] = [2 1 4 3], x = 5
Output: -1
Explanation: 
5 is not in the array so the output will 
be -1.

Your Task:
This is a function problem. You only need to complete the function closer() that arr, N, and x as parameters and returns the index. If the element is not present, return -1.

Expected Time Complexity: O(Log(N)).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= arr[i],x <= 109

Note: You may assume that the array does not contain any duplicate elements.*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    long x = Long.parseLong(br.readLine().trim());
		    System.out.println(new Solution().closer(arr, n, x));
		}
	}
}// } Driver Code Ends
//User function Template for Java

class Solution
{
  
    // n: size of array
    // x: element to find
    //Function to find index of element x in the array if it is present.
    static long closer(int arr[], int n, long x)
    {
        // add your code here
        long l=0, h=n-1;
        while(l <= h){
            long mid = (l+h)/2;
            if(arr[(int)mid] == (int)x){
                return mid;
            }
            if(mid > 0 && arr[(int)mid-1] == (int)x)
                return mid -1;
            if(mid < n-1 && arr[(int)mid+1] == (int)x)
                return mid +1;
            else if(arr[(int)mid] < (int)x)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1;
    }
}

//Total Time Taken: 1.5/2.7