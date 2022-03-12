/*
Anagram 
Easy Accuracy: 50.99% Submissions: 69483 Points: 2

Given two stringsaandbconsisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

Example 1:
Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have samecharacters with
        same frequency. So, both are anagrams.

Example 2:
Input:a = allergy, b = allergic
Output: NO
Explanation:Characters in both the strings are 
        not same, so they are not anagrams.

Your Task:
You don't need to read input or print anything.Yourtask is to complete the functionisAnagram() which takes the string a and string b as input parameterand checkif the two strings are an anagram of each other. The functionreturns trueif the strings are anagram else itreturns false.

Expected Time Complexity:O(|a|+|b|).
Expected Auxiliary Space:O(Number of distinct characters).
Note: |s| represents the length of string s.

Constraints:
1 ≤ |a|,|b| ≤ 105*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
        public static void main (String[] args)throws IOException {
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t = Integer.parseInt(br.readLine());
                while(t-->0)
                {
                    String str = br.readLine();
                    String s1 = str.split(" ")[0];
                    String s2 = str.split(" ")[1];
                    
                    Solution obj = new Solution();
                    
                    if(obj.isAnagram(s1,s2))
                    {
                        System.out.println("YES");
                    }
                    else
                    {
                         System.out.println("NO");
                    }
                }
        }
}// } Driver Code Ends

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int charCount[] = new int[256];
        int n = a.length();
        int m = b.length();
        if(n != m)
            return false;
        for(int i=0; i<n; i++){
            charCount[a.charAt(i)]++;
            charCount[b.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(charCount[i] != 0)
                return false;
        }
        return true;
    }
}

//Total Time Taken: 0.3/1.1