/*
Exchange matrix columns 
Easy Accuracy: 68.26% Submissions: 7871 Points: 2

You are given a matrix of dimensions (n1 x m1). You have to exchange its first column with the last column.

Example 1:
Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15,16}}
Output: 
4 2 3 1 8 6 7 5 12 10 11 9 16 14 15 13
Explanation:
Matrix is as follow:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
After exchanging first column with 
last column, we have matrix as follows:
4 2 3 1
8 6 7 5
12 10 11 9
16 14 15 13
 
Example 2:
Input:
n1 = 2, m1 = 3
matrix[][] = {{4, 3, 2},
              {1, 5, 6}}
Output: 2 3 4 6 5 1
Explanation:
Matrix is as follows:
4 3 2
1 5 6
After exchanging columns matrix will be:
2 3 4
6 5 1

Your Task:
You don't need to take input or print anything. Complete the function exchangeColumns() that takes the matrix as input parameter and modifies it in place by exchanging its first column with its last column.

Expected Time Complexity: O(n1 * m1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n1, m1<= 100
0 <= arr[i] <= 100*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            int matrix[][] = new int[n1][m1];
            
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m1; j++)
                    matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ob.exchangeColumns(matrix);
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m1; j++)
                    System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            //swap(matrix[i][0], matrix[i][m-1]);
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][m-1];
            matrix[i][m-1] = temp;
        }
    }
}

//Total Time Taken: 1.7/3.0