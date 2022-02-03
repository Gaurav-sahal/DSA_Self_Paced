/*
Binary Array Sorting 
Basic Accuracy: 50.4% Submissions: 32733 Points: 1

Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.
 
Example 1:
Input: 
5
1 0 1 1 0
Output: 
0 0 1 1 1
Explanation: 
After arranging the elements in 
increasing order, elements will be as 
0 0 1 1 1.

Example 2:
Input:
10
1 0 1 1 1 1 1 0 0 0
Output: 
0 0 0 0 1 1 1 1 1 1
Explanation: 
After arranging the elements in 
increasing order, elements will be 
0 0 0 0 1 1 1 1 1 1.

Your Task: This is a function problem. You only need to complete the function binSort() that takes the array A[] and it's size N as parameters and sorts the array. The printing is done automatically by the driver code.

Expected Time Complexity: O(N)
Expected Auxilliary Space: O(1)

Constraints:
1 <= N <= 106
0 <= A[i] <= 1*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)       {
            
            String st[] = read.readLine().trim().split(" ");
            
            //reading size of array 
            int N =Integer.parseInt(st[0]);
            
            //creating a new array of size n
            int A[] = new int[N];
            st = read.readLine().trim().split(" ");
            
            //adding elements to the array
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(st[i]);
                
            //calling the method binSort() of
            //class BinarySort()
            new Solution().binSort(A, N);
            
            //printing the elements of array
            for(Integer x: A)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        
        
        /**************
        * No need to print the array
        * ************/
        int index = -1;
        for(int i=0; i<N; i++){
            if(A[i] == 0){
                index++;
                int temp = A[i];
                A[i] = A[index];
                A[index] = temp;
            }
        }
    }
}

//Total Time Taken: 9.2/11.8