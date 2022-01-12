/*
Count 1's in binary array 
Easy Accuracy: 49.95% Submissions: 25257 Points: 2

Given a binary sorted non-increasing array of 1s and 0s. You need to print the count of 1s in the binary array.

Example 1:
Input:
N = 8
arr[] = {1,1,1,1,1,0,0,0}
Output: 5
Explanation: Number of 1's in given 
binary array : 1 1 1 1 1 0 0 0 is 5.

Example 2:
Input:
N = 8
arr[] = {1,1,0,0,0,0,0,0}
Output: 2
Explanation: Number of 1's in given 
binary array : 1 1 0 0 0 0 0 0 is 2.

Your Task:
The task is to complete the function countOne() which takes the array arr[] and its size N as inputs and returns the count of 1s in the input array.

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(1).

Constraint:
1 <= N <= 5*106
arr[i] = 0,1*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.countOnes(arr, n));
		    
		}
		
	}
}// } Driver Code Ends
//User function Template for Java

class Solution{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int arr[], int N){
        
        // Your code here
        int res = 0;
        int low = 0, high = N-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == 0)
                high = mid - 1;
            if(arr[mid] == 1){
                if(mid == N-1 || arr[mid+1] == 0){
                    res = mid + 1;
                    break;
                }
                else
                    low = mid + 1;
            }
        }
        return res;
    }
}

//Total Time Taken: 3.1/7.4