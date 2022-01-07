/*
Rearrange Array Alternately 
Medium Accuracy: 50.0% Submissions: 58930 Points: 4

Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

Example 1:
Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.

Example 2:
Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10, 
second max = 100, second min = 20, and 
so on... Modified array is : 
110 10 100 20 90 30 80 40 70 50 60.

Your Task:
The task is to complete the function rearrange() which rearranges elements as explained above. Printing of the modified array will be handled by driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 107
1 <= arr[i] <= 107*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    int[] temp= new int[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        temp[i] = Integer.parseInt(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(temp, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(temp[i] + " ");
		    System.out.println(sb);
		}
	}
}
// } Driver Code Ends

class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        
        // Your code here
        int arr1[] = new int[n];
        int l=0, h=n-1, i=0;
        while(l<h){
            arr1[i] = arr[h];
            i++;
            arr1[i] = arr[l];
            i++;
            l++;
            h--;
        }
        if(n % 2 != 0)
            arr1[i] = arr[l];
        for(int j=0; j<n; j++){
            arr[j] = arr1[j];
        }
    }
}

//Total Time Taken: 2.2/3.5