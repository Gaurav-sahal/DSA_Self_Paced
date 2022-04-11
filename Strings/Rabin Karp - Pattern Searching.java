/*
Rabin Karp - Pattern Searching 
Medium Accuracy: 51.48% Submissions: 8175 Points: 4
   
Given a string S and a pattern P of lowercase characters. The task is to check if the pattern is present in string or not.

Example 1:
Input:
S = aabaacaadaabaaba
P = aaba
Output: Yes
Explanation: You can find the patter at
starting at index 12.

Example 2:
Input:
S = aabaacaadaabaaba
P = asdfa
Output: No
Explanation: Pattern doesn't exist in
the given string S.

Your Task:
You need to complete the function search which takes 3 arguments(S, P and prime q) and returns true if the pattern is found else returns false.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Note: N = |S|, M = |P|.

Constraints:
1 <= |S|, |P| <= 104*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- >0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            int q = 101;
            
            match obj = new match();
            
            if(obj.search(p, s, q) == true)
             System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}// } Driver Code Ends
//User function Template for Java

class match
{
    static int d= 256;
    //Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q)
    {
        // Your code here
        int n = pat.length();
        int m = txt.length();
        int mul = 1;
        for(int i=0; i<n-1; i++){
            mul = (mul * d) % q;
        }
        int pattern = 0, text = 0;
        for(int i=0; i<n; i++){
            pattern = ((pattern * d) + pat.charAt(i)) % q;
            text = ((text * d) + txt.charAt(i)) % q;
        }
        for(int i=0; i<=m-n; i++){
            if(pattern == text){
                int j=0;
                for(; j<n; j++){
                    if(pat.charAt(j) != txt.charAt(i+j))
                        break;
                }
                if(j == n) return true;
            }
            if(i < m-n){
                text = (((text - (txt.charAt(i)*mul)) * d) + txt.charAt(i+n))%q;
                if(text < 0)
                    text = text + q;
            }
        }
        return false;
    }
}

//Total Time Taken: 0.41/1.71