/*
Array insert at index 
Basic Accuracy: 51.49% Submissions: 42027 Points: 1

Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at some index.
You are given an array arr(0-based index). The size of the array is given by sizeOfArray. You need to insert an element at given index and print the modified array.

Example 1:
Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 5, element = 90
Output: 1 2 3 4 5 90
Explanation: 90 is inserted at index
5(0-based indexing). After inserting,
array elements are like
1, 2, 3, 4, 5, 90.

Example 2:
Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 2, element = 90
Output: 1 2 90 3 4 5
Explanation: 90 is inserted at index 
2(0-based indexing). After inserting,
array elements are like 
1, 2, 90, 3, 4, 5.

Your Task:
You don't need to read input or print anything.. The input is already taken care of by the driver code. You only need to complete the function insertAtIndex() that takes arr, sizeOfArray, index, element as input and modifies the array arr as per requirements. The printing is done by driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
2 <= sizeOfArray <= 10000
0 <= element, arri <= 106
0 <= index <= sizeOfArray-1*/

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Array {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input testcases
		int testcases = sc.nextInt();
		while(testcases-- > 0)
		{
		    //input size of Array
		    int sizeOfArray = sc.nextInt();
		    int arr[] = new int[sizeOfArray];
		    
		    //input elements in the Array
		    for(int i = 0; i < sizeOfArray-1; i++)
		    {
		        int x;
		        x = sc.nextInt();
		        arr[i] = x;
		    }
		    
		    //input index
		    int index = sc.nextInt();
		    //input element
		    int element = sc.nextInt();
		    
		    Solution obj = new Solution();
		    
		    //calling insertAtIndex() function
		    obj.insertAtIndex(arr,sizeOfArray,index,element);
		    
		    //Printing the array for verification
		    for(int i = 0; i < sizeOfArray;i++)
		    {
		        System.out.print(arr[i] + " ");
		        
		    }
		    
		    System.out.println();
		}
	}
}
// } Driver Code Ends
//User function Template for Java
//Complete this function, Geeks

class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        int temp = arr[index];
        arr[index] = element;
        for(int i=index+1; i<sizeOfArray; i++){
            int temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;
        }
    }
}

//Total Time Taken: 3.7/6.4