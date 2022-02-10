/*
Closet 0s 1s and 2s 
Easy Accuracy: 61.22% Submissions: 9810 Points: 2

Given an array of 0s, 1s, and 2s. Arrange the array elements such that all 0s come first, followed by all the 1s and then, all the 2s.
Note: Do not use the inbuilt sort function.
 
Example 1:
Input: N = 5, arr[] = {0, 2, 1, 2, 0}
Output: 0 0 1 2 2

Example 2:
Input: N = 3, arr[] = {0, 1, 0}
Output: 0 0 1

Your Task:
You don't need to read input or print anything. Your task is to complete the function segragate012() which takes the array arr[] and the size of the array as inputs and updates the array arr[] such that all the 0s come before the 1s and all the 1s come before the 2s.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
0 <= Ai <= 2*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Main
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
		    new Solution().segragate012(arr, n);
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.
    
    // arr[]: Input Array
    // N: Size of the Array arr[]
    //Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int arr[], int N){
        // Your Code Here
        //Lomuto Approach
        int l=0, m=0, h=N-1;
        while(m <= h){
            if(arr[m] == 0){
                //swap(arr[m], arr[l]);
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                l++;
                m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else if(arr[m] == 2){
                //swap(arr[m], arr[h]);
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }
}

//Total Time Taken: 1.2/2.7