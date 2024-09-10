// Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all
//     the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

// Examples:

// Input: n = 4, arr[] = [0,3,1,2]
// Output: -1
// Explanation: There is no repeating element in the array. Therefore output is -1.
// Input: n = 5, arr[] = [2,3,1,2,3]
// Output: 2 3 
// Explanation: 2 and 3 occur more than once in the given array.
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(n).

// Constraints:

// 1 <= n <= 105
// 0 <= arr[i] <= 105, for each valid i




package arrayduplicate;

/**
 * arrayduplicate
 */
import java.util.*;

public class arrayduplicate {

    static ArrayList<Integer> duplicate(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        // collect element which occure more then one
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                a.add(entry.getKey());
            }
        }

        Collections.sort(a);
        if (a.isEmpty()) {
            a.add(-1);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       ArrayList<Integer> ans = duplicate(arr);
       for(int i : ans){
        System.out.println(i);
       }
        sc.close();
    }

}
