/*
Count Inversions 
Medium Accuracy: 39.43% Submissions: 100k+ Points: 4

Given an array of integers. Find the Inversion Count in the array. 
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 
Example 1:
Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).

Example 2:
Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.

Example 3:
Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.

Your Task:
You don't need to read input or print anything. Your task is to complete the function inversionCount() which takes the array arr[] and the size of the array as inputs and returns the inversion count of the given array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long res = mergeSort(arr, 0, (int)N-1);
        //System.out.println(Arrays.toString(arr));
        return res;
    }
    
    static long mergeSort(long arr[], int l, int h){
        long res = 0;
        if(l<h){
            int mid = l + (h-l)/2;
            res += mergeSort(arr, l, mid);
            res += mergeSort(arr, mid+1, h);
            res += merge(arr, l, mid, h);
        }
        return res;
    }
    
    static long merge(long arr[], int l, int m, int h){
        int n1 = m-l+1, n2 = h-m;
        long arr1[] = new long[n1];
        long arr2[] = new long[n2];
        for(int i=0; i<n1; i++){
            arr1[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++){
            arr2[i] = arr[m+i+1];
        }
        int i=0, j=0, idx=l;
        long res=0;
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                arr[idx++] = arr1[i++];
            }
            else{
                arr[idx++] = arr2[j++];
                res += n1-i;
            }
        }
        while(i<n1)
            arr[idx++] = arr1[i++];
        while(j<n2)
            arr[idx++] = arr2[j++];
        return res;
    }
}

//Total Time Taken: 1.4/3.5