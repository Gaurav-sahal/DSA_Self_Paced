/*
Merge Sort for Linked List
Medium Accuracy:74.76% Submissions:63K+ Points:4

Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.

Example 1:
Input:
N = 5
value[]  = {3,5,2,4,1}
Output: 1 2 3 4 5
Explanation: After sorting the given
linked list, the resultant matrix
will be 1->2->3->4->5.

Example 2:
Input:
N = 3
value[]  = {9,15,0}
Output: 0 9 15
Explanation: After sorting the given
linked list , resultant will be
0->9->15.

Your Task:
For C++ and Python: The task is to complete the function mergeSort() which sort the linked list using merge sort function.
For Java: The task is to complete the function mergeSort() and return the node which can be used to print the sorted linked list.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 105*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head == null || head.next == null) return head;
        
        Node mid = findMid(head);
        Node first = mergeSort(head);
        Node second = mergeSort(mid);
        Node result = merge(first, second);
        
        return result;
    }
    
    static Node findMid(Node head) {
        if(head == null || head.next == null) return head;
        
        Node first = head, second = head;
        
        while(first != null && first.next != null && first.next.next != null) {
            first = first.next.next;
            second = second.next;
        }
        
        Node next = second.next;
        second.next = null;
        second = next;
        
        return second;
    }
    
    static Node merge(Node head1, Node head2) {
        Node curr1 = head1, curr2 = head2, curr = null, head = null;
        
        while(curr1 != null && curr2 != null) {
            if(curr1.data <= curr2.data) {
                if(head == null) {
                    head = curr1;
                    curr = curr1;
                }
                else {
                    curr.next = curr1;
                    curr = curr1;
                }
                curr1 = curr1.next;
            }
            else {
                if(head == null) {
                    head = curr2;
                    curr = curr2;
                }
                else {
                    curr.next = curr2;
                    curr = curr2;
                }
                curr2 = curr2.next;
            }
        }
        
        if(curr1 != null) {
            curr.next = curr1;
        }
        
        if(curr2 != null) {
            curr.next = curr2;
        }
        
        return head;
    }
}