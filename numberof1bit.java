// question
// ----------
// Number of 1 Bits
// Difficulty: EasyAccuracy: 76.5% Submissions: 138K+ Points: 2
// Given a positive integer n. Your task is to return the count of set bits.

// Examples:

// Input: n = 6
// Output: 2
// Explanation: Binary representation is '110', so the count of the set bit is 2.
// Input: n = 8
// Output: 1
// Explanation: Binary representation is '1000', so the count of the set bit is 1.
// Expected Time Complexity: O(logn)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ n ≤ 109
public class numberof1bit {
    static int setbit(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setbit(6));
    }

}