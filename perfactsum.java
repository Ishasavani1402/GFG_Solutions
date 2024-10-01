// Perfect Sum Problem
// Difficulty: Medium
// Accuracy: 20.58%
// Submissions: 394K+
// Points: 4
// Given an array arr of size n of non-negative integers and an integer sum, the task is to count all subsets of the given array with a sum equal to a given sum.

// Note: Answer can be very large, so, output answer modulo 109+7.

// Examples:

// Input: 
// n = 6, arr = [5, 2, 3, 10, 6, 8], sum = 10
// Output: 
// 3
// Explanation: 
// {5, 2, 3}, {2, 8}, {10} are possible subsets.
// Input: 
// n = 5, arr = [2, 5, 1, 4, 3], sum = 10
// Output: 
// 3
// Explanation: 
// {2, 1, 4, 3}, {5, 1, 4}, {2, 5, 3} are possible subsets.

// Expected Time Complexity: O(n*sum)
// Expected Auxiliary Space: O(n*sum)

// Constraints:
// 1 ≤ n*sum ≤ 106
// 0 ≤ arr[i] ≤ 106


import java.util.Arrays;

public class perfactsum {

    int mod = (int) (1e9 + 7);

    public int perfectSum(int arr[], int n, int sum) {
        // Your code goes here
        int[][] dp = new int[n][sum + 1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return f(arr, n - 1, sum, dp);
    }

    public int f(int arr[], int idx, int sum, int[][] dp) {
        // if(sum==0) return 1;
        // if(sum<0) return 0;
        /*
         * if(idx==0){
         * if(arr[0]==sum) return 1; else return 0;}
         */
        if (idx < 0) {
            if (sum == 0)
                return 1;
            else
                return 0;
        }
        if (dp[idx][sum] != -1)
            return dp[idx][sum];
        int nottake = f(arr, idx - 1, sum, dp);
        int take = 0;
        if (arr[idx] <= sum)
            take = f(arr, idx - 1, sum - arr[idx], dp);
        return dp[idx][sum] = (nottake + take) % mod;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {5,2,3,10,6,8};
        int sum=10;
        perfactsum p = new perfactsum();
        System.out.println(p.perfectSum(arr, n, sum));
    }
}
