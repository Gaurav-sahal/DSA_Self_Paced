/*
Kth smallest element 
Medium Accuracy: 67.22% Submissions: 9270 Points: 4

Given an array arr[] of N positive integers and a number K. The task is to find the kth smallest element in the array.

Example 1:
Input: 
N = 5, K = 3
arr[] = {3,5,4,2,9}
Output: 
4
Explanation: 
Third smallest element in the array is 4.

Example 2:
Input:
N = 5, k = 5
arr[] = {4,3,7,6,5}
Output: 
7
Explanation: 
Fifth smallest element in the array is 7.

Your Task:
You  don't need to read inputs or print anything. Complete the method kthSmallest() which takes array arr[], size of the array n and value k as input parameters and returns kth smallest element.

Constraints:
1 <= N <= 106
1 <= arr[i] <= 106
1 <= K <= N

Array do not contains duplicates.
Expected Time Complexity: O(NlogK)
Expected Auxilliary Space: O(K)*/

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //Taking count of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking count of number elements
            int n = sc.nextInt();
            
            //taking the value of the k
            int k = sc.nextInt();
            
            //Creating an array of size n
            int arr[] = new int[n];
            
            //Inserting all the elements to the array
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            
            //calling kthSmallest method of class solve
            //and printing the result
            System.out.println(new Solution().kthSmallest(arr, n, k));
        }
        
    }
}// } Driver Code Ends

class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        // Your code here
        if(k > n) return -1;
        int l=0, h=n-1;
        //Arrays.sort(arr);
        while(l <= h){
            int p = partition(arr, n, l, h);
            if(p == k-1)
                return arr[p];
            else if(p < k-1)
                l = p+1;
            else
                h = p-1;
        }
        return -1;
    }
    
    public static int partition(int arr[], int n, int l, int h){
        int index = l;
        int pivot = arr[h];
        for(int i=l; i<h; i++){
            if(arr[i] < pivot){
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, h);
        return index;
    }
    
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//Total Time Taken: 1.6/3.7