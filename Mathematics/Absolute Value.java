/*
Absolute Value 
Basic Accuracy: 71.87% Submissions: 34803 Points: 1
You are given an interger I, find the absolute value of the interger I.

Example 1:

Input:
I = -32
Output: 32
Explanation: 
The absolute value of -32 is 32. 

Example 2:

Input:
I = 45
Output: 45
Explanation: 
The absolute value of 45 is 45 itself.

Your Task:
You don't need to read input or print anything. Your task is to complete the function absolute() which takes an integer I as input parameter and return the absolute value of I.

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1) 

Constraints:
-106 <= I <= 106*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int absolute(int I) {
        return Math.abs(I);
    }
}

//Total Time Taken: 0.2/1.2
