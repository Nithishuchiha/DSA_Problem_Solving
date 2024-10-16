package SortingAlgorithm;

class Count {
     public void countingSortAlgorithm(int inputArray[], int range) {

          int output[] = new int[inputArray.length];
          int countArray[] = new int[range];

          for (int i = 0; i < range; i++) {
               countArray[i] = 0;
          }

          for (int i = 0; i < inputArray.length; i++) {
               ++countArray[inputArray[i]];
          }

          for (int i = 1; i < range; i++) {
               countArray[i] = countArray[i] + countArray[i - 1];
          }

          for (int i = 0; i < inputArray.length; i++) {
               output[--countArray[inputArray[i]]] = inputArray[i];
          }
          for (int i = 0; i < inputArray.length; i++) {
               inputArray[i] = output[i];
          }
          for (int i = 0; i < inputArray.length; i++) {
               System.out.print(inputArray[i] + " ");
          }

     }
}

public class CountingSort {
     public static void main(String[] args) {
          int range = 9;
          int a[] = { 4, 5, 4, 2, 1, 1, 3 };
          Count c = new Count();
          c.countingSortAlgorithm(a, range);

     }
}
