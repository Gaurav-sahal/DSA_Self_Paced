/*
Isomorphic Strings 
Easy Accuracy: 47.07% Submissions: 44591 Points: 2

Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’

Example 1:
Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.

Example 2:
Input:
str1 = aab
str2 = xyz
Output: 0
Explanation: There are two different
charactersin aab but there are three
different charactersin xyz. So there
won't be one to one mapping between
str1 and str2.

Your Task:
You don't need to read input or print anything.Your task is to complete the function areIsomorphic() which takes the string str1 and string str2 as input parameter and  check if two strings are isomorphic. The function returns true if strings are isomorphic else it returns false.

Expected Time Complexity: O(|str1|+|str2|).
Expected Auxiliary Space: O(Number of different characters).
Note: |s| represents the length of string s.

Constraints:
1 <= |str1|, |str2| <= 2*104*/

// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;

public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
}// } Driver Code Ends

class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        /*
        1) If lengths of str1 and str2 are not same, return false.
        2) Do following for every character in str1 and str2
           a) If this character is seen first time in str1, 
              then current of str2 must have not appeared before.
              (i) If current character of str2 is seen, return false.
                  Mark current character of str2 as visited.
              (ii) Store mapping of current characters.
           b) Else check if previous occurrence of str1[i] mapped
              to same character.*/
        int n = str1.length();
        int m = str2.length();
        if(n != m) return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<n; i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2)
                    return false;
            }
            else{
                if(set.contains(ch2))
                    return false;
                set.add(ch2);
                map.put(ch1,ch2);
            }
        }
        return true;
    }
}

//Total Time Taken: 0.4/1.1