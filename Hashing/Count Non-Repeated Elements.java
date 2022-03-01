/*
Count Non-Repeated Elements 
Easy Accuracy: 54.66% Submissions: 13675 Points: 2

Hashing is very useful to keep track of the frequency of the elements in a list.
You are given an array of integers. You need to print the count of non-repeated elements in the array.

Example 1:
Input:
10
1 1 2 2 3 3 4 5 6 7
Output: 
4
Explanation: 
4, 5, 6 and 7 are the 
elements with frequency 1 and rest 
elements are repeated so the number 
of non-repeated elements are 4.

Example 2:
Input:
5
10 20 30 40 10
Output: 
3
Explanation: 
20, 30, 40 are the 
elements with the frequency 1 and 
10 is the repeated element to 
number of non-repeated elements 
are 3.

Your Task:
You don't need to read input or print anything. You only need to complete the function countNonRepeated() that takes array arr[] and its size n as parameters and returns the count of non-repeating elements in the array. 

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
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            //taking total count of elements
            int n=sc.nextInt();
            
            //Declaring and Initializing an array of size n
            int arr[] = new int[n];
            
            //Inserting elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
            //calling countNonRepeated method
            //of class Hashing and printing the result
            System.out.println(new Solution().countNonRepeated(arr, n));
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        long count = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1)
                count++;
        }
        return count;
    }
}

//Total Time Taken: 0.2/1.2