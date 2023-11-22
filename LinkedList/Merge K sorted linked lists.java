/*
Merge K sorted linked lists
Medium Accuracy:57.01% Submissions:72K+ Points:4

Given K sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list.

Example 1:
Input:
K = 4
value = {{1,2,3},{4 5},{5 6},{7,8}}
Output: 1 2 3 4 5 5 6 7 8
Explanation:
The test case has 4 sorted linked 
list of size 3, 2, 2, 2
1st    list     1 -> 2-> 3
2nd   list      4->5
3rd    list      5->6
4th    list      7->8
The merged list will be
1->2->3->4->5->5->6->7->8.

Example 2:
Input:
K = 3
value = {{1,3},{4,5,6},{8}}
Output: 1 3 4 5 6 8
Explanation:
The test case has 3 sorted linked
list of size 2, 3, 1.
1st list 1 -> 3
2nd list 4 -> 5 -> 6
3rd list 8
The merged list will be
1->3->4->5->6->8.

Your Task:
The task is to complete the function mergeKList() which merges the K given lists into a sorted one. The printing is done automatically by the driver code.

Expected Time Complexity: O(nk Logk)
Expected Auxiliary Space: O(k)
Note: n is the maximum size of all the k link list

Constraints
1 <= K <= 103*/

//{ Driver Code Starts
import java.util.*;

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


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        if(K == 1) return arr[0];
        
        Node head = mergeTwoSorted(arr[0], arr[1]);
        
        for(int i=2; i<K; i++) {
            head = mergeTwoSorted(head, arr[i]);
        }
        
        return head;
    }
    
    Node mergeTwoSorted(Node head1, Node head2) {
        
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
