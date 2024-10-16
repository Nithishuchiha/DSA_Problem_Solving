package Recurrsion.ParamaterizedRecursion;

public class FibonaaciSeriesBetweenNumbers {
     public static void printFibonacciSeries(int a, int b, int start, int end) {
          if (a + b > end) {

               return;
          }
          if (a + b > start) {
               System.out.print(a + b + " ");
          }
          printFibonacciSeries(b, a + b, start, end);

     }

     public static void main(String[] args) {
          int start = 5;
          int end = 13;
          if (start == 0) {

               System.out.print(0 + " ");
               System.out.print(1 + " ");
          }
          printFibonacciSeries(0, 1, start, end);

     }
}
