/*
Check if a string is Isogram or not 
Basic Accuracy: 55.24% Submissions: 27626 Points: 1

Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.

Example 1:
Input:
S = machine
Output: 1
Explanation: machine is an isogram
as no letter has appeared twice. Hence
we print 1.

Example 2:
Input:
S = geeks
Output: 0
Explanation: geeks is not an isogram
as 'e' appears twice. Hence we print 0.

Your Task:
This is a function problem. You only need to complete the function isIsogram() that takes a string as a parameter and returns either true or false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= |s| <= 103*/

// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        }
	 }
}// } Driver Code Ends

class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        boolean visited[] = new boolean[26];
        for(int i=0; i<data.length(); i++){
            if(visited[data.charAt(i)-'a'])
                return false;
            visited[data.charAt(i)-'a'] = true;
        }
        return true;
    }
}

//Total Time Taken: 0.1/1.2