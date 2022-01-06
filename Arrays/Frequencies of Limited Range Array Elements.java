/*
Frequencies of Limited Range Array Elements 
Easy Accuracy: 47.5% Submissions: 75173 Points: 2

Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting.

Example 1:
Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.

Example 2:
Input:
N = 4
arr[] = {3,3,3,3}
P = 3
Output:
0 0 4 0
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 0 times.
3 occurring 4 times.
4 occurring 0 times.

Your Task:
Complete the function frequencycount() that takes the array and n as input parameters and modify the array in place to denote the frequency count of each element from 1 to N. i,e element at index 0 should represent the frequency of 1 and so on.

Note: Can you solve this problem without using extra space (O(1) Space) !

Constraints:
1 ≤ N ≤ 105
1 ≤ P ≤ 4*104 
1 <= A[i] <= P*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int arr1[] = new int[N];
        for(int i=0; i<N; i++)
            arr1[i] = 0;
        for(int i=0; i<N; i++){
            int j = arr[i];
            if(j <= N)
                arr1[j-1]++; 
        }
        for(int i=0; i<N; i++)
            arr[i] = arr1[i];
    }
}

//Total Time Taken: 3.4/10.6