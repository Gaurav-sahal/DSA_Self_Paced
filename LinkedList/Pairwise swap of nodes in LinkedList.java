/*
Pairwise swap of nodes in LinkedList
Medium Accuracy:71.8% Submissions:15K+ Points:4

Given a linked list of N positive integers. You need to swap elements pairwise. Your task is to complete the function pairwise_swap().

Example 1:
Input:
N = 7
value[] = {1,2,3,4,5,6,7}
Output: 2 1 4 3 6 5 7
Explanation:The linked list after swapping
becomes: 1 2 3 4 5 6 7 -> 2 1 4 3 6 5 7.

Example 2:
Input:
N = 6
value[] = {1,2,3,4,5,6}
Output: 2 1 4 3 6 5
Explanation:The linked list after swapping
becomes: 1 2 3 4 5 6 -> 2 1 4 3 6 5.

Your Task:
You don't have to worry about input and output, you just have to complete the function pairwise_swap(). The printing is done automatically by the driver code.

Constraint:
2 <= N <= 100
1 <= Node values <= 1000

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

 //static Node head; 
  
   class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 

public class LinkedList1
{
    static  Node head;  // head of lisl
    static  Node lastNode;
    //static PrintWriter out;
    /* Linked list Node*/


    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            lastNode.next = node;
            lastNode = node;
        }
    }
    /* Function to print linked list */
     static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        //System.out.println();
    }



    /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //out = new PrintWriter(new BufferedOutputStream(System.out));
        int t= Integer.parseInt(br.readLine());
            
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine());
            Node head = null;

            //LinkedList1 llist = new LinkedList1();
                        String str = br.readLine();
                        String nums[] = str.trim().split("\\s+");
            
                int a1= Integer.parseInt(nums[0]);
                head= new Node(a1);
                addToTheLast(head);
            
            for (int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(nums[i]);
                addToTheLast(new Node(a));
            }


            head = new Swap().pairwise_swap(head);
            
            printList(head);
            System.out.println();
            
            t--;
        }
        //out.close();
    }
}

// } Driver Code Ends
//User function Template for Java

/*class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } */
class Swap
{
    //Function to swap elements pairwise.
    public static Node pairwise_swap(Node node)
    {
        // your code here
        if(node == null || node.next == null) return node;
        
        Node next = node.next.next;
        Node curr = node, prev = curr;
        Node head = node.next;
        
        curr.next.next = curr;
        prev = curr;
        curr = next;
        
        while(curr != null && curr.next != null) {
            next = curr.next.next;
            prev.next = curr.next;
            prev.next.next = curr;
            prev = curr;
            curr = next;
        }
        prev.next = curr;
        
        return head;
    }
       
}