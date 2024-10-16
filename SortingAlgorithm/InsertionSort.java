package SortingAlgorithm;

import java.util.Arrays;

/**
 * InsertionSort
 */

class Sort {
     public void InsertionSortAlgorithm(int arr[]) {
          int n = arr.length;
          for (int i = 1; i < n; i++) {
               int j = i - 1;
               int key = arr[i];
               while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
               }
               arr[j + 1] = key;

          }

          System.out.println(Arrays.toString(arr));
     }
}

public class InsertionSort {
     public static void main(String[] args) {
          Sort s = new Sort();
          int arr[] = { 50, 30, 20, 10, 60 };
          s.InsertionSortAlgorithm(arr);

     }

}