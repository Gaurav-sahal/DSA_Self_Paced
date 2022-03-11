/*
Naive Pattern Search 
Easy Accuracy: 50.09% Submissions: 16241 Points: 2

Given a string S and a pattern P both of lowercase characters. The task is to check if the given pattern exists in the given string or not.

Example 1:
Input:
S = aabaacaadaabaaabaa
P = aaba
Output: Yes
Explanation: Given pattern aaba is found
in the string at index 0.

Example 2:
Input:
S = aabaacaadaabaaabaa
P = ccda
Output: No
Explanation: Given pattern ccda doesn't
exists in the string at all.

Your Task:
The task is to complete the function search() which finds the pattern in the given string. The function takes pattern and string as parameters and returns either true or false. Return true if pattern exists else return false.

Expected Time Complexity: O(N*M).
Expected Auxiliary Space: O(1).
Note: N = |S|, M = |P|.

Constraints:
1 <= |S|, |P| <= 103*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

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
            
            if(obj.search(p, s) ==  true)
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
            int n = txt.length(), m = pat.length();
            for(int i=0; i<=n-m; i++){
                boolean flag = false;
                for(int j=0; j<m; j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                    return true;
            }
            return false;
    }
    
}

//Total Time Taken: 0.4/1.7