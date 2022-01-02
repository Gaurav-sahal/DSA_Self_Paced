/*
Gray to Binary equivalent 
Basic Accuracy: 64.01% Submissions: 11422 Points: 1

Given N in Gray Code, find its binary equivalent. Return the decimal representation of the binary equivalent.

Example 1:
Input: N = 4
Output: 7
Explanation:
Given 4 representing gray code 110.
Binary equivalent of gray code 110 is 100.
Return 7 representing gray code 100.

Example 2:
Input: N = 15
Output: 10
Explanation:
Given 15 representing gray code 1000.
Binary equivalent of gray code 1000 is 1111.
Return 10 representing gray code 1111 
ie binary 1010.

Example 3:
Input: N = 0
Output: 0
Explanation: 
Zero remains the same in all systems.

Your Task: 
You don't need to read input or print anything. Your task is to complete the function grayToBinary() which accepts an integer n as an input parameter and returns decimal of the binary equivalent of the given gray code. 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Constraints:
0 <= N <= 108*/

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int res = n;    // 4 = 100
        while(n > 0){   
            n = n >> 1;     // 010, 001
            res = res ^ n;  // 100 ^ 010, 110 ^ 001
        }
        return res;
    }
       
}
// { Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}
  // } Driver Code Ends

//Total Time Taken: 1.3/2.6