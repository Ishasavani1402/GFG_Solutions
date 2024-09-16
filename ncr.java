// nCr
// Difficulty: Medium
// Accuracy: 14.82%
// Submissions: 308K+
// Points: 4

//question
// -----------
// Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 109+7.
// Note : If r is greater than n, return 0.

// Example 1:

// Input: n = 3, r = 2
// Output: 3
// Explaination: 3C2 = 3. 
// Example 2:

// Input: n = 2, r = 4
// Output: 0
// Explaination: r is greater than n.
// Your Task:
// You do not need to take input or print anything. Your task is to complete the function nCr() which takes n and r as input parameters and returns nCr modulo 109+7..

// Expected Time Complexity: O(n*r)
// Expected Auxiliary Space: O(r)

// Constraints:
// 1 ≤ n ≤ 1000
// 1 ≤ r ≤ 800
public class ncr {
    static int findncr(int n, int r) {
        int dp[] = new int[r+1];
        dp[0] = 1;
        if(r > n) return 0;
        if(r==0||r==n) return 1;
        if(r>n-r)
        r=n-r;
        int mod = 1000000007;
        for( int i = 0 ; i <= n; i++)
        for(int  j = Math.min(i ,r) ; j>0 ; j--)
        dp[j] =  (dp[j]  + dp[j-1] ) %mod;
        
        return dp[r];

    }

    public static void main(String[] args) {
        System.out.println(findncr(7, 9));
    }
}