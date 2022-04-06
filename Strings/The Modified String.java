/*
The Modified String 
Easy Accuracy: 50.08% Submissions: 13296 Points: 2
   
Ishaan is playing with strings these days. He has found a new string. He wants to modify it as per the following rules to make it valid:
The string should not have three consecutive same characters (Refer example for explanation).
He can add any number of characters anywhere in the string. 
Find the minimum number of characters which Ishaan must insert in the string to make it valid.

Example 1:
Input:
S = aabbbcc
Output: 1
Explanation: In aabbbcc 3 b's occur
consecutively, we add a 'd',and Hence,
output will be aabbdbcc.

Example 1:
Input:
S = aaaaa
Output: 2
Explanation:  In aaaaa 5 a's occur
consecutively,we need to add 2 'b', and
Hence, the output will be aababaa.

Your Task:
This is a function problem. You only need to complete the function modified() that returns the answer.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints : 
1 <= Length of S <= 105*/

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            String a = "";
            a = sc.next();
            System.out.println(new Solution().modified(a));
        }
    }
}// } Driver Code Ends

class Solution
{
    //Function to find minimum number of characters which Ishaan must insert  
    //such that string doesn't have three consecutive same characters.
    public static long modified(String a)
    {
        // Your code here
        long count = 0;
        for(int i=0; i<a.length()-2; ){
            if(a.charAt(i) == a.charAt(i+1) && a.charAt(i+1) == a.charAt(i+2)){
                count++;
                i = i+2;
            }
            else
                i++;
        }
        return count;
    }
}

//Total Time Taken: 0.48/1.88