package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
     public static void main(String[] args) {
          int arr[] = { 50, 10, 20, 60, 100, 90 };
          int n = arr.length;

          for (int i = 0; i < n - 1; i++) {

               for (int j = 0; j < n - i - 1; j++) {

                    if (arr[j + 1] < arr[j]) {

                         int c = arr[j + 1];
                         arr[j + 1] = arr[j];
                         arr[j] = c;
                    }
               }
          }
          System.out.println(Arrays.toString(arr));
     }

}