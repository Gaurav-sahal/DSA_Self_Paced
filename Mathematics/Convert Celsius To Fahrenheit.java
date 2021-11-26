/*Convert Celsius To Fahrenheit 
Basic Accuracy: 63.37% Submissions: 34657 Points: 1
Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Example 1:

Input:
C = 32
Output: 89
Explanation: Using the conversion 
formula of celsius to farhenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.
Example 2:

Input:
50
Output: 122
Explanation: Using the conversion 
formulaof celsius to farhenheit, it
can be calculated that, for 50 degree
C, the temperature in Fahrenheit = 122.

Your Task:
You don't need to read input or print anything. Your task is to complete the function CtoF() that takes C as parameter and returns temperature in fahrenheit( in double). The flooring and printing is automatically done by the driver code.

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)

Constraints:
1 <= C <= 104*/

//Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input number of testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int C;
		    C=sc.nextInt();//input temperature in celscius
		    
		    System.out.println((int)(obj.cToF(C)));//print the output
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public double cToF(int C)
    {
        //Your code here
        return (C * 9/5) + 32;
    }

}

//Total Time Taken: 0.2/1.2