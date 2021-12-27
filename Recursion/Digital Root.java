/*Digital Root 
Easy Accuracy: 53.0% Submissions: 25219 Points: 2

You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

Example 1:
Input: n = 1
Output:  1
Explanation: Digital root of 1 is 1

Example 2:
Input: n = 99999
Output: 9
Explanation: Sum of digits of 99999 is 45
which is not a single digit number, hence
sum of digit of 45 is 9 which is a single
digit number.

Your Task:
You don't need to read input or print anything. Your task is to complete the function digitalRoot that takes n as parameter and returns the digital root of n. 

Expected Time Complexity: O((Num of Digits)2).
Expected Auxiliary Space: O(Num of Digits).

Constraints:
1 <= n <= 107*/

// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();//taking number n
            
            //calling digitalRoot() function of 
            //class Digital
            System.out.println(new Solution().digitalRoot(n));
        }
    }
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    // complete the function
    static int sum = 0;
    public static int digitalRoot(int n)
    {
        // add your code here
        if(n <= 9) return n;
        
        while(n > 9){
            n = fun(n);
        }
        
        return n;
    }
    
    //USER DEFINED FUNCTION
    public static int fun(int n){
        if(n <= 9) return n;
        
        return (n % 10) + fun(n / 10);
    }
}

//Total Time Taken: 1.3/2.7