package Recurrsion.ParamaterizedRecursion;

public class PalindromeString {
     public static String checkPalindrome(int i, String check) {

          if (i < 0) {
               return "";
          }
          return check.charAt(i) + checkPalindrome(i - 1, check);
     }

     public static void main(String[] args) {
          String x = "appae";
          String reversed = checkPalindrome(x.length() - 1, x);
          System.out.println(reversed);
          if (reversed.equals(x)) {
               System.out.println("Given string is palindrome");
          } else {

               System.out.println("Given string is not palindrome");
          }
     }
}
