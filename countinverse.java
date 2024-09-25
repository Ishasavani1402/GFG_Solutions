// Count Inversions
// Difficulty: Medium
// Accuracy: 16.93%
// Submissions: 556K+
// Points: 4

// question
// -----------------------
// Given an array of integers. Find the Inversion Count in the array.  Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

// Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
// If an array is sorted in the reverse order then the inversion count is the maximum. 

// Examples:

// Input: arr[] = {2, 4, 1, 3, 5}
// Output: 3
// Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
// Input: arr[] = {2, 3, 4, 5, 6}
// Output: 0
// Explanation: As the sequence is already sorted so there is no inversion count.
// Input: arr[] = {10, 10, 10}
// Output: 0
// Explanation: As all the elements of array are same, so there is no inversion count.
// Expected Time Complexity: O(n*logn).
// Expected Auxiliary Space: O(n).

// Constraints:
// 1 ≤ arr.size(),arr[i] ≤ 105



import java.util.ArrayList;
public class countinverse {

    //bruth-force solution(on2)

    // static long inverse(long arr[]){
    //     long c = 0;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i] > arr[j]){
    //                 c++;
    //             }
    //         }
    //     }
    //     return c;
    // }

    //optimal solution

    public static long performmergesort(long arr[], int low, int high) {
        long c=0;
        if(low >= high) return c=0;
        int mid = (low + high) / 2;
        c+=performmergesort(arr, low, mid);// left subarray
        c+=performmergesort(arr, mid + 1, high);// right subarray
        c+=mergeprocess(arr, low, mid, high);
        return c;
        
    }

    public static long mergeprocess(long arr[], int low, int mid, int high) {
        ArrayList<Long> m = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        long c=0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                m.add(arr[i]);
                i++;
            } else {
                m.add(arr[j]);
                c+=(mid-i+1);
                j++;
                
            }
        }
        while (i <= mid) {
           m.add(arr[i]);
           i++;
        }
        while (j <= high) {
            m.add(arr[j]);
            j++;
        }
       
        for (i = low; i <= high; i++) {
            arr[i] = m.get(i-low);
        }
        return c;
    }


    static long inversecount(long arr[]){
        return performmergesort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        long arr[] = {10,9,8,7,6};
        System.out.println(inversecount(arr));

    }
}
