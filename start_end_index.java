import java.util.*;
class start_end_index {
  // Function to find starting and end index
  static int[] findIndex(int arr[], int key) {
    int index[] = new int[2];
    Arrays.fill(index, -1);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        index[0] = i;
        break;
      }
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == key) {
        index[1] = i;
        break;
      }
    }
    return index;
  }
}