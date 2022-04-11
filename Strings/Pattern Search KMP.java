/*
Pattern Search KMP 
Hard Accuracy: 74.44% Submissions: 5284 Points: 8
   
Given a string S and a pattern P of all lowercase characters. The task is to check if the pattern exists in the string or not.

Example 1:
Input:
S = aabaacaadaabaaba
P = aaaab
Output: No
Explanation: Given pattern is not found
in the given string S.

Example 2:
Input:
S = aabaacaadaabaaba
P = caada
Output: Yes
Explanation: Given pattern is found in
the given string S.

Your Task:
The task is to complete the function KMPSearch() which returns true or false depending on whether pattern is present in the string or not, and computeLPSArray() which computes the longest prefix suffix for every index.

Expected Time Complexity: O(N+M).
Expected Auxiliary Space: O(M).
Note: N = |S|, M = |P|.

Constrsaints:
1 <= |S|, |P| <= 104*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", pat = "";
            s= sc.next();
            pat = sc.next();
            
            if(new match().KMPSearch(pat, s) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}// } Driver Code Ends
//User function Template for Java

class match
{
    //Function to fill lps[] for given patttern pat[0..M-1]. 
    void computeLPSArray(String pat, int M, int lps[]) 
    { 
	    // Your code here
	    int len = 0;
	    lps[len] = 0;
	    for(int i=1; i<M; ){
	        if(pat.charAt(i) == pat.charAt(len)){
	            len++;
	            lps[i] = len;
	            i++;
	        }
	        else{
	            if(len == 0){
	                lps[i] = 0;
                    i++;	                
	            }
	            else
	                len = lps[len-1];
	        }
	    }
    }
    
    //Function to check if the pattern exists in the string or not.
    boolean KMPSearch(String pat, String txt)
    {
        // Your code here
        int n = pat.length();
        int m = txt.length();
        int lps[] = new int[n];
        computeLPSArray(pat, n, lps);
        int i=0, j=0;
        while(i < m){
            if(pat.charAt(j) == txt.charAt(i)){
                j++;
                i++;
                if(j == n) return true;
            }
            else{
                if(j == 0)
                    i++;
                else
                    j = lps[j-1];
            }
        }
        return false;
    }
}

//Total Time Taken: 0.43/1.71