/*
Case-specific Sorting of Strings 
Medium Accuracy: 57.47% Submissions: 17936 Points: 4
   
Given a string S consisting of uppercase and lowercase characters. The task is to sort uppercase and lowercase letters separately such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.

Example 1:
Input:
N = 12
S = defRTSersUXI
Output: deeIRSfrsTUX
Explanation: Sorted form of given string
with the same case of character as that
in original string is deeIRSfrsTUX

Example 2:
Input:
N = 6
S = srbDKi
Output: birDKs
Explanation: Sorted form of given string
with the same case of character will
result in output as birDKs.

Your Task:
You only need to complete the function caseSort that returns sorted string.

Expected Time Complexity: O(N*Log(N)).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 103*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

 // } Driver Code Ends

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        String lowerChar = "", upperChar= "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperChar += ch;
            }
            else
                lowerChar += ch;
        }
        char uppr[] = upperChar.toCharArray();
        char lowr[] = lowerChar.toCharArray();
        Arrays.sort(uppr);
        Arrays.sort(lowr);
        
        String result = "";
        for(int i=0, j=0, k=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                result += uppr[j];
                j++;
            }
            else{
                result += lowr[k];
                k++;
            }
        }
        return result;
    }
}// { Driver Code Starts.

class GFG {
    
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        System.out.println(sortedStr);
    	    }
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
  // } Driver Code Ends

//Total Time Taken: 0.37/1.13