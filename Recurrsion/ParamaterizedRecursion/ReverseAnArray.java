package Recurrsion.ParamaterizedRecursion;

/**
 * ReverseAnArray
 */
public class ReverseAnArray {
     public static void reverse(int left, int right, int arr[]) {
          if (left >= right) {
               return;
          }
          int c = arr[left];
          arr[left] = arr[right];
          arr[right] = c;
          reverse(left + 1, right - 1, arr);
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5, 6 };
          reverse(0, arr.length - 1, arr);
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }

     }
}