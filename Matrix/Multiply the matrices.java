/*
Multiply the matrices 
Basic Accuracy: 49.32% Submissions: 17599 Points: 1

When dealing with matrices, you may, sooner or later, run into the elusive task of matrix multiplication. Here, we will try to multiply two matrices and hope to understand the process.
Two matrices A[][] and B[][] can only be multiplied if number of columns in A is equal to number of rows in B. The dimensions of the resultant matrix will have A's row size and B's column size.
Given two matrices A and B having (n1 x m1) and (n2 x m2) dimensions respectively. Multiply A and B. 

Example 1:
Input:
n1 = 3, m1 = 2
A[][] = {{4, 8},
         {0, 2}
         {1, 6}}
n2 = 2, m2 = 2
B[][] = {{5, 2},
         {9, 4}}
Output: 92 40 18 8 59 26
Explanation:
Matrices are of size 3 x 2 and 2 x 2 which 
results in 3 x 2 matrix with elements as:
res[][] = {{92, 40},
           {18, 8}
           {59, 26}}

Example 2:
Input:
n1 = 1, m1 = 1
A[][] = {2}
n2 = 1, m2 = 1
B[][] = {3}
Output: 6
Explanation: Both matrices are of size 1 x 1 
which results in 1 x 1 matrix having element 6.
 
Your Task:
You dont need to read input or print anything. Complete the function multiplyMatrix() that takes A and B as input parameters and returns a matrix containing their product. If the multiplication is not possible return an empty matrix.

Expected Time Complexity: O(N1 * M1 * M2)
Expected Auxiliary Space: O(N1 * M2) for resultant matrix. 

Constraints:
1 <= n1, m1, n2, m2 <= 30
0 <= Ai, Bi <= 100*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int A[][] = new int[n1][m1];
            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    A[i][j] = sc.nextInt();

            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            int B[][] = new int[n2][m2];
            for(int i = 0; i < n2; i++)
                for(int j = 0; j < m2; j++)
                    B[i][j] =sc.nextInt();

            Solution ob = new Solution();
            int ans[][] = ob.multiplyMatrix(A,B);
            if(ans.length == 0)
                System.out.println(-1);
            else
            {
                for(int i = 0; i < ans.length; i++)
                for(int j = 0; j < ans[0].length; j++)
                    System.out.print(ans[i][j] +" "); 
                System.out.println();
            }
        }
    }
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        // code here 
        int n1 = A.length, m1 = A[0].length;
        int n2 = B.length, m2 = B[0].length;
        if(m1 == n2){
            int mat[][] = new int[n1][m2];
            for(int i=0; i<n1; i++){
                for(int k=0; k<m2; k++){
                    int sum = 0;
                    for(int j=0; j<m1; j++){
                        sum += (B[j][k] * A[i][j]);
                    }
                    mat[i][k] = sum;
                }
            }
            return mat;
        }
        return new int[][]{{-1}};
    }
}

//Total Time Taken: 0.6/1.2
