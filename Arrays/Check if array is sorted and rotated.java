/*
Check if array is sorted and rotated 
Medium Accuracy: 38.92% Submissions: 23185 Points: 4

Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Example 1:
Input:
N = 4
arr[] = {3,4,1,2}
Output: Yes
Explanation: The array is sorted 
(1, 2, 3, 4) and rotated twice 
(3, 4, 1, 2).

Example 2:
Input:
N = 3
arr[] = {1,2,3}
Output: No
Explanation: The array is sorted 
(1, 2, 3) is not rotated.

Your Task:
The task is to complete the function checkRotatedAndSorted() which returns true if an array is sorted and rotated clockwise otherwise false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= A[i] <= 106*/

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;
// } Driver Code Ends

class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        int i = 0, j = 1,count = 0;
        while(j < num)
        {
            if(arr[i] > arr[j])
            {
                count++;
            }
            i++;
            j++;
        }
        // for increasing order
        if(count == 1 && arr[j-1] < arr[0]) return true;
        // for decreasing order
        if(count == num-2 && arr[j-1] > arr[0]) return true;
        return false;
    }
}
// { Driver Code Starts.

class Main {
    
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		   
		 Solution obj = new Solution();
        
        if(!(obj.checkRotatedAndSorted(arr, n)))
            System.out.println("No"); // print the result
        else
            System.out.println("Yes");
		}
	}
}
// } Driver Code Ends

//Total Time Taken: 0.8/2.4