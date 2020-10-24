import java.util.Arrays;


public class Tester {
  public static void main(String[] args) {
    ArrayOps myAnswers = new ArrayOps();

    // --- The following are to test sum() ---
    // int[] myArray1 = {0, 1, 2, 3, 4, 5};
    // System.out.println(myAnswers.sum(myArray1) == 15);
    //
    // int[] myArray2 = {0, 1, 2, 3, 4, 5, 6};
    // System.out.println(myAnswers.sum(myArray2) == 21);
    //
    // int[] myArray3 = {0, 1, 2, 3, 4, 5, -5};
    // System.out.println(myAnswers.sum(myArray3) == 10);
    //
    // int[] myArray4 = {-10};
    // System.out.println(myAnswers.sum(myArray4) == -10);
    //
    // int[] myArray5 = {};
    // System.out.println(myAnswers.sum(myArray5) == 0);


    // --- The following are to test largest() ---
    // int[] myArray1 = {0, 1, 2, 3, 4, 5};
    // System.out.println(myAnswers.largest(myArray1) == 5);
    //
    // int[] myArray2 = {10, 73, 2};
    // System.out.println(myAnswers.largest(myArray2) == 73);
    //
    // int[] myArray3 = {};
    // System.out.println(myAnswers.largest(myArray3) == 0);
    //
    // int[] myArray4 = {-10, 10, 12, 5};
    // System.out.println(myAnswers.largest(myArray4) == 12);
    //
    // int[] myArray5 = {-10};
    // System.out.println(myAnswers.largest(myArray5) == -10);


    // --- The following are to test sumRows() ---
    // int[][] myMatrix1 = {{10, 1, 2}, {1, 2}, {5}};
    // int[] answer1 = {13, 3, 5};
    // System.out.println(Arrays.equals(myAnswers.sumRows(myMatrix1), answer1));
    //
    // int[][] myMatrix2 = {{-9}, {1, 2, 4}, {5, -5}};
    // int[] answer2 = {-9, 7, 0};
    // System.out.println(Arrays.equals(myAnswers.sumRows(myMatrix2), answer2));
    //
    // int[][] myMatrix3 = {{}, {}, {}};
    // int[] answer3 = {0, 0, 0};
    // System.out.println(Arrays.equals(myAnswers.sumRows(myMatrix3), answer3));
    //
    // int[][] myMatrix4 = {{}, {1, -1}, {0}};
    // int[] answer4 = {0, 0, 0};
    // System.out.println(Arrays.equals(myAnswers.sumRows(myMatrix4), answer4));
    //
    // int[][] myMatrix5 = {{10, 13, 12}, {11, 24}, {15, 16}};
    // int[] answer5 = {35, 35, 31};
    // System.out.println(Arrays.equals(myAnswers.sumRows(myMatrix5), answer5));


    // --- The following are to test largestInRows() ---
    // int[][] myMatrix1 = {{10, 1, 2}, {1, 2}, {5}};
    // int[] answer1 = {10, 2, 5};
    // System.out.println(Arrays.equals(myAnswers.largestInRows(myMatrix1), answer1));
    //
    // int[][] myMatrix2 = {{-9}, {1, 4, 2}, {5, -5}};
    // int[] answer2 = {-9, 4, 5};
    // System.out.println(Arrays.equals(myAnswers.largestInRows(myMatrix2), answer2));
    //
    // int[][] myMatrix3 = {{-9}, {-8, -10}, {-10, -5}};
    // int[] answer3 = {-9, -8, -5};
    // System.out.println(Arrays.equals(myAnswers.largestInRows(myMatrix3), answer3));
    //
    // int[][] myMatrix4 = {{12}, {1, -1}, {0}};
    // int[] answer4 = {12, 1, 0};
    // System.out.println(Arrays.equals(myAnswers.largestInRows(myMatrix4), answer4));
    //
    // int[][] myMatrix5 = {{10, 13, 12}, {11, 24}, {15, 16}};
    // int[] answer5 = {13, 24, 16};
    // System.out.println(Arrays.equals(myAnswers.largestInRows(myMatrix5), answer5));


    // --- The following are to test sum() with the argument being a matrix ---
    int[][] myMatrix1 = {{10, 1, 2}, {1, 2}, {5}};
    System.out.println(myAnswers.sum(myMatrix1) == 21);

    int[][] myMatrix2 = {{-9}, {1, 2, 4}, {5, -5}};
    System.out.println(myAnswers.sum(myMatrix2) == -2);

    int[][] myMatrix3 = {{}, {}, {}};
    System.out.println(myAnswers.sum(myMatrix3) == 0);

    int[][] myMatrix4 = {{}, {1, -1}, {0}};
    System.out.println(myAnswers.sum(myMatrix4) == 0);

    int[][] myMatrix5 = {{10, 13, 12}, {11, 24}, {15, 16}};
    System.out.println(myAnswers.sum(myMatrix5) == 101);

  }
}
