/*
Reversing the columns of a Matrix 
Easy Accuracy: 71.48% Submissions: 7288 Points: 2

Given a matrix of dimensions n1 x m1. Reverse its columns in-place such that the last column will become the first column and so on. 

Example 1:
Input:
n1 = 4, m1 = 3
matrix[][] = {{ 1,  2,  3},
              { 5,  6,  7},
              {11, 10,  9},
              {13, 14, 15}}
Output: 3 2 1 7 6 5 9 10 11 15 14 13
Explanation:
Array after exchanging columns:
3 2 1
7 6 5
9 10 11
15 14 13

Example 2:
Input:
n1 = 2, m1 = 5
matrix[][] = {{ 1, 2, 3, 4, 5},
              { 6, 7, 8, 9, 10}}
Output: 5 4 3 2 1 10 9 8 7 6
Explanation:
After reversing the column of matrix
 5 4 3 2 1
10 9 8 7 6
Your Task:
You dont need to read input or print anything. Complete the function reverseCol() that takes matrix as input parameter and modifies it in-place such that the last column will become the first column and so on. 

Expected Time Complexity: O(n1 * m1)
Expected Auxiliary Space: O(1) 

Constraints:
1 <= n1, m1 <= 100
0 <= matrix[i][j] <= 1000*/

// { Driver Code Starts
import java.io.*;
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
                for(int j = 0; j < m1; j++)
                    matrix[i][j] = sc.nextInt();

            Solution ob = new Solution();
            ob.reverseCol(matrix);

            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m/2; j++){
                //swap(matrix[i][j], matrix[i][m-1-j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-1-j];
                matrix[i][m-1-j] = temp;
            }
        }
    }
}

//Total Time Taken: 1.8/3.1