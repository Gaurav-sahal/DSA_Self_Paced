/*
Minimum indexed character 
Easy Accuracy: 50.58% Submissions: 26985 Points: 2

Given a string str and another string patt. Find the first position (considering 0-based indexing) of the character in patt that is present at the minimum index in str.

Example 1:
Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is first found in patt "set". First Position
of e in str is 1. 

Example 2:
Input:
str = adcffaet
patt = onkl
Output: -1
Explanation: There are none of the
characters which is common in patt
and str.

Your Task:
You only need to complete the function minIndexChar() that returns the index of answer in str or returns -1 in case no character of patt is present in str.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 ≤ |str|,|patt| ≤ 105 
'a' <= stri, patti <= 'z'*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int alphabets[] = new int[26];
        for(int i=0; i<26; i++)
            alphabets[i] = -1;
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(alphabets[idx] == -1)
                alphabets[idx] = i;
            else
                alphabets[idx] = (alphabets[idx] < i) ? alphabets[idx] : i;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<patt.length(); i++){
            int idx = patt.charAt(i) - 'a';
            if(alphabets[idx] != -1){
                res = Math.min(res, alphabets[idx]);
            }
        }
        if(res == Integer.MAX_VALUE) return -1;
        return res;
    }
}// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}// } Driver Code Ends

//Total Time Taken: 0.4/1.8