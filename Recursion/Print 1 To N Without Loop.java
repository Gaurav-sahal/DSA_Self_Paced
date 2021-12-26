/*Print 1 To N Without Loop 

School Accuracy: 51.9% Submissions: 46196 Points: 0
Print numbers from 1 to N without the help of loops.

Example 1:
Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10

Example 2:
Input:
N = 5
Output: 1 2 3 4 5
 
Your Task:
This is a function problem. You only need to complete the function printNos() that takes N as parameter and prints number from 1 to N recursively. Don't print newline, it will be added by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraints:
1 <= N <= 105*/

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    //creating an object of class Print
		    Solution obj=new Solution();
		    int N;
		    
		    //input N
		    N=sc.nextInt();
		    
		    //calling printNos() methdo
		    //of class Print
		    obj.printNos(N);
		    System.out.println();
		}		
	}
}

// } Driver Code Ends
//User function Template for Java

class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        if(N == 0) return;
        
        printNos(N-1);
        System.out.print(N+" ");
    }
}

//Total Time Taken: 0.6/1.8