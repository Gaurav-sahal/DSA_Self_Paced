/*
Sum of numbers in string 
Basic Accuracy: 55.45% Submissions: 21841 Points: 1

Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Example 1:
Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.

Example 2:
Input:
str = geeks4geeks
Output: 4
Explanation: 4 is the only number, so the
sum is 4.

Your Task:
The task is to complete the function findSum() which finds and returns the sum of numbers in the string.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= length of the string <= 105
Sum of Numbers <= 105*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
	}
}
// } Driver Code Ends

class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        long res = 0; String temp = "0";
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                temp += ch;
            }
            else{
                res += Long.parseLong(temp);
                temp = "0";
            }
        }
        res += Long.parseLong(temp);
        return res;
    }
    
}

//Total Time Taken: 0.3/1.5