/*
Maximum occured integer 
Easy Accuracy: 44.71% Submissions: 26777 Points: 2

Given n integer ranges, the task is to find the maximum occurring integer in these ranges. If more than one such integer exits, find the smallest one. The ranges are given as two arrays L[] and R[].  L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.
For example consider the following ranges.
L[] = {2, 1, 3}, R[] = {5, 3, 9)
Ranges represented by above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.

Example 1:
Input:
n = 4
L[] = {1,4,3,1}
R[] = {15,8,5,4}
Output: 4
Explanation: The given ranges are [1,15]
 [4, 8] [3, 5] [1, 4]. The number that 
is most common or appears most times in 
the ranges is 4.

Example 2:
Input:
n = 5
L[] = {1,5,9,13,21}
R[] = {15,8,12,20,30}
Output: 5
Explanation: The given ranges are 
[1,15] [5, 8] [9, 12] [13, 20] 
[21, 30]. The number that is most 
common or appears most times in 
the ranges is 5.

Your Task:
The task is to complete the function maxOccured() which returns the maximum occured integer in all ranges.

Expected Time Complexity: O(n+maxx).
Expected Auxiliary Space: O(maxx).
-maxx is maximum element in R[]

Constraints:
1 ≤ n ≤ 106
0 ≤ L[i], R[i] ≤ 106*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {

    	public static void main (String[] args) throws IOException{
    	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    //taking size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int L[] = new int[n];
		    int R[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to array L
		    for(int i=0; i<n; i++){
		        L[i]=Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    int maxx = Integer.MIN_VALUE;
		    
		    //adding elements to array R
		    for(int i=0; i<n; i++){
		        R[i]=Integer.parseInt(inputLine[i]);
		        if(R[i] > maxx){
		            maxx=R[i];
		        }
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxOccured() function
		    System.out.println(obj.maxOccured(L, R, n, maxx));
		}
	}
	
}
// } Driver Code Ends
// L[] and R[] are input ranges
// n : size of array
// maxx: maximum element in R[]
// arr[]: declared globally with size equal to 1000000

class Solution{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int arr[] = new int[maxx + 1];
        for(int i=0; i<maxx+1; i++){
            arr[i] = 0;
        }
        for(int i=0; i<L.length; i++){
            int low = L[i];
            int high = R[i];
            for(int j=low; j<=high; j++){
                arr[j] = arr[j] + 1;
            }
        }
        int max = 0;
        for(int i=1; i<maxx+1; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
        
    }
    
}

//Total Time Taken: 1.0/2.3