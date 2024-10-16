package Searching;

public class LinearSearch {
     public static void main(String[] args) {
          int count = 0, target = 500;
          int a[] = { 10, 20, 30, 40, 50 };

          for (int i = 0; i < a.length; i++) {
               if (a[i] == target) {
                    System.out.println("Index found at " + i);
                    count++;
               }

          }
          if (count == 0) {
               System.out.println("Index not found");
          }
     }

}
