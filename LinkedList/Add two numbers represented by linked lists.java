/*
Add two numbers represented by linked lists
Medium Accuracy:34.52% Submissions:215K+ Points: 4

Given two decimal numbers represented by two linked lists of size N and M respectively. The task is to return a linked list that represents the sum of these two numbers.
For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Example 1:
Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).

Example 2:
Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked
list (6 3) and (7), after adding the
two linked list resultant linked list
will be (7 0).

Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.   

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(Max(N,M)) for the resultant list.

Constraints:
1 <= N, M <= 5000*/

//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node firstRev = reverse(first);
        Node secondRev = reverse(second);
        
        int carry = 0;
        
        Node head = null, tail = null;
        
        while(firstRev != null && secondRev != null) {
            int sum = firstRev.data + secondRev.data;
            Node temp = new Node((carry + sum) % 10);
            carry = (carry + sum) / 10;
            if(head == null) {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            firstRev = firstRev.next;
            secondRev = secondRev.next;
        }
        
        while(firstRev != null) {
            tail.next = firstRev;
            tail = firstRev;
            if(carry == 0) {
                break;
            } else {
                int data = firstRev.data;
                firstRev.data = (data + carry) % 10;
                carry = (carry + data) / 10;
            }
            firstRev = firstRev.next;
        }
        
        while(secondRev != null) {
            tail.next = secondRev;
            tail = secondRev;
            if(carry == 0) {
                break;
            } else {
                int data = secondRev.data;
                secondRev.data = (data + carry) % 10;
                carry = (carry + data) / 10;

            }
            secondRev = secondRev.next;
        }
        
        if(carry != 0) {
            Node temp = new Node(carry);
            tail.next = temp;
            tail = temp;
        }

        return reverse(head);
    }
    
    static Node reverse(Node head) {
        Node next = null, prev = null, curr = head;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}