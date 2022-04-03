/*
Reverse words in a given string 
Easy Accuracy: 50.0% Submissions: 83301 Points: 2

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:
Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

Example 2:
Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:
You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1 <= |S| <= 2000*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String str[] = S.split("\\.");
        int n = str.length;
        for(int i=0; i<n/2; i++){
            String temp = str[i];
            str[i] = str[n-i-1];
            str[n-i-1] = temp;
        }
        //System.out.println(Arrays.toString(str));
        String s = "";
        for(int i=0; i<n; i++){
            if(i == n-1)
                s += str[i];
            else
                s += str[i] + ".";
        }
        return s;
    }
}

//Total Time Taken: 0.7/1.8