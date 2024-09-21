// Majority Element
// Difficulty: Medium
// Accuracy: 27.82%
// Submissions: 647K+
// Points: 4

// question
// --------------------
// Given an array arr. Find the majority element in the array. If no majority exists, return -1.

// A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

// Examples:

// Input: arr[] = [3, 1, 3, 3, 2]
// Output: 3
// Explanation: Since, 3 is present more than n/2 times, so it is the majority element.
// Input: arr[] = [7]
// Output: 7
// Explanation: Since, 7 is single element and present more than n/2 times, so it is the majority element.
// Input: arr[] = [2, 13]
// Output: -1
// Explanation: Since, no element is present more than n/2 times, so there is no majority element.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ arr.size() ≤ 105
// 0 ≤ arr[i]≤ 105

import java.util.*;
public class majorityelement {

    static int count(int arr[]){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        //searching for maajority element
        for(Map.Entry<Integer,Integer> it : hm.entrySet()){
            if(it.getValue() > arr.length /2){
                return it.getKey();
            }
        }

        return -1;

        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,4,4,6,8,4};
        System.out.println(count(arr));
    }
}
