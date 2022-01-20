/*
Smallest Positive missing number 
Medium Accuracy: 45.09% Submissions: 96247 Points: 4

You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.

Example 2:
Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing 
number is 2.

Your Task:
The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
-106 <= arr[i] <= 106*/

// { Driver Code Starts
import java.util.*;
 // } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        boolean arr1[] = new boolean[size+1];
        Arrays.fill(arr1, false);
        for(int i=0; i<size; i++){
            if(arr[i] >=0 && arr[i] <= size)
                arr1[arr[i]] = true;
        }
        for(int i=1; i<size+1; i++){
            if(!arr1[i])return i;
        }
        return size+1;
    }
}
// { Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}  // } Driver Code Ends

//Total Time Taken: 2.8/6.9