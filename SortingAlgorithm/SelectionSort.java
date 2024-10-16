package SortingAlgorithm;

import java.util.Arrays;

class Sorting {

     public void sort(int arr[]) {
          for (int i = 0; i < arr.length - 1; i++) {
               int min = i;
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min] > arr[j]) {
                         min = j;
                    }
               }

               int c = arr[i];
               arr[i] = arr[min];
               arr[min] = c;
          }
          System.out.println(Arrays.toString(arr));

     }
}

public class SelectionSort {
     public static void main(String[] args) {
          int arr[] = { 100, 90, 10, 50, 60 };
          Sorting s = new Sorting();
          s.sort(arr);

     }

}
