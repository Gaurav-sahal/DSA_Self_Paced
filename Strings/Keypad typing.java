/*
Keypad typing 
Basic Accuracy: 65.37% Submissions: 10589 Points: 1

You are given a string S of alphabet characters and the task is to find its matching decimal representation as on the shown keypad. Output the decimal representation corresponding to the string. For ex: if you are given “amazon” then its corresponding decimal representation will be 262966.

Example 1:
Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.

Example 2:
Input:
S = geeksquiz
Output: 433577849
Explanation: geeksquiz is 433577849 in
decimal when we type it using the given
keypad.

Your Task:
Complete printNumber() function that takes string s and its length as parameters and returns the corresponding decimal representation of the given string as a string type. The printing is done by the driver code.

Constraints:
1 ≤ length of String ≤ 100

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)*/

// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

 // } Driver Code Ends
//User function Template for Java
//Function to find matching decimal representation of a string as on the keypad.

public static String printNumber(String s, int n) 
{
    //Your code here
    String res = "";
    for(int i=0; i<n; i++){
        char ch = s.charAt(i);
        if(ch == 'a' || ch == 'b' || ch == 'c')
            res = res + 2;
        if(ch == 'd' || ch == 'e' || ch == 'f')
            res = res + 3;
        if(ch == 'g' || ch == 'h' || ch == 'i')
            res = res + 4;
        if(ch == 'j' || ch == 'k' || ch == 'l')
            res = res + 5;
        if(ch == 'm' || ch == 'n' || ch == 'o')
            res = res + 6;
        if(ch == 'p' || ch == 'q' || ch == 'r' || ch == 's')
            res = res + 7;
        if(ch == 't' || ch == 'u' || ch == 'v')
            res = res + 8;
        if(ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')
            res = res + 9;
    }
    return res;
}

//Total Time Taken: 4.9/7.2