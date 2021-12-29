/*
Power Set Using Recursion 
Easy Accuracy: 49.26% Submissions: 19237 Points: 2

You are given a string. You need to print the lexicographically sorted power-set of the string.
Note: The string s contains lowercase letter of alphabet.

Example 1:
Input:
s = a
Output: a
Explanation: empty string and a 
are only sets.

Example 2:
Input:
s = abc
Output: a ab abc ac b bc c
Explanation: empty string, 
a, ab, abc, ac, b, bc, c 
are the sets.

Your Task:
You don't need to read input or print anything. You only need to complete the function powerSet that takes string s as parameter and returns a list of subsets. The lexicographic-sorting and printing is done automatically by the driver code.

Expected Time Complexity: O(2|s|).
Expected Auxiliary Space: O(|s|). 

Constraints:
1 <= |s| <= 10*/

// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //testcases        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //input string
            String st = sc.next();
            
            //calling powerSet() function
            ArrayList<String> ans = new LexSort().powerSet(st);
            
            //sorting the result of the powerSet() function
            Collections.sort(ans);
    
            //printing the result
            for(String s: ans)
                System.out.print(s + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends
//User function Template for Java
class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> list = new ArrayList<>();
        checkPower(list, s, "", 0);
        return list;
    }
    
    //USERDEFINED FUNCTION CREATED
    static void checkPower(ArrayList<String> list, String str, String curr, int index){
        if(index == str.length()){
            list.add(curr);
            return;
        }
        checkPower(list, str, curr, index+1);
        checkPower(list, str, curr+str.charAt(index), index+1);
    }
}

//Total Time Taken: 0.6/1.7