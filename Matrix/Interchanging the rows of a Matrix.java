/*
Interchanging the rows of a Matrix 
Easy Accuracy: 75.52% Submissions: 6989 Points: 2

Given a matrix of dimensions n1 x m1. Interchange its rows in-place such that the first row will become the last row and so on. 

Example 1:
Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12},
             {13, 14, 15,16}}
Output: 
13 14 15 16 9 10 11 12 5 6 7 8 1 2 3 4
Explanation:
Matrix after exchanging rows:
13 14 15 16
 9 10 11 12
 5  6  7  8
 1  2  3  4
Note: Output is printed row-wise linearly. 

Example 2:
Input:
n1 = 5, m1 = 3
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
matrix[][] = {{1, 2, 3},
             {4, 5, 6},
             {7, 8, 9},
             {10, 11, 12},
             {13, 14, 15}}
Output: 
13 14 15 10 11 12 7 8 9 4 5 6 1 2 3
Explanation:
After interchanging rows:
13 14 15
10 11 12
 7  8  9
 4  5  6
 1  2  3

Your Task:
You dont need to read input or print anything. Complete the function interchangeRows() that takes matrix as input parameter and modifies the matrix in-place such that the first row becomes the last row and so on.

Expected Time Complexity: O(n1 * m1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n1, m1 <= 100
1 <= matrix[i][j] <= 1000*/

// { Driver Code Starts
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
            ob.interchangeRows(matrix);

            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends

class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n/2; i++){
            for(int j=0; j<m; j++){
                //swap(matrix[i][j], matrix[n-1-i][j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }
    }
}

//Total Time Taken: 1.6/3.1