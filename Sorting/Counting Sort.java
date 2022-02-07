/*
Counting Sort 
Easy Accuracy: 50.34% Submissions: 22226 Points: 2

Given a string arr consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

Example 1:
Input:
N = 5
S = "edsab"
Output:
abdes
Explanation: 
In lexicographical order, string will be 
abdes.

Example 2:
Input:
N = 13
S = "geeksforgeeks"
Output:
eeeefggkkorss
Explanation:
In lexicographical order, string will be 
eeeefggkkorss.

Your Task:
This is a function problem. You only need to complete the function countSort() that takes string arr as a parameter and returns the sorted string. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}
// } Driver Code Ends

class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int arr1[] = new int[26];
        for(int i=0; i<26; i++)
            arr1[i] = 0;
        for(int i=0; i<arr.length(); i++){
            int c = arr.charAt(i) - 'a';
            arr1[c]++;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<26; i++){
            char c = (char)('a'+i);
            for(int j=0; j<arr1[i]; j++){
                sb.append((char)(c));
            }
        }
        return sb.toString();
    }
}

//Total Time Taken: 0.4/1.6