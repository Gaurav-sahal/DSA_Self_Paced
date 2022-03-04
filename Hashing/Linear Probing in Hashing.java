/*
Linear Probing in Hashing 
Easy Accuracy: 46.12% Submissions: 21795 Points: 2

Linear probing is a collision handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.
Given an array of integers and a hash table size. Fill the array elements into a hash table using Linear Probing to handle collisions. Duplicate elements must be mapped to the same position in the hash table while colliding elements must be mapped to the [(value+1)%hashSise] position.

Example 1:
Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {4,14,24,44}
Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
Explanation: 4%10=4. So put 4 in 
hashtable[4].Now, 14%10=4, but 
hashtable[4] is alreadyfilled so put 
14 in the next slot and so on.

Example 2:
Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {9,99,999,9999}
Output:
99 999 9999 -1 -1 -1 -1 -1 -1 9
Explanation: 9%10=9. So put 9 in 
hashtable[9]. Now, 99%10=9, but 
hashtable[9] is already filled so 
put 99 in the (99+1)%10 =0 slot so
99 goes into hashtable[0] and so on.

Your Task:
You don't need to read input or print anything. Your task is to complete the function linearProbing() which takes the hash table size (hashSize), an integers array arr[] and its size N as input parameters and inserts all the elements of the array arr[] into a hash table. The function should return the hash table. 
The empty cells of the hash table are to be given a value of -1.
Also, if there's no more space to insert a new element, just drop that element. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= hashSize <= 100
1 <= sizeOfArray <= 100
0 <= Array[] <= 105*/

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();
            
            int arr[] = new int[array_size];
            for(int i = 0; i < array_size; i++)
             arr[i] = sc.nextInt();
             
            // int hash_table[] = new int[hash_size];
            // for(int i = 0; i < hash_size; i++)
            //     hash_table[i] = -1;
            Solution obj = new Solution();
            int hash_table[] = obj.linearProbing(hash_size, arr, array_size);
            
            for(int i = 0; i <hash_size; i++)
                System.out.print(hash_table[i] + " ");
             
            System.out.println();
             
        }
    }
    
}// } Driver Code Ends

class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int table[] = new int[hash_size];
        for(int i=0; i<hash_size; i++)
            table[i] = -1;
        
        for(int i=0; i<sizeOfArray; i++){
            int idx = (arr[i] % hash_size);
            int origin_idx = idx; boolean flag = false;
            
            while(table[idx] != -1 && table[idx] != arr[i]){
                idx = (idx + 1) % hash_size;
                if(idx == origin_idx){
                    flag = true;
                    break;
                } 
            }
            if(table[idx] == arr[i]) continue;
            if(flag) continue;
            
            table[idx] = arr[i];
        }        
        return table;
   }
}

//Total Time Taken: 1.9/3.6