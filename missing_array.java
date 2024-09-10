import java.util.*;
public class missing_array {

    static int miss(int arr[] , int n){
        int nsum = n * (n+1)/2;
        int arrsum = 0;
        for(int i=0;i<n-1;i++){
            arrsum+=arr[i];
        }
        return nsum - arrsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(miss(arr, n));
        sc.close();
    }
}
