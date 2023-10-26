/*
Given a linked list of 0s, 1s and 2s, sort it.
Easy Accuracy:60.75% Submissions:151K+ Points: 2

Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:
Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.

Example 2:
Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.

Your Task:
The task is to complete the function segregate() which segregates the nodes in the linked list as asked in the problem statement and returns the head of the modified linked list. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 106*/

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
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
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
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node curr = head;
        Node res = new Node(-1);
        Node zero = res, one = res, two = res;
        
        while(curr != null) {
            int data = curr.data;
            Node temp = curr;
            curr = curr.next;
            
            if(data == 0) {
                temp.next = zero.next;
                zero.next = temp;
                zero = temp;
            }
            
            else if(data == 1) {
                if(one != res) {
                    temp.next = one.next;
                    one.next = temp;
                    one = temp;
                }
                else if(zero != res) {
                    temp.next = zero.next;
                    zero.next = temp;
                    one = temp;
                }
                else {
                    temp.next = one.next;
                    one.next = temp;
                    one = temp;
                }
            }
            
            else if(data == 2) {
                if(two != res) {
                    temp.next = two.next;
                    two.next = temp;
                    two = temp;
                }
                else if(one != res) {
                    temp.next = one.next;
                    one.next = temp;
                    two = temp;
                }
                else if(zero != res) {
                    temp.next = zero.next;
                    zero.next = temp;
                    two = temp;
                }
                else {
                    temp.next = two.next;
                    two.next = temp;
                    two = temp;
                }
            }
            // curr = curr.next;
        }
        return res.next;
    }
}