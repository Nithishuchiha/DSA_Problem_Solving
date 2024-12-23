package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queen {

     public static boolean isSafe(int row, int col, String[][] curBoard) {
          int curRow = row;
          int curCol = col;

          /* To check the ypper diagonal diagonal queen */
          while (curRow >= 0 && curCol >= 0) {
               if (curBoard[curRow][curCol] == "Q")
                    return false;
               curRow--;
               curCol--;
          }

          curRow = row;
          curCol = col;

          while (curCol >= 0 && curRow >= 0) {
               if (curBoard[curRow][curCol] == "Q")
                    return false;
               curCol--;

          }

          curRow = row;
          curCol = col;

          /* To check the lower diagonal queen */
          while (curRow < curBoard.length && curCol >= 0) {
               if (curBoard[curRow][curCol] == "Q")
                    return false;
               curRow++;
               curCol--;
          }

          return true;
     }

     public static void solve(List<String[][]> board, int n, int col, String[][] curBoard) {

          if (col > n - 1) {
               String[][] copy = new String[n][n];
               for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                         copy[i][j] = curBoard[i][j];
                    }
               }

               board.add(copy);
               return;
          }
          for (int row = 0; row < n; row++) {
               if (isSafe(row, col, curBoard)) {
                    curBoard[row][col] = "Q";
                    solve(board, n, col + 1, curBoard);
                    curBoard[row][col] = ".";
               }
          }

     }

     public static void main(String[] args) {
          int n = 4;
          String board[][] = {
                    { ".", ".", ".", "." },
                    { ".", ".", ".", "." },
                    { ".", ".", ".", "." },
                    { ".", ".", ".", "." },

          };
          List<String[][]> result = new ArrayList<>();
          solve(result, n, 0, board);
          for (String[][] e : result) {
               for (int i = 0; i < n; i++) {

                    for (int j = 0; j < n; j++) {
                         System.out.print(e[i][j] + " ");
                    }
                    System.out.println();
               }
          }

     }

}