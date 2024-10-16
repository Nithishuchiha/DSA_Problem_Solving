package Backtracking;

public class PrintNto1 {
     public static void func(int i, int n) {
          if (i > n) {
               return;
          }
          func(i + 1, n);
          System.out.print(i + " ");
     }

     public static void main(String[] args) {
          func(1, 5);
     }

}