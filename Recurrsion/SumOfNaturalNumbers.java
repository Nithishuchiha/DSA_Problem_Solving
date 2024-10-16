package Recurrsion;

public class SumOfNaturalNumbers {
     public int sum(int num) {
          if (num != 0) {
               return num + sum(num - 1);
          } else {
               return num;
          }
     }

     public static void main(String[] args) {
          SumOfNaturalNumbers s = new SumOfNaturalNumbers();
          System.out.println(s.sum(5));

     }
}
