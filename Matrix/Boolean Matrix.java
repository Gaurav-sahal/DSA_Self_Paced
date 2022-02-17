/*
Boolean Matrix 
Medium Accuracy: 50.0% Submissions: 22729 Points: 4

Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.

Example 1:
Input:
R = 2, C = 2
matrix[][] = {{1, 0},
              {0, 0}}
Output: 
1 1
1 0 
Explanation:
Only cell that has 1 is at (0,0) so all 
cells in row 0 are modified to 1 and all 
cells in column 0 are modified to 1.

Example 2:
Input:
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}}
Output: 
1 1 1
1 1 1
1 1 1
1 0 0 
Explanation:
The position of cells that have 1 in
the original matrix are (0,0), (1,0)
and (2,0). Therefore, all cells in row
0,1,2 are and column 0 are modified to 1. 

Your Task:
You dont need to read input or print anything. Complete the function booleanMatrix() that takes the matrix as input parameter and modifies it in-place.
 
Expected Time Complexity: O(R * C)
Expected Auxiliary Space: O(R + C) 
 
Constraints:
1 ≤ R, C ≤ 1000
0 ≤ matrix[i][j] ≤ 1*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        
        int mat[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(matrix[i][j] == 1){
                    for(int k=0; k<n; k++){
                        mat[k][j] = 1;
                    }
                    for(int k=0; k<m; k++){
                        mat[i][k] = 1;
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = mat[i][j];
            }
        }
    }
}

//Total Time Taken: 2.0/2.5