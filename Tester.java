public class Tester {
  public static void main(String[] args) {
    ArrayOps myAnswers = new ArrayOps();
    int[] myArray1 = {0, 1, 2, 3, 4, 5};
    System.out.println(myAnswers.sum(myArray1) == 15);

    int[] myArray2 = {0, 1, 2, 3, 4, 5, 6};
    System.out.println(myAnswers.sum(myArray2) == 21);

    int[] myArray3 = {0, 1, 2, 3, 4, 5, -5};
    System.out.println(myAnswers.sum(myArray3) == 10);

    int[] myArray4 = {-10};
    System.out.println(myAnswers.sum(myArray4) == -10);

    int[] myArray5 = {};
    System.out.println(myAnswers.sum(myArray5) == 0);
  }
}
