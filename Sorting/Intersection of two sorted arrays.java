/*
Intersection of two sorted arrays 
Easy Accuracy: 48.02% Submissions: 23660 Points: 2

The intersection of two arrays contains the elements common to both the arrays. The intersection should not count duplicate elements.
Given two sorted arrays arr1[] and arr2[] of sizes N and M respectively. Find their intersection

Example 1:
Input: 
N = 4, arr1[] = {1, 2, 3, 4}  
M = 5, arr2 [] = {2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are only common 
elements in both the arrays.
 
Example 2:
Input: 
N = 5, arr1[] = {1, 2, 2, 3, 4}
M = 6, arr2[] = {2, 2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are the only 
common elements.
 
Example 3:
Input:
N = 2, arr1[] = {1, 2}
M = 2, arr2[] = {3, 4}
Output: -1
Explanation: No common elements.

Your Task:
You do not need to read input or print anything. Complete the function printIntersection() that takes arr1,arr2,  N and M as input parameters and return a list of integers containing the intersection of two arrays. If the intersection is empty then then list should contain -1.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(min(N,M)).

Constraints:
1 <= N, M <= 105
1 <= arr[i], brr[i] <= 106*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr1[i] = Integer.parseInt(st[i]);
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < M; i++)
                arr2[i] = Integer.parseInt(st[i]);
                
            ArrayList<Integer> v = new ArrayList<Integer>();
            v = new Solution().printIntersection(arr1, arr2, N, M);
           
            for(int i=0;i<v.size();i++)
                System.out.print(v.get(i)+" ");
                
            System.out.println();
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(i>0 && arr1[i-1] == arr1[i]){
                i++;
                continue;
            }
            if(j>0 && arr2[j-1] == arr2[j]){
                j++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr1[i]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        if(list.size() == 0) list.add(-1);
        return list;
    }

}

//Total Time Taken: 1.4/2.7