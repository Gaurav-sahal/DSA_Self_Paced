/*
Hashing for pair - 2 
Easy Accuracy: 63.53% Submissions: 9961 Points: 2

You are given an array of integers and an integer sum. You need to find if two numbers in the array exists that have sum equal to the given sum.

Example 1:
Input:
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
sum = 14
Output: 
1
Explanation: 
there exists a pair which 
gives sum as 14 example 
(4,10),(5,9) etc.

Example 2:
Input:
N = 4
arr[] ={4, 3, 5, 6}
sum = 12
Output: 
0
Explanation: 
there does not exist any
such pair which gives sum as 12.

Your Task:
You don't need to read input or print anything. You just have to complete the function sumExists() which takes the array arr[], its size N and an integer sum as inputs and returns 1 if there exists a pair with the given sum in the array. Else, it returns 0. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 1000
1 <= arri <= 106
1 <= sum <= 1000*/

// { Driver Code Starts
// Initial Template for Java
// Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            // taking size of array
            int N = sc.nextInt();
            int arr[] = new int[N]; // array declaration

            for (int i = 0; i < N; i++) arr[i] = sc.nextInt(); // Input the
                                                               // array
            int sum = 0;

            // taking value of sum
            sum = sc.nextInt();

            // Creating an object of class Geeks
            Geeks obj = new Geeks();

            // Calling sumExists method of class Geeks
            // and printing the result
            System.out.println(obj.sumExists(arr, N, sum));
        }
    }
}
// Position this line where user code will be pasted.
// } Driver Code Ends
// User function Template for Java

class Geeks {
    // Complete this function
    // Function to check if two numbers in array have sum equal to the given
    // sum.
    public static int sumExists(int arr[], int N, int sum) {

        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for(Integer x : arr){
            if(set.contains(sum - x))
                return 1;
            set.add(x);
        }
        return 0;
    }
}

//Total Time Taken: 1.5/3.7