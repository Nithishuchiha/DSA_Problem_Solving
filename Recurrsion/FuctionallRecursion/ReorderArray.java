package Recurrsion.FuctionallRecursion;

public class ReorderArray {
     public static void helperFuction(int i, int arr[], int count, int result[]) {
          int n = arr.length;
          if (i > n - i - 1) {
               return;
          }
          result[count++] = arr[i];
          result[count++] = arr[n - i - 1];

          helperFuction(i + 1, arr, count, result);

     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          int result[] = new int[arr.length];
          // OUTPUT: 1 6 2 5 3 4
          helperFuction(0, arr, 0, result);
          // result[0] = arr[0];
          for (int i = 0; i < arr.length; i++) {
               System.out.print(result[i] + " ");
          }

     }

}
