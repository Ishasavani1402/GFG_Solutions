// You are given a positive integer N, 
// return the sum of all prime numbers between 1 and N(inclusive).
 

// Example 1:

// Input: N = 5
// Output: 10
// Explanation: 2, 3, and 5 are prime
// numbers between 1 and 5(inclusive), and their sum is 2 + 3 + 5 = 10.
// Example 2:

// Input: N = 10
// Output: 17
// Explanation: 2, 3, 5 and 7 are prime
// numbers between 1 and 10(inclusive), and their sum is 2 + 3 + 5 + 7 = 17.
 

// Your Task:
// You don't need to read or print anything. Your task is to complete the function prime_Sum() which takes integer N as an input parameter and returns the sum of all primes between 1 and N(inclusive).
 

// Expected Time Complexity: O(N*log(log(N)))
// Expected Space Complexity: O(N)

// Constraints:
// 1 <= N <= 1000000


public class sumofallprime0_n {

   private static boolean isprime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long prime(int n) {
        // int count = 0;
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                // count++;
                sum+=i;
            }
        }
    
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(prime(978784));
    }
}