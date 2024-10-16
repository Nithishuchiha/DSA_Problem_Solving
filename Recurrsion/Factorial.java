package Recurrsion;

public class Factorial {
     public int fact(int num) {
          if (num != 1) {
               return num * fact(num - 1);
          }
          return num;
     }

     public static void main(String[] args) {

          Factorial f = new Factorial();

          System.out.println(f.fact(5));
     }

}
