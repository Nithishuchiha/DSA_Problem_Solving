package Backtracking;

public class Print1toN {
     public static void func(int i, int n) {
          if (i < 1) {
               return;
          }
          func(i - 1, n);
          System.out.print(i + " ");
     }

     public static void main(String[] args) {
          func(5, 5);
     }

}