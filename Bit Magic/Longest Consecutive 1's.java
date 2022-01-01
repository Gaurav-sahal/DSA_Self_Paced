/*
Longest Consecutive 1's 
Easy Accuracy: 57.61% Submissions: 20986 Points: 2

Given a number N. Find the length of the longest consecutive 1s in its binary representation.

Example 1:
Input: N = 14
Output: 3
Explanation: 
Binary representation of 14 is 
1110, in which 111 is the longest 
consecutive set bits of length is 3.

Example 2:
Input: N = 222
Output: 4
Explanation: 
Binary representation of 222 is 
11011110, in which 1111 is the 
longest consecutive set bits of length 4. 

Your Task: 
You don't need to read input or print anything. Your task is to complete the function maxConsecutiveOnes() which returns the length of the longest consecutive 1s in the binary representation of given N.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).*/

Constraints:
1 <= N <= 106

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        int res = 0, max = -1;
        while(n > 0){
            if((n & 1) == 1){
                res++;
                max = Math.max(res, max);
            }
            else{
                res = 0;
            }
            n = n >> 1;
        }
        return max;
    }
}
// { Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}
// } Driver Code Ends

//Total Time Taken: 1.3/2.7