/*
Reverse array in groups 
Basic Accuracy: 51.16% Submissions: 63685 Points: 1

Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Example 1:
Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 
Example 2:
Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 
Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the array in-place. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N, K ≤ 107
1 ≤ A[i] ≤ 1018*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends
//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int init = 0, end = 0, last = n-1;
        while(init < last){
            end = init+k-1;
            if(end > last) end = last;
            reverse(arr, init, end);
            init = end + 1;
        }
    }
    
    //USERDEFINED FUNCTION
    void reverse(ArrayList<Integer> arr, int start, int end){
        /*int k = 0;
        for(int i=start; i<=(start+end-1)/2; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(end-1-k));
            arr.set(end-1-k, temp);
            k++;
        }*/
        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}

//Total Time Taken: 1.3/2.6