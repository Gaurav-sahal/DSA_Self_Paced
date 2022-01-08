/*
Trapping Rain Water 
Medium Accuracy: 49.62% Submissions: 100k+ Points: 4

Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 
Example 1:
Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 

Example 2:
Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.

Example 3:
Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.

Your Task:
You don't need to read input or print anything. The task is to complete the function trappingWater() which takes arr[] and N as input parameters and returns the total amount of water that can be trapped.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
3 < N < 106
0 < Ai < 108*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}
// } Driver Code Ends

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int lArr[] = new int[n];
        int rArr[] = new int[n];
        
        lArr[0] = arr[0];
        rArr[n-1] = arr[n-1];
        for(int i=1; i<n; i++){
            if(arr[i] > lArr[i-1]){
                lArr[i] = arr[i];
            }
            else
                lArr[i] = lArr[i-1];
        }
        for(int i=n-2; i>=0; i--){
            if(arr[i] > rArr[i+1]){
                rArr[i] = arr[i];
            }
            else
                rArr[i] = rArr[i+1];
        }
        
        long res = 0;
        for(int i=1; i<n-1; i++){
            res += (Math.min(lArr[i], rArr[i]) - arr[i]);
        }
        return res;
    } 
}

//Total Time Taken: 0.6/1.7