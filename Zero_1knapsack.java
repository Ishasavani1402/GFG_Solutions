// 0 - 1 Knapsack Problem
// Difficulty: Medium
// Accuracy: 31.76%
// Submissions: 441K+
// Points: 4

// question
// ------------
// You are given weights and values of items, and put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
// In other words, given two integer arrays val and wt which represent values and weights associated with items respectively. Also given an integer W which represents knapsack capacity, find out the maximum sum values subset of val[] such that the sum of the weights of the corresponding subset is smaller than or equal to W. You cannot break an item, either pick the complete item or don't pick it (0-1 property).

// Examples :

// Input: W = 4, val[] = {1,2,3}, wt[] = {4,5,1}
// Output: 3
// Explanation: Choose the last item that weighs 1 unit and holds a value of 3. 
// Input: W = 3, val[] = {1,2,3}, wt[] = {4,5,6}
// Output: 0
// Explanation: Every item has a weight exceeding the knapsack's capacity (3).
// Expected Time Complexity: O(N*W).
// Expected Auxiliary Space: O(N*W)

// Constraints:
// 2 ≤ N ≤ 1000
// 1 ≤ W ≤ 1000
// 1 ≤ wt[i] ≤ 1000
// 1 ≤ val[i] ≤ 1000


public class Zero_1knapsack {

    static private int func(int indx, int w, int val[], int we[], int k[][]) {
        if (indx == 0) {
            if (we[0] <= w) {
                return val[0];
            }
            return 0;
        }
        if (k[indx][w] != -1) {
            return k[indx][w];
        }
        int nottake = func(indx - 1, w, val, we, k);
        int take = Integer.MIN_VALUE;
        if (we[indx] <= w) {
            take = val[indx] + func(indx - 1, w - we[indx], val, we, k);
        }
        return k[indx][w] = Math.max(nottake, take);
    }

    static int knapSack(int W, int wt[], int val[]) {
        int n = val.length;
        int k[][] = new int[n][W + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= W; j++) {
                k[i][j] = -1;
            }
        }
        return func(n - 1, W, wt, val, k);
    }

    public static void main(String[] args) {
        int val[] = { 1, 2, 3 };
        int we[] = { 4, 5, 1 };
        int w = 4;
        System.out.println(knapSack(w, val, we));
    }
}