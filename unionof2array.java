// Union of Two Sorted Arrays
// Difficulty: MediumAccuracy: 31.39%Submissions: 308K+Points: 4
// Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.

// Example 1:

// Input: 
// n = 5, arr1[] = {1, 2, 3, 4, 5}  
// m = 5, arr2 [] = {1, 2, 3, 6, 7}
// Output: 
// 1 2 3 4 5 6 7
// Explanation: 
// Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
// Example 2:

// Input: 
// n = 5, arr1[] = {2, 2, 3, 4, 5}  
// m = 5, arr2[] = {1, 1, 2, 3, 4}
// Output: 
// 1 2 3 4 5
// Explanation: 
// Distinct elements including both the arrays are: 1 2 3 4 5.
// Example 3:

// Input:
// n = 5, arr1[] = {1, 1, 1, 1, 1}
// m = 5, arr2[] = {2, 2, 2, 2, 2}
// Output: 
// 1 2
// Explanation: 
// Distinct elements including both the arrays are: 1 2.
// Your Task: 
// You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays.

// Expected Time Complexity: O(n+m).
// Expected Auxiliary Space: O(n+m).

// Constraints:
// 1 <= n, m <= 105
// -109 <= arr1[i], arr2[i] <= 109


import java.util.*;

public class unionof2array {

    static ArrayList<Integer> union(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> u = new HashSet<>();
        for (int i = 0; i < n; i++) {
            u.add(arr1[i]);
        }
        for (int j = 0; j < m; j++) {
            u.add(arr2[j]);
        }
        ans.addAll(u);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = union(arr1, arr2, n, m);
        for(int i : ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
