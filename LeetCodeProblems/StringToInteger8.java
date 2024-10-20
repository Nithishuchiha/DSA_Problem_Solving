package LeetCodeProblems;

/**
 * 8.StringToInteger
 */
class Solution {
    public int myAtoi(String s) {
        String output = "";
        int sign = 1;
        boolean firstAppeard = true;
        boolean digitFound = false;

        for (int i = 0; i < s.length(); i++) {
            if (!digitFound && firstAppeard) {
                if (s.charAt(i) == ' ')
                    continue;

            }

            if (s.charAt(i) == '-' && firstAppeard == true) {
                firstAppeard = false;
                sign = -1;
                continue;
            }
            if (s.charAt(i) == '+' && firstAppeard == true) {
                firstAppeard = false;
                sign = 1;
                continue;
            }

            if (Character.isDigit(s.charAt(i))) {
                digitFound = true;
                firstAppeard = false;
                output += s.charAt(i);
            } else {
                break;
            }
        }
        if (output.length() == 0) {
            return 0;
        }
        try {

            return Integer.parseInt(output) * sign;
        } catch (NumberFormatException e) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }

}

public class StringToInteger8 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String input = "42";
        int result = solution.myAtoi(input);
        System.out.println("The result of myAtoi(\"" + input + "\") is: " + result);
    }

}