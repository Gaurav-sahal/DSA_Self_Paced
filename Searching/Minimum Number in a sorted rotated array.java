/*
Minimum Number in a sorted rotated array 
Easy Accuracy: 46.82% Submissions: 26649 Points: 2

Given an array of distinct elements which was initially sorted. This array is rotated at some unknown point. The task is to find the minimum element in the given sorted and rotated array. 

Example 1:
Input:
N = 10
arr[] = {2,3,4,5,6,7,8,9,10,1}
Output: 1
Explanation: The array is rotated 
once anti-clockwise. So minium 
element is at last index (n-1) 
which is 1.

Example 2:
Input:
N = 5
arr[] = {3,4,5,1,2}
Output: 1
Explanation: The array is rotated 
and the minimum element present is
at index (n-2) which is 1.

Your Task:
The task is to complete the function minNumber() which takes the array arr[] and its starting and ending indices (low and high) as inputs and returns the minimum element in the given sorted and rotated array.

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).

Constraints:
1 <= N <= 107
1 <= arr[i] <= 107*/

// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            System.out.println(new Solution().minNumber(arr,0,n-1));
        }
    }
    
}// } Driver Code Ends

//``````````````````````````SOLUTION 1````````````````````````````````````````````
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        if(low == high) return arr[low];
        if(arr[low] < arr[high] && arr[low] < arr[low+1]) return arr[low];
        if(arr[high] < arr[low] && arr[high] < arr[high-1]) return arr[high];
        
        while(low <= high){
            int mid = (low+high)/2;
            if(low == high || arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1])
                return arr[mid];
            if(arr[low] > arr[high])
                if(arr[low] > arr[mid])
                    low = low + 1;
                else
                    low = mid + 1;
            else if(arr[low] < arr[high])
                high = mid - 1;
        }
        return -1;
    }
}

//``````````````````````````SOLUTION 2````````````````````````````````````````````
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        while(low <= high){
            if(low == high)
                return arr[low];
            if(arr[low] > arr[high])
                low++;
            else if(arr[low] < arr[high])
                high--;
        }
        return -1;
    }
}

//Total Time Taken: 0.2/1.1