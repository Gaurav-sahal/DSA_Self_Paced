/*
Maximum Occuring Character 
Basic Accuracy: 50.0% Submissions: 26726 Points: 1

Given a string str. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:
Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.

Example 2:
Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.

Your Task:
The task is to complete the function getMaxOccuringChar() which returns the character which is most occurring.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |s|

Constraints:
1 ≤ |s| ≤ 100*/

// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}// } Driver Code Ends

class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        char res = 'a';
        int max = -1;
        int alphabets[] = new int[256];
        for(int i=0; i<line.length(); i++){
             alphabets[line.charAt(i)]++;
        }
        for(int i=0; i<256; i++){
            if(max < alphabets[i]){
                max = alphabets[i];
                res = (char)i;
            }
        }
        return res;
    }
}

//Total Time Taken: 0.1/1.1