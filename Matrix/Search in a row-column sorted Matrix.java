/*
Search in a row-column sorted Matrix 
Medium Accuracy: 52.29% Submissions: 32560 Points: 4

Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

Example 1:
Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.

Example 2:
Input:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
Output: 1
Explanation: 55 is present in the matrix.

Your Task:
You don't need to read input or print anything. Complete the function search() that takes n, m, x, and matrix[][] as input parameters and returns a boolean value. True if x is present in the matrix and false if it is not present.

Expected Time Complexity: O(N + M)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N, M <= 1000
1 <= mat[][] <= 105
1 <= X <= 1000*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int rows=sc.nextInt();
            int columns=sc.nextInt();
            
            int matrix[][]=new int[rows][columns];
          
            for(int i=0; i<rows;i++){            
                for(int j=0; j<columns;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            int target = sc.nextInt();
            
            Solution x = new Solution();
            
            if (x.search(matrix, rows, columns, target)) 
                System.out.println(1); 
            else
                System.out.println(0); 
            t--;
        }
    } 
}// } Driver Code Ends

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
    static boolean search(int matrix[][], int n, int m, int x) 
    {  
        // code here 
        int i=0, j=m-1;
        while(i<n && j<m){
            if(matrix[i][j] == x)
                return true;
            else if(matrix[i][j] < x)
                i++;
            else
                j--;
        }
        return false;
    } 
} 

//Total Time Taken: 1.8/2.8