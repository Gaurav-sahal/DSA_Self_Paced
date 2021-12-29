/*
Possible Words From Phone Digits 
Medium Accuracy: 51.47% Submissions: 17206 Points: 4

Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], the task is to list all words which are possible by pressing these numbers.

Example 1:
Input: N = 3, a[] = {2, 3, 4}
Output:
adg adh adi aeg aeh aei afg afh afi 
bdg bdh bdi beg beh bei bfg bfh bfi 
cdg cdh cdi ceg ceh cei cfg cfh cfi 
Explanation: When we press 2,3,4 then 
adg, adh, adi, ... cfi are the list of 
possible words.

Example 2:
Input: N = 3, a[] = {3, 4, 5}
Output:
dgj dgk dgl dhj dhk dhl dij dik dil 
egj egk egl ehj ehk ehl eij eik eil 
fgj fgk fgl fhj fhk fhl fij fik fil
Explanation: When we press 3,4,5 then 
dgj, dgk, dgl, ... fil are the list of 
possible words.

Your Task:
You don't need to read input or print anything. You just need to complete the function possibleWords() that takes an array a[ ] and N as input parameters and returns an array of all the possible words in lexicographical increasing order. 

Expected Time Complexity: O(4N * N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 10
2 ≤ a[i] ≤ 9*/

// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static String arr[] = new String[]{"0", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        String str = "";
        for(int i : a){
            str += String.valueOf(i);
        }
        //System.out.println("str "+str+" end");
        return findPossibleWords(str);
    }
    
    static ArrayList<String> findPossibleWords(String str){
        if(str.length() == 0){
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("");
            return list1;
        }
        
        char ch = str.charAt(0);    //2 , 3, 4
        String s = str.substring(1);    // 34 , 4, ""
        ArrayList<String> firstList = findPossibleWords(s); // 3*4 words generated
        
        ArrayList<String> list = new ArrayList<>();
        String arrInp = arr[ch - '0'];  //abc
        for(int i=0; i<arrInp.length(); i++){
            char arrInpCh = arrInp.charAt(i);   // a
            for(String strFromFirstList : firstList){
                list.add(arrInpCh + strFromFirstList);
            }
        }
        
        return list;
    }
}

//Total Time Taken: 1.2/2.6
