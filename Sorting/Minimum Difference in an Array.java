/*
Minimum Difference in an Array 
Easy Accuracy: 84.42% Submissions: 3293 Points: 2

Given a array of size n, find the minimum difference between any pair of elements in given array.

Example 1:
Input: 
Arr = [2, 4, 5, 9, 7]
Output: 
1
Explanation: Difference between 5 and 4 is 1.

Example 2:
Input: 
Arr = [3, 10, 8, 6]
Output: 
2
Explanation: Difference between 8 and 6 is 2.

Your Task:  
You don't need to read or print anything. Your task is to complete the function MinimumDifference() which takes the array and its size as input parameters and returns the minimum difference  between any pair in given array.
 
Expected Time Compelxity: O(n* log(n))
Expected Space Complexity: O(1)

Constraints:
1 <= n <= 105
1 <= Arr[i] <= 109*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-- > 0){
	    int n = sc.nextInt();
	    int[] arr = new int[n]; 
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    Solution ob = new Solution();
	    int diff = ob.MinimumDifference(arr, n);
	    System.out.println(diff);
	}
}
}// } Driver Code Ends
//User function Template for Java

class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        return min;
    }
};

//Total Time Taken: 1.0/2.4