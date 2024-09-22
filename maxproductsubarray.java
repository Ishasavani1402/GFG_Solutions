// Maximum Product Subarray
// Difficulty: Medium
// Accuracy: 18.09%
// Submissions: 377K+
// Points: 4

// question
// -----------------------
// Given an array arr[] that contains n integers (may be positive, negative or zero). Find the product of the maximum product subarray.

// Note: It is guarenteed that the output fits in 64-bit integer.

// Examples

// Input: arr[] = {6, -3, -10, 0, 2}, n = 5
// Output: 180
// Explanation:  The subarray [6, -3, -10] gives max product as 180.
// Input: arr[] = {2, 3, 4, 5, -1, 0}, n = 6
// Output: 120
// Explanation: The subarray [2, 3, 4, 5] gives max product as 120.
// Input: arr[] = {2, 3, 4}, n = 3
// Output: 24
// Explanation: For an array with all positive elements, the result is product of all elements.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ n ≤ 500
// -102 ≤ arr[i] ≤ 102
public class maxproductsubarray {

    static long product(int arr[]) {
        long p1 = arr[0], p2 = arr[0], r = arr[0];
        for (int i = 1; i < arr.length; i++) {
            long temp = Math.max(arr[i], Math.max(p1 * arr[i], p2 * arr[i]));
            p2 = Math.min(arr[i], Math.min(p1 * arr[i], p2 * arr[i]));
            p1 = temp;
            r = Math.max(r, p1);
        }
        return r;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        System.out.println(product(arr));
    }
}
