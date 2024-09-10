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