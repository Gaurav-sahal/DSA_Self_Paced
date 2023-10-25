/*
Swap Kth nodes from ends
Medium Accuracy:35.5% Submissions:50K+ Points: 4

Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not change the content of the nodes.

Example 1:
Input:
N = 4,  K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after
swapping the 1st node from the beginning
and end thenew list will be 4 2 3 1.
 
Example 2:
Input:
N = 5,  K = 7
value[] = {1,2,3,4,5}
Output: 1
Explanation: K > N. Swapping is invalid. 
Return the head node as it is.
 
Your Task: 
You do not need to read input or print anything. The task is to complete the function swapkthnode(), which has takes head of link list, N and K as input parameters and returns the new head.
The generated output will be 1 if you are able to complete your task. 

Expected Time Complexity: O(n)
Expected Auxillary space Complexity: O(1)

Constraints:
1 <= N <= 103
1 <= K <= 103*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           boolean f=true;
    
        for(int i=0; i<num; i++){
            if((i==K-1) || (i==num - K)){
                if(!((before[K-1] == after[num - K]) && (before[num-K] == after[K-1]))) f=false;
            }else{
                if(before[i] != after[i]) f=true;
            }
        }
        return f;
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}
// } Driver Code Ends


//User function Template for Java


/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        if(K > num) return head;
        if(K == num - K + 1) return head;
        
        Node beg = head, beg_prev = null;
        Node end = head, end_prev = null;
        
        for(int i=1; i<K; i++) {
            beg_prev = beg;
            beg = beg.next;
        }
        
        for(int i=1; i<num-K+1; i++) {
            end_prev = end;
            end = end.next;
        }
        
        if(beg_prev != null) {
            beg_prev.next = end;
        }
        
        if(end_prev != null) {
            end_prev.next = beg;
        }
        
        Node swapRef = beg.next;
        beg.next = end.next;
        end.next = swapRef;
        
        if(K == 1) {
            return end;
        }
        if(K == num) {
            return beg;
        }
        
        return head;
    }
}