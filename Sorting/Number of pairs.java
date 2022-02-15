/*
Number of pairs 
Medium Accuracy: 47.19% Submissions: 26488 Points: 4

Given two arrays X and Y of positive integers, find the number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.

Example 1:
Input: 
M = 3, X[] = [2 1 6] 
N = 2, Y[] = [1 5]
Output: 3
Explanation: 
The pairs which follow xy > yx are 
as such: 21 > 12,  25 > 52 and 61 > 16 .

Example 2:
Input: 
M = 4, X[] = [2 3 4 5]
N = 3, Y[] = [1 2 3]
Output: 5
Explanation: 
The pairs for the given input are 
21 > 12 , 31 > 13 , 32 > 23 , 41 > 14 , 
51 > 15 .

Your Task:
This is a function problem. You only need to complete the function countPairs() that takes X, Y, M, N as parameters and returns the total number of pairs.

Expected Time Complexity: O((N + M)log(N)).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ M, N ≤ 105
1 ≤ X[i], Y[i] ≤ 103*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main 
{
    	public static void main (String[] args) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int g = 0;g < t;g++)
        {
            String[] str = (br.readLine()).trim().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            
            int[] x = new int[M];
            str = (br.readLine()).trim().split(" ");
            for(int i = 0;i< M;i++)
                x[i] = Integer.parseInt(str[i]);
                
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[N];
            for(int i = 0;i< N;i++)
            {
                y[i] = Integer.parseInt(str[i]);
                
            }
            System.out.println(new Solution().countPairs(x, y, M, N));
           
        }
	}
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int M, int N)
    {
        // your code here
        //link - https://www.youtube.com/watch?v=chYKJGPNEvg
        //Trick - IF (y > x) count it. But it has some exceptions as well.
        long countPairs = 0;
        Arrays.sort(y);
        int countOccurY[] = new int[5];
        for(int i=0; i<N; i++){
            if(y[i] < 5)
                countOccurY[y[i]]++;
        }
        for(int i=0; i<M; i++){
            int X = x[i];
            if(X == 0) continue;
            if(X == 1){
                countPairs += countOccurY[0];
                continue;
            }
            int idxGrtrThnX = binarySearchGrtr(y, N, X);
            if(idxGrtrThnX != -1)
                countPairs += (N-idxGrtrThnX);
            if(X == 2){
                countPairs -= (countOccurY[3]+countOccurY[4]);
            }
            if(X == 3){
                countPairs += countOccurY[2];
            }
            countPairs += countOccurY[0]+countOccurY[1];
        }
        return countPairs;
    }
    
    static int binarySearchGrtr(int y[], int N, int X){
        int l=0, h=N-1, res = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(y[mid] > X){
                res = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }
}

//Total Time Taken: 1.3/2.7