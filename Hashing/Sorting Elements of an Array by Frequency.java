/*
Sorting Elements of an Array by Frequency 
Medium Accuracy: 47.44% Submissions: 29340 Points: 4

Given an array of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

Example 1:
Input:
N = 5
A[] = {5,5,4,6,4}
Output: 4 4 5 5 6
Explanation: The highest frequency here is
2. Both 5 and 4 have that frequency. Now
since the frequencies are same then 
smallerelement comes first. So 4 4 comes 
firstthen comes 5 5. Finally comes 6.
The output is 4 4 5 5 6.

Example 2:
Input:
N = 5
A[] = {9,9,9,2,5}
Output: 9 9 9 2 5
Explanation: The highest frequency here is
3. The element 9 has the highest frequency
So 9 9 9 comes first. Now both 2 and 5
have same frequency. So we print smaller
element first.
The output is 9 9 9 2 5.

Your Task:
You only need to complete the function sortByFreq that takes arr, and n as parameters and returns the sorted array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N). 

Constraints:
1 ≤ N ≤ 105
1 ≤ Ai ≤ 105 */

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;

class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        ArrayList<Pair> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            Pair p = new Pair();
            p.x = e.getKey();
            p.y = e.getValue();
            list.add(p);
        }
        
        Collections.sort(list);
        ArrayList<Integer> result = new ArrayList<>();
        for(Pair p : list){
            for(int i=0; i<p.y; i++)
                result.add(p.x);
        }
        return result;
    }
}

// USER DEFINED CLASS
class Pair implements Comparable<Pair>{
    int x, y;
    
    public int compareTo(Pair p){
        int compare = p.y - this.y;
        if(compare == 0){
            return this.x - p.x;
        }
        return compare;
    }
}

//Total Time Taken: 2.9/4.5