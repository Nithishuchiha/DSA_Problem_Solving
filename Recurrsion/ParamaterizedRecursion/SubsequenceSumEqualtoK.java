package Recurrsion.ParamaterizedRecursion;

import java.util.*;

public class SubsequenceSumEqualtoK {
     public static void rec(int i, int arr[], List<Integer> list, int k, int sum, Set<List<Integer>> ans) {

          int n = arr.length;
          if (i > n - 1) {
               System.out.println(list.toString());
               return;
          }

          list.add(arr[i]);
          // sum += arr[i];
          rec(i + 1, arr, list, k, sum, ans);
          list.remove(list.size() - 1);
          // sum -= arr[i];
          rec(i + 1, arr, list, k, sum, ans);

     }

     public static void main(String[] args) {
          Set<List<Integer>> xx = new HashSet<>();
          int arr[] = { 1, 2, 3, 4 };
          int k = 6;
          List<Integer> cur = new ArrayList<>();
          List<Integer> dummyList = new ArrayList<>();

          rec(0, arr, cur, k, 0, xx);

          rec(arr.length - 1, arr, cur, k, 0, xx);
          // recRev(arr.length - 1, arr, cur, k, 0, xx);
          System.out.println(xx.toString());

     }
}