package Searching;

import java.util.*;

public class BinarySearch {

     public static void main(String[] args) {

          int n = 5;

          int a[] = { 20, 10, 50, 40, 30 };

          Arrays.sort(a);
          int target = 100;

          int lowerNum = 0;
          int upperNum = n - 1;

          if (target < a[n - 1]) {
               while (upperNum >= lowerNum) {

                    int mid = (upperNum + lowerNum) / 2;
                    if (a[mid] == target) {
                         System.out.println("Index at " + mid);
                         break;
                    } else if (a[mid] > target) {
                         upperNum = mid - 1;
                    } else if (a[mid] < target) {
                         lowerNum = mid + 1;
                    }

               }

          } else {
               System.out.println("Index not found");
          }

     }

}