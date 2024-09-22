// Kadane's Algorithm
// Difficulty: Medium
// Accuracy: 36.28%
// Submissions: 979K+
// Points: 4

// question
// -----------
// Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.

// Examples:

// Input: arr[] = [1, 2, 3, -2, 5]
// Output: 9
// Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
// Input: arr[] = [-1, -2, -3, -4]
// Output: -1
// Explanation: Max subarray sum is -1 of element (-1)
// Input: arr[] = [5, 4, 7]
// Output: 16
// Explanation: Max subarray sum is 16 of element (5, 4, 7)
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ arr.size() ≤ 105
// -107 ≤ arr[i] ≤ 107
public class kadanesalgo {
    //better approach
    static void allsubarraysum(int arr[],int n){
        int max = Integer.MIN_VALUE;
        // int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

    //optimal(kadane's algo.)
    static int max_sum(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum>max){
                max = sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }

public static void main(String[] args) {
    int arr[] = {1,2,3,-2,5};
    allsubarraysum(arr, 5);
    // System.out.println(max_sum(arr));
}    
}