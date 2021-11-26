/*Factorial Of Number 
Easy Accuracy: 52.06% Submissions: 26832 Points: 2
Given a positive integer N. The task is to find factorial of N.

Example 1:

Input:
N = 4
Output: 24
Explanation: 4! = 4 * 3 * 2 * 1 = 24
Example 2:

Input:
N = 13
Output: 6227020800
Explanation: 
13! = 13 * 12 * .. * 1 = 6227020800

Your Task:
You don't need to read input or print anything. Your task is to complete the function factorial() that takes N as parameter and returns factorial of N.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
0 <= N <= 18*/

// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            
            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            System.out.println(obj.factorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public long factorial(int N) {
        // Your code here
        long fact = 1;
        while(N > 0){
            fact *= N;
            N--;
        }
        return fact;
    }
}

//Total Time Taken: 0.2/1.2