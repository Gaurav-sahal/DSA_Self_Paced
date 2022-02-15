/*
Merge three sorted arrays 
Medium Accuracy: 71.09% Submissions: 6734 Points: 4

Given three sorted arrays A, B and C of size N, M and P respectively. The task is to merge them into a single array which must be sorted in increasing order.

Example 1:
Input: 
N = 4, A[] = [1 2 3 4] 
M = 5, B[] = [1 2 3 4 5] 
P = 6, C[] = [1 2 3 4 5 6]
Output: 1 1 1 2 2 2 3 3 3 4 4 4 5 5 6
Explanation: Merging these three sorted 
arrays, we have: 
1 1 1 2 2 2 3 3 3 4 4 4 5 5 6.

Example 2:
Input: 
N = 2, A[] = [1 2]
M = 3, B[] = [2 3 4] 
P = 4, C[] = [4 5 6 7]
Output: 1 2 2 3 4 4 5 6 7
Explanation: Merging three sorted arrays, 
we have: 1 2 2 3 4 4 5 6 7.

Your Task:
This is a function problem. You only need to complete the function mergeThree() that takes A,B,C as parameters. The function returns an array or vector.

Expected Time Complexity: O(N + M + P)
Expected Auxiliary Space: O(N + M + P) for the resultant array only.

Constraints:
1 <= N, M, P <= 106
1 <= A[i], B[i], C[i] <= 106*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    static void printSorted(ArrayList<Integer> list)
    {
        for(Integer x : list)
        System.out.print(x + " ");
    }
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int A[] = new int[a];
		    int B[] = new int[b];
		    int C[] = new int[c];
		    
		    for(int i = 0; i < a; i++)
		      A[i] = sc.nextInt();
		      
		    for(int i = 0; i < b; i++)
		      B[i] = sc.nextInt();
		      
		    for(int i = 0; i < c; i++)
		      C[i] = sc.nextInt();
		    
		    printSorted(new Solution().merge3sorted(A, B, C));
		    System.out.println();
		    
		}
	}
}// } Driver Code Ends
//User function Template for Java

class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        int D[] = merge(A, B);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<C.length && j<D.length){
            if(C[i] <= D[j]){
                list.add(C[i]);
                i++;
            }
            else{
                list.add(D[j]);
                j++;
            }
        }
        while(i<C.length){
            list.add(C[i]);
            i++;
        }
        while(j<D.length){
            list.add(D[j]);
            j++;
        }
        return list;
    }
    
    static int[] merge(int arr1[], int arr2[]){
        int m = arr1.length, n = arr2.length;
        int arr[] = new int[m+n];
        
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(arr1[i] <= arr2[j])
                arr[k++] = arr1[i++];
            else if(arr1[i] > arr2[j])
                arr[k++] = arr2[j++];
        }
        while(i<m)
            arr[k++] = arr1[i++];
        while(j<n)
            arr[k++] = arr2[j++];
        return arr;
    }
}

//Total Time Taken: 0.4/1.5