/*
Positive Negative Pair 
Easy Accuracy: 49.71% Submissions: 17024 Points: 2

Given an array of distinct integers, find all the pairs having both negative and positive values of a number in the array.

Example 1:
Input:
n = 8
arr[] = {1,3,6,-2,-1,-3,2,7}
Output: -1 1 -3 3 -2 2
Explanation: 1, 3 and 2 are present 
pairwise positive and negative. 6 and 
7 have no pair.

Example 2:
Input:
n = 3
arr[] = {3,2,1}
Output: 0
Explanation: No such pair exists so the 
output is 0.

Your Task:
You do not need to read input or print anything. Complete the function findPairs() which takes the array A[] and the size of the array, n, as input parameters and returns a list of integers denoting the pairs. The pair that appears first(i.e. second element of the pair appears first) in A[] should appear first in the returning list and within the pair, the negative integer should appear before the positive integer. Return an empty integer list if no such pair exists.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 106
-106 <= arr[i] <= 106*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int arr[] = new int[n];
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i = 0;i<n;i++)
                        {
                            arr[i] = sc.nextInt();
                        }
                    
                    Solution obj = new Solution();
                    
                    res = obj.findPairs(arr, n);
                    if(res.size()!=0)
                        {
                            for(int i = 0;i<res.size();i++)
                               System.out.print(res.get(i) + " ");
                            System.out.println();   
                        }
                    else
                        System.out.println(0);   
                }
        }
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	HashSet<Integer> set = new HashSet<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	for(Integer x : arr){
    	    if(set.contains(-x)){
    	        int num = Math.abs(x);
    	        list.add(-num);
    	        list.add(num);
    	    }
    	    else
    	        set.add(x);
    	}
    	if(list.size() == 0) list.add(0);
    	return list;
    }
}

//Total Time Taken: 1.8/4.0