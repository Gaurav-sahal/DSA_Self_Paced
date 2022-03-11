/*
Pattern Search 
Easy Accuracy: 58.77% Submissions: 10485 Points: 2

Given a string S and a pattern P consisting of lowercase characters. The task is to check if pattern P exists in the given string S or not.
 
Example 1:
Input:
S = abceabcdabceabcd
P = abcd
Output: Yes
Explanation: Given pattern abcd is
present at index 4.

Example 2:
Input:
S = abceabcdabceabcd
P = gfhij
Output: No
Explanation: Given pattern gfhij is
not found in the string.

Your Task:
The task is to complete the function search() which finds for the pattern with distinct characters. The function takes string and pattern as parameters and returns either true or false. Return true if pattern is found else return false.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Note: N = |S|, M = |P|.

Constraints:
1 <= |S|, |P| <= 103*/

// { Driver Code Starts
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
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            Solution obj = new Solution();
            
            if(obj.search(p, s) == true)
              System.out.println("Yes");
             else
              System.out.println("No");
            
        }
    }
}// } Driver Code Ends

class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
        // Your code here
        int n = txt.length();
        int m = pat.length();
        for(int i=0; i<=n-m; ){
            //boolean flag = false;
            int j;
            for(j=0; j<m; j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    //flag = true;
                    break;
                }
            }
            if(j == m)                //if(!flag)
                return true;
            if(j == 0)
                i++;
            else
                i = i+j;
        }
        return false;
    }
}

//Total Time Taken: 0.4/1.6