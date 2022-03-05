/*
Quadratic Probing in Hashing 
Easy Accuracy: 55.98% Submissions: 8807 Points: 2

Quadratic probing is a collision handling technique in hashing. Quadratic probing says that whenever a collision occurs, search for i2 position.
Given an array of integers and a Hash table. Fill the elements of the array into the hash table by using Quadratic Probing in case of collisions.

Example 1:
Input:
hashSize = 11
N = 4
Array[] = {21,10,32,43}
Output: 
10 -1 -1 32 -1 -1 -1 -1 43 -1 21
Explanation: 21%11=10 so 21 goes into 
hashTable[10] position. 10%11=10. 
hashTable[10] is already filled so we try 
for (10+12)%11=0 position. hashTable[0] 
is empty so we put 10 there. 32%11=10. 
hashTable[10] is filled. We try 
(32+12)%11=0. But hashTable[0] is also 
already filled. We try (32+22)%11=3. 
hashTable[3] is empty so we put 32 in 
hashTable[3] position. 43 uses 
(43+33)%11=8. We put it in hashTable[8].

Example 2:
Input:
hashSize = 11
N = 4
Array[] = {880,995,647,172 }
Output:
880 -1 -1 -1 -1 995 -1 172 -1 647 -1 
Explanation: Using the similar approach 
as used in above explanation we will get 
the output like 
880 -1 -1 -1 -1 995 -1 172 -1 647 -1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function QuadraticProbing() which takes the hash table hash[], the hash table size hashSize, an array arr[] and the size of the array N as inputs and inserts all the elements of the array arr[] into the hash table using Quadratic Probing as a collision handling technique.
Note: You need to map duplicate elements incase, they have the same hash value even after quadratic probing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
2 <= hashSize (prime) <= 97
1 <= N < hashSize*0.5
0 <= Array[] <= 105

Note:
All the positions that are unoccupied are denoted by -1 in the hash table.
An empty slot can only be found if load factor < 0.5 and hash table size is a prime number.
The given testcases satisfy the above condition so you can assume that an empty slot is always reachable.*/

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
            int N= sc.nextInt();
            
            int arr[] = new int[N];
            
            for(int i = 0; i < N ; i++)
             arr[i] = sc.nextInt();
             
            int hash_table[] = new int[hash_size];
            Solution obj = new Solution();
            obj.quadraticProbing(hash_table, hash_size, arr, N);
            
            for(int i = 0; i <hash_size; i++)
             System.out.print(hash_table[i] + " ");
             
             System.out.println();
             
        }
    }
    
}
// } Driver Code Ends

class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
        //Your code here
        Arrays.fill(hash, -1);
        for(int i=0; i<N; i++){
            boolean flag = false;
            int idx = arr[i] % hash_size;
            int j=1;
            while(hash[idx] != -1){
                if(hash[idx] == arr[i]){
                    flag = true;
                    break;
                }
                
                idx = (arr[i] % hash_size + (j*j) % hash_size) % hash_size;
                j++;
            }
            if(flag) continue;
            hash[idx] = arr[i];
        }
    }
}

//Total Time Taken: 0.3/1.4