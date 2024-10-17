package Recurrsion.ParamaterizedRecursion;

/**
 * PalindromeStringBoolean
 */
public class PalindromeStringBoolean {
     public static boolean checkPalindrome(int i, int j, String check) {
          if (i >= j) {
               return true;
          }
          if (check.charAt(i) != check.charAt(j)) {
               return false;
          }
          return checkPalindrome(i + 1, j - 1, check);
     }

     public static void main(String[] args) {
          String x = "MADAM";
          if (checkPalindrome(0, x.length() - 1, x)) {
               System.out.println("Given String is palindrome");
          } else {
               System.out.println("Given String is not palindrome");

          }
          // if(checkPalindrome(0, 0, x))

     }
}