package SortingAlgorithm;

import java.util.Arrays;

//* Class to handle the merging and sorting operations */
class Merging {
     // * Method to perform merge sort on the array */
     public void mergeSort(int arr[], int l, int r) {
          if (l < r) {
               int mid = (l + r) / 2;
               // * Recursively sort the first half */
               mergeSort(arr, l, mid);
               // * Recursively sort the second half */
               mergeSort(arr, mid + 1, r);
               // * Merge the two sorted halves */
               merge(arr, l, r, mid);
          }
     }

     // * Method to merge two halves of the array */
     public void merge(int arr[], int l, int r, int mid) {
          int i = l, j = mid + 1, k = l;
          int temp[] = new int[arr.length];
          // * Merge the two halves into temp[] */
          while (i <= mid && j <= r) {
               if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                    k++;
               } else {
                    temp[k] = arr[j];
                    j++;
                    k++;
               }
          }
          // * Copy the remaining elements of the left half, if any */
          while (i <= mid) {
               temp[k] = arr[i];
               i++;
               k++;
          }
          // * Copy the remaining elements of the right half, if any */
          while (j <= r) {
               temp[k] = arr[j];
               j++;
               k++;
          }
          // * Copy the merged elements back into the original array */
          for (int p = l; p <= r; p++) {
               arr[p] = temp[p];
          }
     }

}

// * Main class to test the merge sort implementation */
public class MergeSort {
     public static void main(String[] args) {
          int arr[] = { 9, 7, 3, 5, 2 }; // * Input array */
          int l = 0; // * Starting index */
          int r = arr.length - 1; // * Ending index */
          Merging m = new Merging(); // * Create an instance of Merging */
          m.mergeSort(arr, l, r); // * Perform merge sort on the array */
          System.out.println(Arrays.toString(arr)); // * Print the sorted array */
     }
}