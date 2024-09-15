// K-th element of two Arrays
// Difficulty: MediumAccuracy: 37.4% 
// Submissions: 271K+ 
// Points: 4
// question
// ----------
// Given two sorted arrays arr1 and arr2 and an element k. The task is to find the element that would be at the kth position of the combined sorted array.

// Examples :

// Input: k = 5, arr1[] = [2, 3, 6, 7, 9], arr2[] = [1, 4, 8, 10]
// Output: 6
// Explanation: The final combined sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10. The 5th element of this array is 6.
// Input: k = 7, arr1[] = [100, 112, 256, 349, 770], arr2[] = [72, 86, 113, 119, 265, 445, 892]
// Output: 256
// Explanation: Combined sorted array is - 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892. 7th element of this array is 256.
// Expected Time Complexity: O(log(n) + log(m))
// Expected Auxiliary Space: O(log (n))

// Constraints:
// 1 <= k<= arr1.size()+arr2.size()
// 1 <= arr1.size(), arr2.size() <= 106
// 0 <= arr1[i], arr2[i] < 108



public class kthelement {

    static long k_elmnt(int arr1[], int arr2[], int k) {
        int i = 0, j = 0, k1 = 0;
        int m = arr1.length;
        int n = arr2.length;
        long arr3[] = new long[m + n];
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k1++] = arr1[i++];
            } else {
                arr3[k1++] = arr2[j++];
            }
        }
        while (i < m) {
            arr3[k1++] = arr1[i++];
        }
        while (j < n) {
            arr3[k1++] = arr2[j++];
        }
        return arr3[k - 1];
    }

    public static void main(String[] args) {
        int arr1[] = {100, 112, 256, 349, 770 };
        int arr2[] = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
       System.out.println(k_elmnt(arr1, arr2, k));
    }
}
