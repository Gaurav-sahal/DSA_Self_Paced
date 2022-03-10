/*
Winner of an election 
Easy Accuracy: 49.75% Submissions: 23075 Points: 2

Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents a vote casted to the candidate. Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.

Example 1:
Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.

Example 2:
Input:
n = 3
Votes[] = {andy,blake,clark}
Output: andy 1
Explanation: All the candidates get 1 
votes each. We print andy as it is 
lexicographically smaller.

Your Task:
You only need to complete the function winner() that takes an array of strings arr, and n as parameters and returns the name of the candiate with maximum votes and the number of votes the candidate got as an array of size 2.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 105*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
        }        
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0; String result = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            String s = e.getKey();
            int value = e.getValue();
            if(value > max){
                result = s;
                max = value;
            }
            else if(value == max){
                result = (result.compareTo(s) < 0)? result : s;
            }
        }
        return new String[]{result, String.valueOf(max)};
    }
}

//Total Time Taken: 0.9/2.3