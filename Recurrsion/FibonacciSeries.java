package Recurrsion;

public class FibonacciSeries {
     public static int fib(int n) {

          if (n == 1) {
               return 1;
          }
          if (n == 2) {
               return 2;
          }

          return fib(n - 1) + fib(n - 2);
     }

     public static void main(String[] args) {
          System.out.println(fib(5));
     }

}
