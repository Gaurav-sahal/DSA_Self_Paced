/*
Swap all odd and even bits 
Easy Accuracy: 60.12% Submissions: 17732 Points: 2
Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.

Example 1:
Input: N = 23
Output: 43
Explanation: 
Binary representation of the given number 
is 00010111 after swapping 
00101011 = 43 in decimal.

Example 2:
Input: N = 2
Output: 1
Explanation: 
Binary representation of the given number 
is 10 after swapping 01 = 1 in decimal.

Your Task: Your task is to complete the function swapBits() which takes an integer and returns an integer with all the odd and even bits swapped.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 109*/

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // let n = 23 = 00010111
	    int evenBit = (n & 0xaaaaaaaa); // 0xaaaaaaaa = 101010101010101010... -> 00000010
        int oddBit = (n & 0x55555555);  // 0x55555555 = 010101010101010101... -> 00010101
        evenBit = evenBit >> 1;     // 00000001
        oddBit = oddBit << 1;       // 00101010
        return (evenBit | oddBit);  // 00101011
	}
    
}
// { Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}  // } Driver Code Ends

// Total Time Taken: 1.3/3.3