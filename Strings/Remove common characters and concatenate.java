/*
Remove common characters and concatenate 
Basic Accuracy: 47.72% Submissions: 18036 Points: 1

Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.

Example 1:
Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.

Example 2:
Input:
s1 = abcs
s2 = cxzca
Output: bsxz
Explanation: The common characters of s1
and s2 are: a,c. The uncommon characters
of s1 and s2 are b,s,x and z. Thus the
modified string with uncommon characters
concatenated is bsxz.

Your Task:
The task is to complete the function concatenatedString() which removes the common characters, concatenates, and returns the string. If all characters are removed then return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |Length of Strings|

Constraints: 
1 <= |Length of Strings| <= 104*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}
// } Driver Code Ends

class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        int alphabets[] = new int[256];
        for(int i=0; i<s1.length(); i++){
            alphabets[s1.charAt(i)] = 1;
        }
        for(int i=0; i<s2.length(); i++){
            if(alphabets[s2.charAt(i)] == 1)
                alphabets[s2.charAt(i)] = -1;
            else if(alphabets[s2.charAt(i)] == 0)
                alphabets[s2.charAt(i)] = 2;
        }
        String str = "";
        for(int i=0; i<s1.length(); i++)
            if(alphabets[s1.charAt(i)] > 0)
                str += s1.charAt(i);
        for(int i=0; i<s2.length(); i++)
            if(alphabets[s2.charAt(i)] > 0)
                str += s2.charAt(i);
        if(str.length() == 0) return "-1";
        return str;
    }
}

//Total Time Taken: 0.8/2.3