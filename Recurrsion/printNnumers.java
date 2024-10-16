package Recurrsion;

public class printNnumers {
     public static void print(int startIndex, int n) {
          if (startIndex > n) {
               return;
          }
          System.out.print(startIndex + " ");
          print(startIndex + 1, n);

     }

     public static void main(String[] args) {
          print(0, 5);
     }
}
