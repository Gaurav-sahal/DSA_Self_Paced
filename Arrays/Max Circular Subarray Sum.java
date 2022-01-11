/*
Max Circular Subarray Sum 
Hard Accuracy: 45.16% Submissions: 42823 Points: 8

Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum.

Example 1:
Input:
N = 7
arr[] = {8,-8,9,-9,10,-11,12}
Output:
22
Explanation:
Starting from the last element
of the array, i.e, 12, and 
moving in a circular fashion, we 
have max subarray as 12, 8, -8, 9, 
-9, 10, which gives maximum sum 
as 22.

Example 2:
Input:
N = 8
arr[] = {10,-3,-4,7,6,5,-4,-1}
Output:
23
Explanation: Sum of the circular 
subarray with maximum sum is 23

Your Task:
The task is to complete the function circularSubarraySum() which returns a sum of the circular subarray with maximum sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
-106 <= Arr[i] <= 106*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}
// } Driver Code Ends

class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }
    
    //USERDEFINED FUNCTION
    static int kadane(int arr[], int n){
        int max = arr[0], sum = arr[0];
        for(int i=1; i<n; i++){
            sum = Math.max(sum+arr[i], arr[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
    
    //USERDEFINED FUNCTION
    static int reverseKadane(int arr[], int n){
        int kadaneOutput = kadane(arr,n);
        if(kadaneOutput < 0) return kadaneOutput;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int res = sum + kadane(arr, n);
        return res;
    }
}

//Total Time Taken: 0.7/1.8