package SortingAlgorithm;

import java.util.Arrays;

/**
 * QuickSort
 */
class SortingQuick {
     public void quickSort(int arr[], int start, int end) {
          if (start < end) {
               int p = partition(arr, start, end);
               quickSort(arr, start, p - 1);
               quickSort(arr, p + 1, end);

          }

     }

     public int partition(int arr[], int start, int end) {
          int pivot = arr[end];

          // These index Organize the elements which is less than pivot to the left side
          // and Organize an element to the right side which is higher than pivot
          int pindex = start;
          for (int i = start; i < end; i++) {
               if (arr[i] <= pivot) {
                    if (i != pindex) {
                         arr[i] = arr[i] ^ arr[pindex];
                         arr[pindex] = arr[i] ^ arr[pindex];
                         arr[i] = arr[pindex] ^ arr[i];
                    }

                    pindex++;

               }
          }
          // SET THE PIVOT ELEMENT MIDDLE WHICH MEANS SMALLER ELEMENTS IN THE LEFT
          // AND GREATER ELEMENTS IN RIGHT
          int temp = arr[end];
          arr[end] = arr[pindex];
          arr[pindex] = temp;
          return pindex;

     }
}

public class QuickSort {
     public static void main(String[] args) {
          int arr[] = { 9, 3, 8, 6, 5 };
          int end = arr.length - 1;
          SortingQuick s = new SortingQuick();
          s.quickSort(arr, 0, end);
          System.out.println(Arrays.toString(arr));

     }

}
