// Ceil The Floor
// Difficulty: Easy
// Accuracy: 43.76%
// Submissions: 104K+
// Points: 2

// question
// -----------------
// Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

// Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
// Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

// Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

// Examples:

// Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
// Output: 6, 8
// Explanation: Floor of 7 is 6 and ceil of 7 is 8.
// Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
// Output: 8, -1
// Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints :
// 1 ≤ arr.size ≤ 105
// 1 ≤ arr[i], x ≤ 106

import java.util.*;
public class getfloor_ceil {

    static int[] getf_c(int arr[],int x){
        int floar = -1;
        int ceil = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <=x && arr[i] > floar){
                floar = arr[i];
            }
            if(arr[i] >= x && (ceil == -1 || arr[i] < ceil)){
                ceil = arr[i];
                }
        }
     
        return new int[] {floar , ceil};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int k = sc.nextInt();
        int[] result = getf_c(arr, k);
        for(int  i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        sc.close();
    
    }
}
