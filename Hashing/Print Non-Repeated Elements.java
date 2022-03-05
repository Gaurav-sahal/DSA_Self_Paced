/*
Print Non-Repeated Elements 
Easy Accuracy: 49.26% Submissions: 21490 Points: 2

Hashing is very useful to keep track of the frequency of the elements in a list.
You are given an array of integers. You need to print the non-repeated elements as they appear in the array.

Example 1:
Input:
n = 10
arr[] = {1,1,2,2,3,3,4,5,6,7}
Output: 4 5 6 7
Explanation: 4, 5, 6 and 7 are the only 
elements which is having only 1 
frequency and hence, Non-repeating.

Example 2:
Input:
n = 5
arr[] = {10,20,40,30,10}
Output: 20 40 30
Explanation: 20, 40, 30 are the only 
elements which is having only 1 
frequency and hence, Non-repeating.

Your Task:
You don't need to read input or print anything. You only need to complete the function printNonRepeated() that takes arr and n as parameters and return the array which has the distinct elements in same order as they appear in input array. The newline is appended automatically by the driver code.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 103
0 <= arri <= 107*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int arr[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            ArrayList<Integer> v = new Solution().printNonRepeated(arr, n);
            
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i)+" ");
            }
            
            System.out.println();
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer x : arr){
            if(map.get(x) == 1)
                list.add(x);
        }
        return list;
    }
}

//Total Time Taken: 0.8/1.2