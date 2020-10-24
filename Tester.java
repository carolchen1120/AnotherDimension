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
    int[] myArray1 = {0, 1, 2, 3, 4, 5};
    System.out.println(myAnswers.largest(myArray1) == 5);

    int[] myArray2 = {10, 73, 2};
    System.out.println(myAnswers.largest(myArray2) == 73);

    int[] myArray3 = {};
    System.out.println(myAnswers.largest(myArray3) == 0);

    int[] myArray4 = {-10, 10, 12, 5};
    System.out.println(myAnswers.largest(myArray4) == 12);

    int[] myArray5 = {-10};
    System.out.println(myAnswers.largest(myArray5) == -10);

  }
}
