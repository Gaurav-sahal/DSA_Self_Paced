/*
Repeating Character - First Appearance Leftmost 
Basic Accuracy: 58.48% Submissions: 10341 Points: 1

You are given a string S (both uppercase and lowercase characters). You need to print the repeated character whose first appearance is leftmost.

Example 1:
Input:
S = geeksforgeeks
Output: g
Explanation: We see that both e and g
repeat as we move from left to right.
But the leftmost is g so we print g.

Example 2:
Input:
S = abcd
Output: -1
Explanation: No character repeats so
we print -1.

Your Task:
This is a function problem. You only need to complete the function repeatedCharacter() that takes a string as a parameter and returns the index of the character. If no character repeats then return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 <= |S| <= 100*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String str = sc.next();
            int index = new Solution().repeatedCharacter(str);
            if(index == -1)
                System.out.println("-1");
            else
                System.out.println(str.charAt(index));
        }
    }
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static int CHAR = 256;
    static int repeatedCharacter(String S)
    {
        // add your code here
        int res = -1;
        boolean arr[] = new boolean[CHAR];
        for(int i=S.length()-1; i>=0; i--){
            if(arr[S.charAt(i)])
                res = i;
            else{
                arr[S.charAt(i)] = true;
            }
        }
        return res;
    }
}

//Total Time Taken: 0.2/1.3