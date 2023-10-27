/*
Merge Sort on Doubly Linked List
Medium Accuracy:68.49% Submissions:16K+ Points: 4

Given Pointer/Reference to the head of a doubly linked list of N nodes, the task is to Sort the given doubly linked list using Merge Sort in both non-decreasing and non-increasing order.

Example 1:
Input:
N = 8
value[] = {7,3,5,2,6,4,1,8}
Output:
1 2 3 4 5 6 7 8
8 7 6 5 4 3 2 1
Explanation: After sorting the given
linked list in both ways, resultant
matrix will be as given in the first
two line of output, where first line
is the output for non-decreasing
order and next line is for non-
increasing order.

Example 2:
Input:
N = 5
value[] = {9,15,0,-1,0}
Output:
-1 0 0 9 15
15 9 0 0 -1
Explanation: After sorting the given
linked list in both ways, the
resultant list will be -1 0 0 9 15
in non-decreasing order and 
15 9 0 0 -1 in non-increasing order.

Your Task:
The task is to complete the function sortDoubly() which sorts the doubly linked list. The printing is done automatically by the driver code.

Constraints:
1 <= N <= 105*/

//{ Driver Code Starts
import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}

// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        // add your code here
        if(head == null || head.next == null) {
            return head;
        }
        
        Node first = null, second = null;
        
        second = findMidRef(head);
        
        first = sortDoubly(head);
        second = sortDoubly(second);
        head = merge(first, second);
        
        return head;
    }
    
    static Node findMidRef(Node head) {
        
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node second = slow.next;
        slow.next = null;
        
        return second;
    }
    
    static Node merge(Node first, Node second) {
        if(first == null) return second;
        if(second == null) return first;
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        
        while(first != null && second != null) {
            
            if(first.data <= second.data) {
                curr.next = first;
                first.prev = curr;
                first = first.next;
            }else {
                curr.next = second;
                second.prev = curr;
                second = second.next;
            }
            curr = curr.next;
        }
        
        if(first != null) {
            curr.next = first;
            first.prev = curr;
        }
        
        if(second != null) {
            curr.next = second;
            second.prev = curr;
        }
        
        dummy = dummy.next;
        dummy.prev = null;
        
        return dummy;
    }
}