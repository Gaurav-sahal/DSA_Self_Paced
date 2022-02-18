/*
Make Matrix Beautiful 
Medium Accuracy: 62.48% Submissions: 8748 Points: 4

A beautiful matrix is a matrix in which the sum of elements in each row and column is equal.
Given a square matrix of size NxN. Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the value of any one cell by 1.

Example 1:
Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 4
Explanation:
Updated matrix:
4 3
3 4
1. Increment value of cell(0, 0) by 3
2. Increment value of cell(0, 1) by 1
Hence total 4 operation are required.

Example 2:
Input:
N = 3
matrix[][] = {{1, 2, 3},
              {4, 2, 3},
              {3, 2, 1}}
Output: 6
Explanation:
Original matrix is as follows:
1 2 3
4 2 3
3 2 1
We need to make increment in such a way 
that each row and column has one time 2, 
one time 3 , one time 4. For that we 
need 6 operations.

Your Task: 
You don't need to read input or print anything. Complete the function findMinOpeartion() that takes matrix and n as input parameters and returns the minimum number of operations.

Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 100
1 <= matrix[i][j] <= 200*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
             int matrix[][] = new int[n][n];
            String str[] = read.readLine().trim().split("\\s+");
            int k =0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] = Integer.parseInt(str[k++]);
            }
            Solution ob = new Solution();
            System.out.println(ob.findMinOperation(matrix,n));
        }
    }
}
// } Driver Code Ends

class Solution 
{
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    static int findMinOperation(int matrix[][], int n)
    {
        // code here 
        int matrixSum = 0;
        int maxRowSum = 0;
        int maxColSum = 0;
        
        for(int i=0; i<n; i++){
            int rowSum = 0, colSum = 0;
            
            for(int j=0; j<n; j++){
                matrixSum += matrix[i][j];
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            maxRowSum = Math.max(maxRowSum, rowSum);
            maxColSum = Math.max(maxColSum, colSum);
        }
        int maxSum = Math.max(maxRowSum, maxColSum);
        
        return (maxSum * n) - matrixSum;
    }
}

//Total Time Taken: 0.6/1.1