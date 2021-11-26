/*Quadratic Equation Roots 
Basic Accuracy: 33.8% Submissions: 100k+ Points: 1
Given a quadratic equation in the form ax2 + bx + c. Find its roots.

Note: Return the maximum root followed by the minimum root.

Example 1:

Input:
a = 1
b = -2
c = 1
Output: 1 1
Explanation:
Roots of equation x2-2x+1 are 1 and 1.

Example 2:

Input:
a = 1
b = -7
c = 12
Output: 4 3
Explanation: Roots of equation 
x2 - 7x + 12 are 4 and 3.
 
Your Task:
You don't need to read input or print anything. Your task is to complete the function quadraticRoots() which takes a, b, c as input parameters and returns a list of two integers containing the floor value of its roots in decreasing order. If roots are imaginary, the returning list should contain only 1 integer ie -1. Always return the greatest integer smaller than or equal to the result.
Note: If roots are imaginary, the generated output will display "Imaginary".

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1) 

Constraints:
-103 <= a,b,c <= 103*/

// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        double D = b*b - 4*a*c;
        if(D < 0) {
            arr.add(-1);
            return arr;
        }
        int r1 = (int)Math.floor((-b + Math.sqrt(D))/(2.0 * a));
        int r2 = (int)Math.floor((-b - Math.sqrt(D))/(2.0 * a));
        if(r1 > r2){
            arr.add(r1);
            arr.add(r2);
        }
        else{
            arr.add(r2);
            arr.add(r1);
        }
        return arr;
    }
}

//Total Time Taken: 0.7/2.2