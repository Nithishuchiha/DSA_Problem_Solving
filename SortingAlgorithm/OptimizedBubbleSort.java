package SortingAlgorithm;

import java.util.Arrays;

/**
 * OptimizedBubbleSort
 */
public class OptimizedBubbleSort {

     public static void main(String[] args) {
          int arr[] = { 5, 2, 4, 3, 6 };
          // IN THESE ARRAY ALL THE ARRAY SHOULD BE SORTED IN 2 ROUNDS

          for (int i = 0; i < arr.length - 1; i++) {
               boolean flag = false;
               for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         flag = true;
                         arr[j] = arr[j] ^ arr[j + 1];
                         arr[j + 1] = arr[j] ^ arr[j + 1];
                         arr[j] = arr[j + 1] ^ arr[j];

                    }
               }
               if (flag == false) {
                    break;
               }
          }
          System.out.println(Arrays.toString(arr));

     }
}