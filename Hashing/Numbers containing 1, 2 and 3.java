/*
Numbers containing 1, 2 and 3 
Easy Accuracy: 56.84% Submissions: 7218 Points: 2

Given an array arr[] of n numbers. The task is to print only those numbers whose digits are from set {1,2,3}.

Example 1:
Input:
n = 3
arr[] = {4,6,7}
Output: -1
Explanation: No elements are there in the 
array which contains digits 1, 2 or 3.

Example 2:
Input:
n = 4
arr[] = {1,2,3,4}
Output: 1 2 3
Explanation: 1, 2 and 3 are the only 
elements in the array which conatins 
digits as 1, 2 or 3.

Your Task:
Complete findAll function and marked satisfied number as '1' in the map mp in range 1 to 1000000. If no number is marked as satified number -1 will automatically be printed by the drivers code. The driver code prints the elements in sorted order.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 <= n <= 106
1 <= A[i] <= 106*/

// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.awt.Point; 
import java.util.Arrays; 
import java.util.Vector; 
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		findAll();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Arrays.sort(arr);
		    boolean flag=false;
		    for(int x:arr)
		    {
		        if(mp.containsKey(x))
		        {System.out.print(x+" ");flag=true;}
		    }
		    
		    if(flag==false)
		    System.out.print(-1);
		    System.out.println();
		}
	}
	
    static HashMap<Integer,Integer>mp=new HashMap<>();

 // } Driver Code Ends
//User function Template for Java
//Function to find all the numbers with only 1,2 and 3 in their digits.

public static void findAll()
{
    //Your code here
    mp.put(1,1);
    mp.put(2,1);
    mp.put(3,1);
    for(int i=4; i<=1000000; i++){
        if(isValid(i)){
            mp.put(i,1);
        }
    }
}

//USER DEFINED FUNCTION
public static boolean isValid(int num){
    while(num > 0){
        int rem = num % 10;
        if(rem == 0 || rem >= 4){
            return false;
        }
        num = num / 10;
    }
    return true;
}
// { Driver Code Starts.

}

//Total Time Taken: 1.9/3.1