/*
Hashing for pair - 1 
Easy Accuracy: 51.04% Submissions: 13571 Points: 2

You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.

Example 1:
Input:
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
sum = 14
Output: 
1
Explanation: 
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
and sum = 14.  There is a pair {4, 10} 
with sum 14.

Example 2:
Input:
N = 2
arr[] = {2, 5}
sum = 10
Output:
0
Explanation: 
arr[]  = {2, 5} and sum = 10. 
There is no pair with sum 10.

Your Task:
You don't need to read input or print anything. Your task is to complete the provided function sumExists () which take the array arr[], its size N, and an integer sum as inputs and returns 1 if there exists a pair with the given sum in the array, else, it returns 0.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 1000
1 <= arri <= 106
1 <= sum <= 1000*/

// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String[] args) {

        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking count of testcases
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            // taking size of array
            int N = sc.nextInt();
            int arr[] = new int[N]; // array declaration

            for (int i = 0; i < N; i++) arr[i] = sc.nextInt(); // Input the
                                                               // array
            int sum = 0;
            // taking sum
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
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks
        HashSet<Integer> set = new HashSet<>();
        for(Integer x : arr){
            if(set.contains(sum - x))
                return 1;
            set.add(x);
        }
        return 0;
    }
}

//Total Time Taken: 0.6/2.1
