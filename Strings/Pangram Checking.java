/*
Pangram Checking 
Easy Accuracy: 51.81% Submissions: 19631 Points: 2

Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Example 1:
Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Explantion: In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.

Example 2:
Input:
S = sdfs
Output: 0
Explantion: In the given input, there
aren't all the letters present in the
English alphabet. Hence, the output
is 0.

Your Task:
You need to complete the function checkPangram() that takes a string as a parameter and returns true if the string is a pangram, else it returns false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 ≤ |S| ≤ 104*/

// { Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        int arr[] = new int[26];
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                arr[ch - 'a']++;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0; i<26; i++){
            if(arr[i] == 0)
                return false;
        }
        return true;
    }
}// { Driver Code Starts.

class GFG
 {
    public static void main (String[] args) throws IOException
     {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      while(t-->0)
      {
        String s=br.readLine().trim();
        
        System.out.println(new Solution().checkPangram (s)==true?1:0);
      }
      
     }
}  // } Driver Code Ends

//Total Time Taken: 0.2/1.2