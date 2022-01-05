/*
Minimum adjacent difference in a circular array 
Easy Accuracy: 54.61% Submissions: 16059 Points: 2

Given an array Arr of n integers arranged in a circular fashion. Your task is to find the minimum absolute difference between adjacent elements.

Example 1:
Input:
n = 7
Arr[] = {8,-8,9,-9,10,-11,12}
Output: 4
Explanation: The absolute difference 
between adjacent elements in the given 
array are as such: 16 17 18  19 21 23 4
(first and last). Among the calculated 
absolute difference the minimum is 4.

Example 2:
Input:
n = 8
Arr[] = {10,-3,-4,7,6,5,-4,-1}
Output: 1
Explanation: The absolute difference 
between adjacent elements in the given 
array are as such: 13 1 11 1 1 9 3 11
(first and last).  Among the calculated 
absolute difference, the minimum is 1.

Your Task:
The task is to complete the function minAdjDiff() which returns the minimum difference between adjacent elements in circular array.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraint:
2 <= n <= 106
-106 <= Arr[i] <= 106*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;
// } Driver Code Ends

class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        int min = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            min = Math.min(Math.abs(arr[i]-arr[i-1]),min);
        }
        min = Math.min(Math.abs(arr[n-1]-arr[0]),min);
        return min;
    }
}

// { Driver Code Starts.
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)//While testcases exist
		{
		    //Input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    
		    //Array of size n
		    int arr[] = new int[n];
		    
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //input elements of array
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.minAdjDiff(arr, n));
		}
	}
}
// } Driver Code Ends

//Total Time Taken: 0.6/1.7