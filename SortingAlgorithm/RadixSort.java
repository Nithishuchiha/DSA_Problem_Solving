package SortingAlgorithm;

import java.util.Arrays;

//* Class to handle the output and sorting operations */
class OutPutArray {
     // * Method to perform radix sort and print the sorted array */
     public void output(int arr[], int size) {
          // * Find the maximum element in the array to determine the number of digits */
          int m = maxElement(arr, size);
          // * Perform counting sort for each digit, starting from the least significant
          // digit */
          for (int div = 1; m > 0; div *= 10) {
               m = m / 10;
               countingSort(arr, size, div);
          }
          // * Print the sorted array */
          System.out.print(Arrays.toString(arr));
     }

     // * Method to find the maximum element in the array */
     public int maxElement(int arr[], int size) {
          int max = arr[0];
          for (int i = 0; i < size; i++) {
               if (max < arr[i]) {
                    max = arr[i];
               }
          }
          return max;
     }

     // * Method to perform counting sort based on the digit represented by div */
     public int[] countingSort(int arr[], int size, int div) {
          int range = 10; // * Range for digits (0-9) */
          int output[] = new int[size]; // * Output array to store sorted elements */
          int count[] = new int[range]; // * Count array to store the count of each digit */

          // * Initialize count array with zeros */
          for (int i = 0; i < range; i++) {
               count[i] = 0;
          }
          // * Store the count of occurrences of each digit in the count array */
          for (int i = 0; i < size; i++) {
               count[(arr[i] / div) % 10]++;
          }

          // * Change count[i] so that it contains the actual position of this digit in
          // the output array */
          for (int i = 1; i < range; i++) {
               count[i] = count[i - 1] + count[i];
          }

          // * Build the output array */
          for (int i = size - 1; i >= 0; i--) {
               output[count[((arr[i] / div) % 10)] - 1] = arr[i];
               count[(arr[i] / div) % 10]--;
          }

          // * Copy the output array to arr[], so that arr[] now contains sorted numbers
          // according to the current digit */
          for (int i = 0; i < size; i++) {
               arr[i] = output[i];
          }
          return arr;
     }
}

// * Main class to test the radix sort implementation */
public class RadixSort {

     public static void main(String[] args) {
          int arr[] = { 950, 384, 22, 1, 55, 767 }; // * Input array */
          int n = arr.length; // * Size of the array */
          OutPutArray s = new OutPutArray(); // * Create an instance of OutPutArray */
          s.output(arr, n); // * Perform radix sort and print the sorted array */
     }
}