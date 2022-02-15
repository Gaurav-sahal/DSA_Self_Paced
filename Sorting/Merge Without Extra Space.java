/*
Merge Without Extra Space 
Hard Accuracy: 44.55% Submissions: 87838 Points: 8

Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 
Example 1:
Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.

Example 2:
Input: 
n = 2, arr1[] = [10, 12] 
m = 3, arr2[] = [5 18 20]
Output: 
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays 
we get 5 10 12 18 20.

Your Task:
You don't need to read input or print anything. You only need to complete the function merge() that takes arr1, arr2, n and m as input parameters and modifies them in-place so that they look like the sorted merged array when concatenated.
 
Expected Time Complexity:  O((n+m) log(n+m))
Expected Auxilliary Space: O(1)
 
Constraints:
1 <= n, m <= 5*104
0 <= arr1i, arr2i <= 107*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                swap(arr1, arr2, i, j);
                //Arrays.sort(arr2);
                long min = arr2[0];
                int k=1;
                while(k<m){
                    boolean flag = false;
                    if(arr2[k] < min){
                        flag = true;
                        arr2[k-1] = arr2[k];
                        k++;
                    }
                    if(!flag) break;
                }
                arr2[k-1] = min;
                i++;
            }
        }
    }
    
    public static void swap(long arr1[], long arr2[], int i, int j){
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}

//Total Time Taken: 1.9/2.3