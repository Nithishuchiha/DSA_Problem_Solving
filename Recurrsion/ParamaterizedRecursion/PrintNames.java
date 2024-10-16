package Recurrsion.ParamaterizedRecursion;

public class PrintNames {
     public static void printName(int start, int n, String name) {
          if (start > n) {
               return;
          }
          System.out.println(name);
          printName(start + 1, n, name);
     }

     public static void main(String[] args) {
          printName(1, 5, "Nithish");
     }

}
