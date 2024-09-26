// Nth Fibonacci Number
// Difficulty: Easy
// Accuracy: 22.3%
// Submissions: 332K+
// Points: 2

// question
// -------------------
// Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

// Note: for the reference of this question take first fibonacci number to be 1.

// Examples :

// Input: n = 2
// Output: 1 
// Explanation: 1 is the 2nd number of fibonacci series.
// Input: n = 5
// Output: 5
// Explanation: 5 is the 5th number of fibonacci series.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

// Constraints:
// 1<= n <=105

public class nth_fib {

    static int nthFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib = 1;
        int fib1 = 1;
        int mod = 1000000007;
        for (int i = 3; i <= n; i++) {
            int r = (fib + fib1) % mod;
            fib = fib1;
            fib1 = r;
        }
        return fib1;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(nthFibonacci(n));
    }

}