/*
Separate chaining in Hashing 
Easy Accuracy: 68.58% Submissions: 7745 Points: 2

Separate chaining technique in hashing allows to us to use a linked list at each hash slot to handle the problem of collisions. That is, every slot of the hash table is a linked list, so whenever a collision occurs, the element can be appened as a node to the linked list at the slot.
In this question, we'll learn how to fill up the hash table using Separate chaining technique. Given an array and a hashtable size, you have to fill the elements of the array into a hash table of given size. 

Example 1:
Input:
hashSize = 10
sizeOfArray = 6
arr[] = {92,4,14,24,44,91}
Output:
1->91
2->92
4->4->14->24->44
Explanation: 92%10=2 so 92 goes to slot 2.
4%10=4 so 4 goes to slot 4. 14%10=4. But 4
is already occupied so we make a linked
list at this position and add 14 after 4 
in slot 4 and so on.

Example 2:
Input:
hashSize = 10
sizeOfArray = 5
arr[] = {12,45,36,87,11}
Output:
1->11
2->12
5->45
6->36
7->87
Explanation: 12%10=2 so 12 goes to slot 2.
45%10=5 goes to slot 5. 36%10=6 goes to
slot 6. 87%10=7 goes to slot 7 and finally
11%10=1 goes to slot 1.

Your Task:
This is a function problem. You need to complete the function separateChaining that takes hashSize, arr, and sizeOfArr as parameters, inserts elements of arr in the hashTable at positions by using arr[i]%hashSize and then returns the has table. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
2 <= hashSize <= 103
1 <= sizeOfArray <= 103
0 <= arri <= 107*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.ArrayList;
class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int hashSize = Integer.parseInt(br.readLine().trim());
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution obj = new Solution();
		    ArrayList<ArrayList<Integer>> res  = obj.separateChaining(arr, n, hashSize);
		    
		    for(int i=0;i<res.size();i++) {
	            if(res.get(i).size()>0) {
	                System.out.print(i+"->");
	                for(int j=0; j<res.get(i).size()-1; j++) {
	                    System.out.print(res.get(i).get(j) + "->");
	                }
	                System.out.print(res.get(i).get(res.get(i).size()-1));
	                System.out.println();
	            }
	        }
		}
	}
}
// } Driver Code Ends

class Solution{

    //Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        //Your code here
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();
        for(int i=0; i<hashSize; i++){
            table.add(new ArrayList<Integer>());
        }
        for(int i=0; i<n; i++){
            int idx = arr[i] % hashSize;
            table.get(idx).add(arr[i]);
        }
        return table;
    }
}

//Total Time Taken: 2.3/7.3