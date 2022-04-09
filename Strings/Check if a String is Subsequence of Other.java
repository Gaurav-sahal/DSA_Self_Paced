/*
Check if a String is Subsequence of Other 
Medium Accuracy: 68.17% Submissions: 5079 Points: 4
   
Given two strings A and B, find if A is a subsequence of B. A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.

Example 1:
Input:
A = AXY 
B = YADXCP
Output: False
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.

Example 2:
Input:
A = gksrek
B = geeksforgeeks
Output: True
Explanation: A is a subsequence of B.
 
Your Task:  
You dont need to read input or print anything. Complete the function isSubSequence() which takes A and B as input parameters and returns a boolean value denoting if A is a subsequence of B or not. 

Expected Time Complexity: O(N) where N is length of string B.
Expected Auxiliary Space: O(1)

Constraints:
1<= |A|,|B| <=106*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{

    public static void main (String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().split(" ");
            String A = S[0];
            String B = S[1];
            Solution ob = new Solution();
            boolean ans = ob.isSubSequence(A,B);
            if(ans)
                System.out.println("True");
            else
                System.out.println("False");
       }
    }
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String A, String B)
    {
        //code here
        int i=0, j=0;
        for( ;i < B.length(); i++){
            if(B.charAt(i) == A.charAt(j)){
                j++;
            }
            if(j == A.length())
                return true;
        }
        return false;
    }
};

//Total Time Taken: 0.3/1.46