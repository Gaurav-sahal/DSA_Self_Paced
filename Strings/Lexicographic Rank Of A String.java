/*
Lexicographic Rank Of A String 
Medium Accuracy: 43.96% Submissions: 15881 Points: 4
   
You are given a string S of lowercase characters, find the rank of the string amongst its permutations when sorted lexicographically. Return 0 if the characters are repeated in the string.
Note: Return the rank%1000000007 as the answer as rank might overflow.

Example 1:
Input:
S = abc
Output: 1
Explanation: In 'abc' when we sort all the
permutations in lexicographic order 'abc'
will be at the first position.

Example 2:
Input:
S = acb
Output: 2
Explanation: In 'acb' .The
lexicographically sorted permutations
with letters 'a', 'c', and 'b' will be
at second position. 

Your Task:
You only need to complete the function findRank that takes string S as a parameter and returns the rank.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ |S| ≤ 26*/

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
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String S = sc.next();
            System.out.println(new Solution().findRank(S));
        }
    }
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to find lexicographic rank of a string.
    static int findRank(String S) 
    {
        int n = S.length();
        HashSet<Character> set = new HashSet<>();
        for(char ch : S.toCharArray())
            set.add(ch);
        if(n != set.size())
            return 0;
        
        int count[] = new int[27];  //for count[(a - 'a') -1] cases
        for(int i=0; i<n; i++){
            count[(S.charAt(i) - 'a') + 1] = 1;
        }
        long fact[] = new long[n];
        fact[0] = 1;
        for(int i=1; i<n; i++){
            //fact = (fact * i) % 1000000007;
            fact[i] = (fact[i-1]*i) % 1000000007;
            //System.out.println(fact);
        }
        for(int i=1; i<27; i++){
            count[i] += count[i-1];
        }

        long result = 1;
        for(int i=0; i<n-1; i++){
            long factorial = fact[n-i-1] % 1000000007;
            result = (result + ((count[(S.charAt(i) - 'a')]) % 1000000007 * factorial % 1000000007) % 1000000007) % 1000000007;
            for(int j=(S.charAt(i) - 'a')+1; j<27; j++){
                count[j]--;
            }
        }
        return (int)result;
    }
}

//Total Time Taken: 1.79/3.33