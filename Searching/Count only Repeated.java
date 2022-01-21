/*
Count only Repeated 
Medium Accuracy: 56.5% Submissions: 8730 Points: 4

Given an array arr[] of N positive integers, where elements are consecutive (sorted). Also, there is a single element which is repeating X (any variable) number of times. Now, the task is to find the element which is repeated and number of times it is repeated.
Note: If there's no repeating element, Return {-1,-1}.

Example 1:
Input:
N = 5
arr[] = {1,2,3,3,4}
Output: 3 2
Explanation: In the given array, 3 is 
occuring two times.

Example 2:
Input:
N = 5
arr[] = {2,3,4,5,5}
Output: 5 2
Explanation: In the given array, 5 is 
occuring two times.

Example 3:
Input:
N = 3
arr[] = {1,2,3}
Output: -1 -1
Explanation: In the given array, there's no
repeating element, and thus the given Output.

Your Task:
Complete findRepeating function and return pair of element which is repeated and the number of times it is repeated. The printing is done by the driver code.

Constraints:
1 <= N <= 107
1 <= arr[i] <= 1015

Expected Time Complexity: O(logN)
Expected Auxilliary Space: O(1)*/

// { Driver Code Starts
//Initial function template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function template for C++
class Solution
{
    public:
    //Function to find repeated element and its frequency.
    pair<int, int> findRepeating(int *arr, int n){
        //code here
        int res = -1, count = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                res = arr[i];
                count++;
            }
        }
        if(res == -1) count = -1;
        pair<int, int> p(res, count);
        return p;
    }
};

// { Driver Code Starts.

int main() {
	
	int t;
	cin >> t;
	
	while(t--){
	    int n;
	    cin >> n;
	    int arr[n];
	    
	    for(int i = 0;i<n;i++){
	        cin >> arr[i];
	    }
	    Solution obj;
	    pair<int, int> ans = obj.findRepeating(arr,n);
	    
	    cout << ans.first << " " << ans.second << endl;
	    
	}
}  // } Driver Code Ends

//Total Time Taken: 0.3/1.4